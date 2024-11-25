#Group Details
#Pavan Sai Gopinadh Reddy Arimanda G01478272
#Venkat Dinesh Indupuri G01464737
#Nemali Sudheer Reddy G01410008
#Gunnampalli Datta Naga Vamseedhar G01478792

#This Dockerfile uses a multi-stage build: first, it builds a Maven project and packages it into a JAR file.
#Then, it copies the JAR file into a lightweight OpenJDK 17 image and sets it up to run as a Java application.

FROM maven:3.9.2 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests
FROM openjdk:17-slim

WORKDIR /app
COPY --from=build /app/target/sweassignment03-0.0.1-SNAPSHOT.jar ./app.jar
CMD ["java", "-jar", "app.jar"]
