FROM openjdk:8-jdk-alpine
MAINTAINER "rafael.alberto1703@gmail.com"
ADD build/libs/*.jar /app/app.jar
CMD java -jar /app/app.jar $APP_OPTIONS