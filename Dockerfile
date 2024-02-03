FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/ec2-jenkins-0.0.1-SNAPSHOT.jar ec2-jenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ec2-jenkins-0.0.1-SNAPSHOT.jar"]