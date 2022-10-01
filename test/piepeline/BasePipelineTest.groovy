package piepeline

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import util.Logger


class BasePipelineTest {
    BasePipeline basePipeline = new BasePipeline(this)

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName('test test')
    void tt() {
        Logger.info("tt: hello")
    }
}