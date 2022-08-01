def call (String tag ){

    app = docker.build("medch1/"+tag, " .")

}