## Requirements

- JDK 1.8+
- GraalVM

## Building

Launch the Maven build on the checked out sources of this demo:

> ./mvnw package

### Running

Write the command in terminal:
> ./mvnw compile quarkus:dev

After compiling, navigate to the port: http://localhost:8080/randomname
    - Refresh and see a new Random Name generated