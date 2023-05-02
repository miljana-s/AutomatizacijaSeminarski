FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/automatizacija-projekat-1.0-SNAPSHOT.jar /app/
CMD ["java", "-jar", "automatizacija-projekat-1.0-SNAPSHOT.jar"]