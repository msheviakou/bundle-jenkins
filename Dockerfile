FROM openjdk:11
MAINTAINER Maksim Sheviakou
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
