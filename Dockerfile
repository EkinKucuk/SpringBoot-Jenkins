FROM openjdk:8-jre-alpine
WORKDIR /app
COPY  target/SpringBoot-Jenkins-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "SpringBoot-Jenkins-0.0.1-SNAPSHOT.jar"]
