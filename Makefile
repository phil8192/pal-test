all: test jar
test: 
	mvn test
jar: 
	mvn clean compile assembly:single

