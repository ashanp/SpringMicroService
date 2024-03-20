FROM openjdk:21-jdk
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
CMD ["java","-jar","/usr/src/myapp/target/service-registry-1.0-SNAPSHOT.jar","--spring.config.location=/usr/src/myapp/src/main/resources/application.yaml"]