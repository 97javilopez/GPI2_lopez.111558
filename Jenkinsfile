pipeline {
	agent{label 'master'} 
	stages{
		stage('Fetch repository'){
			git url: 'https://github.com/97javilopez/GPI2_lopez.111558'
		}
		stage('Prueba'){ 
			echo 'Compilando carpeta simple'
			dir('simple'){
				mvn compile
				mvn test
				mvn validate
				mvn verify
			}
		}
	} 
}
