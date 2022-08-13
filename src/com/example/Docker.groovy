package com.example

class Docker implements Serializable {
    def script
    Docker(script){
        this.script = script
    }

    def buildDockerImage(String tag){
        script.app = script.docker.build("medch1/"+tag, " .")

    }

    def pushDockerImage(String tag){
        script.sh "echo $script.DOCKERHUB_CREDENTIALS_PSW | docker login -u $script.DOCKERHUB_CREDENTIALS_USR --password-stdin"
        script.sh "docker push medch1/$tag "
    }

}