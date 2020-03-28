pipeline {
	agent{label 'master'} 
	stages{
		stage('Prueba'){ 
			mvn compile
			mvn test
			mvn validate
			mvn verify
		}
	} 
}
