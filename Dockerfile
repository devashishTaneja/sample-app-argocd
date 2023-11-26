FROM openjdk:17-jdk-alpine3.14
RUN mkdir -p /sample-app
COPY build/libs/sampleapp-0.0.1-SNAPSHOT.jar /sample-app/sample-app.jar
ENTRYPOINT ["java", "-jar", "/sample-app/sample-app.jar"]