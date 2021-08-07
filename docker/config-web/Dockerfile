FROM tomcat:9.0.35-jdk8-openjdk-slim

LABEL author="Roberto"
LABEL data="06/08/2021"

#Transfer the war file to Tomcat inside the image
COPY ./test-web.war /usr/local/tomcat/webapps/test-web.war

#Good practice - just for documentation
EXPOSE 8080

#execute tomcat inside the container
CMD ["catalina.sh", "run"]

