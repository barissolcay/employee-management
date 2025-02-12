# Employee Management

Employee Management is a project designed to manage tasks assigned to employees within an organization. The system provides REST APIs for creating, retrieving, and managing tasks.

## Project Overview

Employee Management is developed using Java and Spring Boot. It provides functionalities for creating tasks, retrieving all tasks, and managing task data using a RESTful API.

### Features

The project includes:
1. **Task Management**: Creating, retrieving, and managing tasks.
2. **REST API**: Provides RESTful endpoints for interacting with the task data.
3. **Unit Tests**: Includes unit tests for the service and controller layers.
4. **Integration Tests**: Includes integration tests for the REST API.

## Technologies Used

- **Java**: The primary programming language used for developing the employee management system.
- **Spring Boot**: Framework used to create stand-alone, production-grade Spring-based applications.
- **JUnit**: Testing framework used for unit and integration tests.
- **Maven**: Build automation tool used for managing project dependencies and build lifecycle.

## Project Structure

The project structure includes several directories and files organized as follows:

- **`src/main/java/com/example/employeemanagement`**: Contains the main application and configuration files.
- **`src/main/java/com/example/employeemanagement/controller`**: Contains the REST controller classes.
- **`src/main/java/com/example/employeemanagement/model`**: Contains the model classes.
- **`src/main/java/com/example/employeemanagement/service`**: Contains the service classes.
- **`src/test/java/com/example/employeemanagement`**: Contains the unit and integration test classes.
- **`pom.xml`**: Maven configuration file.
- **`mvnw` and `mvnw.cmd`**: Maven wrapper scripts.

## Usage

### Prerequisites

To run the project, you need to have the following installed:
- **Java Development Kit (JDK) 17**: Ensure you have JDK 17 installed on your system.
- **Maven**: Ensure you have Maven installed on your system.

### Running the Project

1. Clone the repository:

    ```bash
    git clone https://github.com/barissolcay/employee-management.git
    cd employee-management
    ```

2. Build the project using Maven:

    ```bash
    ./mvnw clean install
    ```

3. Run the Spring Boot application:

    ```bash
    ./mvnw spring-boot:run
    ```

    The application will start and be available at `http://localhost:8080`.

## REST API Endpoints

- **Create Task**: `POST /api/tasks/add`
  - Request Body: `{ "name": "Task Name", "description": "Task Description" }`
  - Response: `201 Created`

- **Get All Tasks**: `GET /api/tasks/list`
  - Response: `200 OK` with a list of tasks.

## Running Tests

To run the unit and integration tests, use the following command:

```bash
./mvnw test
```

## License

MIT License

```markdown
MIT License

Copyright (c) 2025 Baris Solcay

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
