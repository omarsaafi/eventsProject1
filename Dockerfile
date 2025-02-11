FROM openjdk:8
EXPOSE 8089
WORKDIR /app
ADD target/eventsProject-1.0.0-SNAPSHOT.jar eventsProject-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "eventsProject-1.0.0-SNAPSHOT.jar"]
