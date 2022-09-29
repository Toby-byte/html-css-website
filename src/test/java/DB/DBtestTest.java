package DB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DBtestTest {

    @Test
    void testJDBC() {
    DBtest dBtest = new DBtest();
    assertEquals(" 1 : Tobias 2 : Frederik", dBtest.testJDBC());
    }
}