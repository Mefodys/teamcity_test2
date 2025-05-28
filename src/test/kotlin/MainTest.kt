import org.example.foo
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun foo_test() {
      foo(1)
        assertEquals(foo(1), 2)
    }

}