FROM openjdk:23
VOLUME /tmp
COPY target/api.jar api.jar
ENTRYPOINT ["java","-jar","/api.jar"]
EXPOSE 8080