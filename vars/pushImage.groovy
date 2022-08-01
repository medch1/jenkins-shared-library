def call (String tag ){

    sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
    sh 'docker push medch1/simpleapp '

}