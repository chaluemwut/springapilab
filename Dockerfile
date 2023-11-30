FROM openjdk:21
VOLUME /tmp
COPY target/api.jar api.jar
ENTRYPOINT ["java","-jar","/api.jar"]
EXPOSE 8080