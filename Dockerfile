FROM openjdk:17
EXPOSE 8082
WORKDIR /app
ADD target/events-project-5.0.0.jar events-project-5.0.0.jar
ENTRYPOINT ["java", "-jar", "events-project-5.0.0.jar"]
