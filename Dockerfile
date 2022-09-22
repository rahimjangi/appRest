FROM openjdk:11
EXPOSE 8080
ADD target/appRest.jar appRest.jar
ENTRYPOINT ["java", "-jar", "appRest.jar"]
