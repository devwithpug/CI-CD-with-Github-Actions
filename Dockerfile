FROM gradle:7.0.0-jdk11-openj9 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:17-ea-11-jdk-slim
EXPOSE 8080
VOLUME /tmp
COPY --from=build /home/gradle/src/build/libs/*.jar application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]