FROM amazoncorretto:17-alpine3.21-jdk
COPY target/*.jar /home/app.jar
WORKDIR /home
EXPOSE 8181
CMD ["java","-jar","app.jar"]