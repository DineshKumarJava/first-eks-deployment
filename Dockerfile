FROM openjdk:8
MAINTAINER "Dinesh kumar Learn365@User.com"
EXPOSE 8081
WORKDIR /usr/local/bin/
COPY target/first-eks-deployment-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","first-eks-deployment-0.0.1-SNAPSHOT.jar"]