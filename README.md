# JUnit Exploration

Welcome to the **JUnit Features Exploration** repository! This repository is designed to help you learn and experiment with the key features of the JUnit testing framework for Java applications.

## Overview
JUnit is a widely used testing framework for Java that makes it easy to write and run unit tests. This repository demonstrates the following features of JUnit:

- Assertions
- Parameterized Tests
- Test Lifecycle Methods
- Exception Testing
- Integration with Mockito for Mocking
- Test Suites
- Timeouts
- Tagging and Filtering Tests

Each feature is demonstrated in dedicated test files under the `src/test/java` directory.

## Repository Structure
```
junit-exploration/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/service/
│   │   │       ├── Calculator.java         # Sample class for testing
│   │   │       └── StringUtils.java        # Another sample class
│   └── test/
│       ├── java/
│       │   └── com/example/service/
│       │       ├── CalculatorTest.java     # JUnit test for Calculator
│       │       ├── StringUtilsTest.java    # JUnit test for StringUtils
│       │       ├── ParameterizedTest.java  # Demo of parameterized tests
│       │       ├── AssertionsTest.java     # Showcase of JUnit assertions
│       │       ├── LifecycleTest.java      # Tests for @BeforeEach, @AfterEach, etc.
│       │       ├── ExceptionTest.java      # Demonstration of exception handling
│       │       ├── MockingTest.java        # Integration with Mockito
│       │       └── TestSuite.java          # Test suite example
├── libs/
│   ├── junit-5.10.0.jar                    # JUnit library jar
│   └── mockito-core-5.5.0.jar              # Mockito jar for mocking
├── build.gradle                            # Gradle build file (dependencies included)
├── pom.xml                                 # Maven build file (if using Maven)
├── .gitignore                              # Ignore build, logs, etc.
├── README.md                               # This file
└── docs/
    ├── JUnit-Features.md                   # Documentation of explored features
    └── Test-Reports/                       # Folder for storing test reports
```

## Getting Started

### Prerequisites
- Java 8 or later
- A build tool (Gradle or Maven)

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/rvguradiya/junit-exploration.git
   cd JUnit-Features-Demo
   ```

2. Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).

3. Build the project using Gradle or Maven:
   ```bash
   # Gradle
   ./gradlew build

   # Maven
   mvn clean install
   ```

### Running Tests
- To run all tests:
  ```bash
  # Gradle
  ./gradlew test

  # Maven
  mvn test
  ```
- To run specific tests, use your IDE’s testing functionality or filter by tags (if configured).

### Dependencies
The project uses the following libraries:
- **JUnit 5**: For testing.
- **Mockito**: For mocking dependencies.

## Features

Refer to the [JUnit-Features.md](docs/JUnit-Features.md) file for a detailed description of each feature explored in this repository.

## Contributing
Contributions are welcome! If you have improvements or additional JUnit features to showcase, feel free to fork this repository, make changes, and submit a pull request.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

---

Happy Testing! 🚀

