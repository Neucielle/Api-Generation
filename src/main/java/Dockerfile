FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean package -Pprod -DskipTests

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /target/Api-Generation-1.0.0.jar generation.jar

ENTRYPOINT [ "java", "-jar", "generation.jar" ]
