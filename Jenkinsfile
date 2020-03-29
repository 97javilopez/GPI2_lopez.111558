pipeline {
	agent{label 'master'} 
	stages{
		stage('Prueba'){ 
			dir('simple'){
				mvn compile
				mvn test
				mvn validate
				mvn verify
			}
		}
	} 
}
