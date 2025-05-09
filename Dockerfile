FROM amazoncorretto:17-alpine3.21-jdk
COPY target/*.jar /home/app.jar
WORKDIR /home
ENV SERVER_PORT=8181
EXPOSE ${SERVER_PORT}
CMD ["java","-jar","app.jar"]