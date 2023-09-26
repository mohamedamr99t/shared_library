def call() {

try {

sh 'sudo apt-get update'

sh 'sudo apt-get install -y nginx'

echo 'Nginx installed successfully.'

 } catch (Exception e) {

error("Error installing Nginx: ${e.message}")

 }

}
