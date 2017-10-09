package com.example.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


@Slf4j
@Feature("Sample feature")
@Story("Sample story over class")
@Tag("main")
public class MainTest {

    @Test
    @DisplayName("Failed test")
    public void failedTest() {
        assertTrue(false);
    }

    @Test
    @DisplayName("Ignore test")
    public void ignoreTest() {
        assertTrue(false);
    }

    @Test
    @DisplayName("Assume test")
    public void assumeTest() {
        assumeTrue(false);
    }

    @Test
    @DisplayName("Good test")
    public void simpleTest() {
        log.info("Yeah!");
    }

    @Test
    @DisplayName("Error test")
    public void errorTest() {
        throw new Error("Error");
    }

    /**
     * Javadoc
     */
    @Test
    @DisplayName("JavaDoc test")
    @Description(useJavaDoc = true)
    public void javaDocDescriptionTest() {
    }

    @Test
    @DisplayName("Simple description")
    @Description("Simple description and more..")
    public void descriptionTest() {
    }

    @Test
    @Story("Simple story")
    @DisplayName("Story test")
    public void storyTest() {
    }
}

