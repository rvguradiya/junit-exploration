package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * Test suite to run all test classes together.
 */
@Suite
@SelectClasses({
        CalculatorTest.class,
        StringUtilsTest.class,
        ParameterizedTest.class,
        AssertionsTest.class,
        LifecycleTest.class,
        ExceptionTest.class,
        MockingTest.class
})
public class TestSuite {
    // This class remains empty, used only as a holder for the above annotations
}
