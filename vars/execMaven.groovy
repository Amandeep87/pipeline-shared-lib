def call(String options = '-v') { //define a function called call. string input paramter has a default value
    sh "mvn ${options}" 
}
