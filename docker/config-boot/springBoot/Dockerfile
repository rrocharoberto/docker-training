FROM openjdk:8-alpine

LABEL author="Roberto"
LABEL data="06/08/2021"

WORKDIR /usr/local/bin

#Transfer the war file to the image
COPY ./test-boot-1.0.jar boot.jar

#execute java spring application inside the container
CMD ["java", "-Dspring.profiles.active=docker", "-jar", "boot.jar"]
