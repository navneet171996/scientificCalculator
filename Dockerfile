FROM openjdk:17

# Install necessary X11 libraries
RUN apt-get update && apt-get install -y libxext6

COPY ./target/CalculatorApp-1.0-SNAPSHOT.jar ./
WORKDIR ./

CMD ["java","-jar","CalculatorApp-1.0-SNAPSHOT.jar"]
