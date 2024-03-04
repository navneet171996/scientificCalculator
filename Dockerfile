FROM openjdk:17

# Install necessary X11 libraries
RUN yum update -y && yum install -y libXext

COPY ./target/CalculatorApp-1.0-SNAPSHOT.jar ./
WORKDIR ./

CMD ["java","-jar","CalculatorApp-1.0-SNAPSHOT.jar"]
