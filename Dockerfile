FROM openjdk:17
EXPOSE 8082
WORKDIR /app
ADD target/tp-foyer-5.0.0.jar tp-foyer-5.0.0.jar
ENTRYPOINT ["java", "-jar", "events-project-5.0.0.jar"]