FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD target/docker-demo.jar docker-demo.jar

ENTRYPOINT [ "java","-jar","docker-demo.jar" ]