FROM openjdk:8-alpine

LABEL author="Roberto"
LABEL data="06/08/2021"

WORKDIR /usr/local/bin

#Transfer the jar file to image
COPY ./test-app-1.0.jar test.jar

#execute simple java application inside the container
CMD ["java", "-jar", "test.jar"]

