import com.example.Docker

def call (String tag ){
    return new Docker(this).buildDockerImage(tag)
}