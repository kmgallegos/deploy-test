FROM amazoncorretto:17-alpine-jdk
MAINTAINER playd
COPY target/HelpYou-0.0.1-SNAPSHOT.jar HelpYouServicesBackend.jar
ENTRYPOINT ["java", "-jar", "/HelpYouServicesBackend.jar"]
