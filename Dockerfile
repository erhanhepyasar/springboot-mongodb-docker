FROM openjdk:8
ADD target/springboot-docker.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","app.jar"]