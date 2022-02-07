FROM openjdk:8
ADD target/docker2-0.0.1-SNAPSHOT.jar docker2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","docker2-0.0.1-SNAPSHOT.jar"]