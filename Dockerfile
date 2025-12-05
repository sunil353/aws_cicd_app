# Use the official OpenJDK 17 image from AWS Public ECR
FROM public.ecr.aws/eclipse-temurin/temurin:17-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the compiled Java application JAR file into the container
COPY ./target/course-service.jar /app

# Expose the port the Spring Boot application will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "course-service.jar"]
