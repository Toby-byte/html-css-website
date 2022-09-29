package DB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DBtestTest {


    void testJDBC() {
    DBtest dBtest = new DBtest();
    assertEquals("1 : Tobias 2 : Frederik", dBtest.testJDBC());
    }
}