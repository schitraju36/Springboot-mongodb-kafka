FROM java:8-alpine
VOLUME /tmp
EXPOSE 8080
ADD /target/mongodb-0.0.1-SNAPSHOT.jar mongodb-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongo/springmongodb", "-jar",  "mongodb-0.0.1-SNAPSHOT.jar"]	