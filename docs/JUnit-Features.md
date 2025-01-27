# Exploring Key Features of JUnit

This document provides an overview of the key features of **JUnit**, along with examples and guidance on how to use them effectively. Each feature is demonstrated in the repository through corresponding test files.

---

## 1. **Assertions**
### Description
Assertions are used to validate expected outcomes during testing. JUnit provides a variety of assertion methods to ensure code behaves as expected.

### Common Methods
- `assertEquals(expected, actual)`
- `assertNotEquals(unexpected, actual)`
- `assertTrue(condition)`
- `assertFalse(condition)`
- `assertNull(object)`
- `assertNotNull(object)`
- `assertThrows(expectedException, executable)`

### Example
File: `AssertionsTest.java`
```java
@Test
void testAssertions() {
    assertEquals(10, 5 + 5, "Addition should result in 10");
    assertTrue("Hello".startsWith("H"), "String should start with 'H'");
    assertThrows(IllegalArgumentException.class, () -> {
        throw new IllegalArgumentException("Invalid argument");
    });
}
```

---

## 2. **Parameterized Tests**
### Description
Parameterized tests allow testing with multiple sets of input data, reducing redundancy and improving test coverage.

### Example
File: `ParameterizedTest.java`
```java
@ParameterizedTest
@ValueSource(ints = {2, 4, 6, 8})
void testEvenNumbers(int number) {
    assertTrue(number % 2 == 0, "Number should be even");
}

@ParameterizedTest
@CsvSource({"1,2,3", "2,3,5", "3,5,8"})
void testAddition(int a, int b, int result) {
    assertEquals(result, a + b);
}
```

---

## 3. **Test Lifecycle Methods**
### Description
JUnit provides annotations to manage setup and teardown logic for test cases, improving code reusability and clarity.

### Key Annotations
- `@BeforeAll` – Runs once before all tests (static method).
- `@AfterAll` – Runs once after all tests (static method).
- `@BeforeEach` – Runs before each test.
- `@AfterEach` – Runs after each test.

### Example
File: `LifecycleTest.java`
```java
@BeforeAll
static void setupAll() {
    System.out.println("Executed before all tests");
}

@BeforeEach
void setup() {
    System.out.println("Executed before each test");
}

@Test
void sampleTest() {
    assertTrue(true);
}

@AfterEach
void teardown() {
    System.out.println("Executed after each test");
}

@AfterAll
static void teardownAll() {
    System.out.println("Executed after all tests");
}
```

---

## 4. **Exception Testing**
### Description
JUnit allows you to test if specific exceptions are thrown during the execution of code.

### Example
File: `ExceptionTest.java`
```java
@Test
void testException() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        throw new IllegalArgumentException("Invalid argument");
    });
    assertEquals("Invalid argument", exception.getMessage());
}
```

---

## 5. **Integration with Mocking (Mockito)**
### Description
Mockito is often used with JUnit to create mock objects and define their behavior. This is helpful for testing components in isolation.

### Example
File: `MockingTest.java`
```java
@ExtendWith(MockitoExtension.class)
class MockingTest {

    @Mock
    private Dependency dependency;

    @InjectMocks
    private Service service;

    @Test
    void testMocking() {
        when(dependency.getData()).thenReturn("Mocked Data");

        String result = service.processData();

        assertEquals("Processed: Mocked Data", result);
        verify(dependency).getData();
    }
}
```

---

## 6. **Test Suites**
### Description
Test suites group multiple test classes, allowing them to run together as a single suite.

### Example
File: `TestSuite.java`
```java
@RunWith(Suite.class)
@Suite.SuiteClasses({
    CalculatorTest.class,
    StringUtilsTest.class
})
class TestSuite {
    // No additional code needed; annotations handle the suite.
}
```

---

## 7. **Timeouts**
### Description
JUnit provides ways to set timeouts for tests, ensuring they complete within a specified duration.

### Example
File: `TimeoutTest.java`
```java
@Test
@Timeout(1) // Test must complete within 1 second
void testWithTimeout() throws InterruptedException {
    Thread.sleep(500); // Simulate a delay
}
```

---

## 8. **Tagging and Filtering**
### Description
Tags allow categorizing tests, making it easier to filter and run specific groups of tests.

### Example
File: `TaggingTest.java`
```java
@Tag("fast")
@Test
void fastTest() {
    assertTrue(true);
}

@Tag("slow")
@Test
void slowTest() {
    assertTrue(true);
}
```
Run with filtering:
```bash
mvn test -Dgroups=fast
```

---

## Summary
The repository showcases essential features of JUnit to build robust and maintainable tests for Java applications. Refer to individual test files for detailed examples and implementation guidance.

