FROM openjdk:17
COPY ./target/CalculatorApp-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","CalculatorApp-1.0-SNAPSHOT.jar"]
