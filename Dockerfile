FROM openjdk:23-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ecomm-eureka-server.jar
ENTRYPOINT ["java","-jar","/ecomm-eureka-server.jar"]
EXPOSE 8761