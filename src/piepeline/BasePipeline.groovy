package piepeline

import util.Logger

class BasePipeline {
    def script

    BasePipeline(def script) {
        this.script = script
    }

    void test() {
        Logger.init(script)
        Logger.info("test: hello world")
    }
}
