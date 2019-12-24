FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD build/libs/*.jar /app/app.jar
CMD java -jar /app/app.jar $APP_OPTIONS