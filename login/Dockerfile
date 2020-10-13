FROM openjdk:8-jdk-alpine
MAINTAINER Santiago
VOLUME /tmp
EXPOSE 4567
ADD build/libs/login-0.0.1-SNAPSHOT.jar login.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/login.jar"]