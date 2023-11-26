FROM openjdk:17-jdk-alpine3.14
RUN mkdir -p /sample-app
COPY target/sample-app-1.0.0.jar /sample/sample-app.jar
ENTRYPOINT ["java", "/sample-app/sample-app.jar"]