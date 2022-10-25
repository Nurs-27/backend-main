FROM openjdk:17-alpine
EXPOSE 8080
RUN apk update
RUN apk add maven
RUN apk add --upgrade maven
RUN mvn -version
WORKDIR back
COPY . .
RUN mvn clean install