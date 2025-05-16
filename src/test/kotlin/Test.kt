import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import test.Test
var test = Test()


class AddTest: DescribeSpec({

    describe("Add") {
        it("test"){
            test.add(1, 1) shouldBe 2
        }
    }

})