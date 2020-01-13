FROM openjdk:8-alpine

COPY target/uberjar/weight_analyzer.jar /weight_analyzer/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/weight_analyzer/app.jar"]
