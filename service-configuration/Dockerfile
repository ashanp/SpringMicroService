FROM openjdk:21-jdk
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN chmod +x ./wait-for-it.sh
ENTRYPOINT ["./wait-for-it.sh","service-registry:8761","--","java","-jar","/usr/src/myapp/target/service-configuration-1.0-SNAPSHOT.jar","--spring.config.location=/usr/src/myapp/src/main/resources/application.yml"]
#CMD ["java","-jar","/usr/src/myapp/target/service-configuration-1.0-SNAPSHOT.jar","--spring.config.location=/usr/src/myapp/src/main/resources/application.yml"]