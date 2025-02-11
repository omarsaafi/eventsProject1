FROM openjdk:8
EXPOSE 8089
WORKDIR /app
ADD target/events-project-5.0.0.jar events-project-5.0.0.jar
ENTRYPOINT ["java", "-jar", "events-project-5.0.0.jar"]