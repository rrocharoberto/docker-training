FROM postgres:12.3-alpine

LABEL author="Roberto"
LABEL data="06/08/2021"

ENV POSTGRES_DB=school
ENV POSTGRES_USER=school
ENV POSTGRES_PASSWORD=school123

#Transfer the database script file to the image
COPY ./script.sql /docker-entrypoint-initdb.d/script.sql

EXPOSE 5432

#execute postgres inside the container
CMD ["postgres"]

