package junit;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;

public class FirstJUnitTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("=== Выполняется перед всеми тестами ===");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("=== Выполняется после всех тестов ===");
    }

    @BeforeEach
    void openBrowser() {
        System.out.println("Метод выполняется перед каждым тестом");
        //Selenide.open("https://ya.ru");
    }

    @AfterEach
    void closeBrowser() {
        System.out.println("Метод выполняется после каждого теста");
        //Selenide.closeWebDriver();
    }

    @Test
    void simpleFirstTest() {
        System.out.println("    Первый простой тест");
    }

    @Test
    void simpleSecondTest() {
        System.out.println("    Второй простой тест");
    }
}
