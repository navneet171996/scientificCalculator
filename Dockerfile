FROM openjdk:17
RUN apk update && \
    apk add --no-cache libxext
COPY ./target/CalculatorApp-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","CalculatorApp-1.0-SNAPSHOT.jar"]
