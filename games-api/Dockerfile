FROM alpine/java:21-jdk
MAINTAINER Elleined

ENV PORT=8045

ADD ./target/*.jar games-api.jar
EXPOSE 8045
CMD ["java", "-jar", "games-api.jar"]