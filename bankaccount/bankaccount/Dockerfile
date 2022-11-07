FROM openjdk:18-slim as build

COPY target/bankaccount-0.0.1-SNAPSHOT.jar bankaccount-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/bankaccount-0.0.1-SNAPSHOT.jar"]