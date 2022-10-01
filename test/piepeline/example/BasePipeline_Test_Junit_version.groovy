package piepeline.example

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import piepeline.BasePipeline
import util.Logger

class BasePipeline_Test_Junit_version {
    BasePipeline basePipeline
    @BeforeEach
    void setupSpec() {
        Logger.info("setup: called")
    }

    @Test
    void hello() {
        basePipeline.test()
    }
}
