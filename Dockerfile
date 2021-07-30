FROM openjdk:8
ADD target/spring-boot-basic-app.jar spring-boot-basic-app.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "spring-boot-basic-app.jar"]
