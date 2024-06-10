FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/chars-0.0.1-SNAPSHOT.jar /app/chars.jar
EXPOSE 8080
CMD ["java", "-jar", "chars.jar"]