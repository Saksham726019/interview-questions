# Get the GCC preinstalled image from Docker Hub
FROM maven:3.8.1-openjdk-17

# Specify the working directory
WORKDIR /usr/src/

# Copy the current folder which contains C++ source code to the Docker image under /usr/src
COPY . .

# Use maven to package the jar assuming the tests passed
RUN mvn clean package

# Run the program output from the previous step
CMD ["java", "-jar", "target/lru-java-0.0.1.jar"]
