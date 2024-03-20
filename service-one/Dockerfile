FROM openjdk:21-jdk
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN chmod +x ./wait-for-it.sh
ENTRYPOINT ["./wait-for-it.sh","service-configuration:8888","--","java","-jar","/usr/src/myapp/target/service-one-1.0-SNAPSHOT.jar","--spring.config.location=/usr/src/myapp/src/main/resources/application.yml,/usr/src/myapp/src/main/resources/bootstrap.yml"]