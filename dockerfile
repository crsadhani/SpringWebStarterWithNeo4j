FROM openjdk:11-jdk
   COPY target/siemens.com-0.0.1.jar siemens.com-0.0.1.jar
   ENTRYPOINT ["java" ,"-jar", "/siemens.com-0.0.1.jar"]