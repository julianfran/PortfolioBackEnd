FROM amazoncorretto:11-alpine-jdk
MAINTAINER Julián-Franco
COPY target/julianfranco-0.0.1-SNAPSHOT.jar julianfranco-app.jar
ENTRYPOINT ["java", "-jar", "/julianfranco-app.jar"]
