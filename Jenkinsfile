#!groovy

import hudson.triggers.TimerTrigger

properties([
        buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '10', daysToKeepStr: '', numToKeepStr: '30')),
        [$class: 'ScannerJobProperty', doNotScan: false],
        [$class: 'ThrottleJobProperty', categories: ['distalk'], limitOneJobWithMatchingParams: false, maxConcurrentPerNode: 1, maxConcurrentTotal: 0, paramsToUseForLimit: '', throttleEnabled: true, throttleOption: 'category'],
        pipelineTriggers([cron('@midnight')])
])

node {
    catchError {
        // Mark the code checkout 'stage'....
        stage('Checkout') {
            // Get code from a repository
            //git url: 'https://git.anwb.nl/scm/hv/distalk.git', branch: '*/master', credentialsId: 'dc174c80-294f-4cfd-a4c3-e429b77dbf9f'
            checkout scm
        }

        // Mark the code build 'stage'....
        stage ('Build') {
            withEnv(["JAVA_HOME=${ tool 'JDK 8' }", "GRADLE_OPTS=-Xmx512M", "PATH+JAVA=${env.JAVA_HOME}/bin"]) {
                sh "./gradlew clean build cobertura --stacktrace --refresh-dependencies --console plain"
            }
        }
       
        if (isUserOrTimer(currentBuild.rawBuild.causes)) {
            stage ('Sonar') {
                withEnv(["JAVA_HOME=${ tool 'JDK 8' }", "GRADLE_OPTS=-Xmx1024M", "PATH+JAVA=${env.JAVA_HOME}/bin"]) {
                    sh "./gradlew sonarqube --stacktrace"
                }
            }
        }

        stage ('Publish') {
            step([$class: 'WarningsPublisher', consoleParsers: [[parserName: 'Java Compiler'], [parserName: 'Maven']]])
            step([$class: 'TasksPublisher', pattern: '**/*.xml, **/*.groovy, **/*.gsp, **/*.java', high: 'FIXME', normal: 'TODO'])
            step([$class: 'AnalysisPublisher', isWarningsActivated: true, isOpenTasksActivated: true])
        }

        stage ('Archive') {
            step([$class: 'ArtifactArchiver', artifacts: '**/build/libs/*.war', fingerprint: true])
            step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/**/*.xml'])
        }
    }
    step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: 'hbogaards@anwb.nl', sendToIndividuals: true])
}

@NonCPS
def isUserOrTimer(causes) {
   echo "${causes}"
   causes.any { cause -> cause.class in [Cause.UserIdCause, TimerTrigger.TimerTriggerCause] }
}
