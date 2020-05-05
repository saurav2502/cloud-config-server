FROM openjdk:14
ADD target/cloud-config-server.jar cloud-config-server.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "cloud-config-server.jar"]