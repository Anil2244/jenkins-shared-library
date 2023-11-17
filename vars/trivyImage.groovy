def call() {
    sh 'trivy image anildevops123/youtube:latest > trivyimage.txt'
}
