import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@Feature("Фича")
@Story("Стори")
@Slf4j
@Tag("main")
public class MainTest {

    /**
     * Javadoc
     */
    @Test
    @Description(useJavaDoc = true)
    public void failedTest() {
        assertTrue(false);
    }

    @Test
    @Disabled
    public void ignoreTest() {
        assertTrue(false);
    }

    @Test
    @DisplayName("display name")
    @Description("описание без жавадока")
    public void assumeTest() {
        assumeTrue(false, "bcs i can");
    }

    @Test
    public void simpleTest() {
        log.info("Yeah!");
    }

    @Test
    public void errorTest() {
        throw new Error("Error");
    }
}
