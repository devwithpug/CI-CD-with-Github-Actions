FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
COPY build/libs/CI-CD-with-Github-Actions-0.0.1-SNAPSHOT.jar CICDGithubActions.jar
ENTRYPOINT ["java", "-jar", "CICDGithubActions.jar"]