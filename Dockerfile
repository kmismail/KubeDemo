FROM openjdk:14-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} KubeDemo.jar
ENTRYPOINT ["java","-jar","/KubeDemo.jar"]
