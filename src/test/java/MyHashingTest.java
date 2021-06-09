import org.junit.*;

import static org.junit.Assert.*;

public class MyHashingTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // test that empty constructor runs without error
    @Test(timeout=50)
    public void testEmptyConstructor() {
        new MyHashing();
    }

    // test that constructor taking an int runs without error
    @Test(timeout=50)
    public void testConstructor() {
        new MyHashing(70);
    }

    // test hashing(int)
    @Test(timeout=50)
    public void testHashing1() {
        MyHashing h = new MyHashing();
        assertEquals("Should return the previous seed value\n",
                100, h.hash(40));
    }

    // test hashing(int)
    @Test(timeout=50)
    public void testHashing2() {
        MyHashing h = new MyHashing(7);
        assertEquals("Should return the previous seed value\n",
                7, h.hash(40));
        assertEquals("Should have stored 40 into the seed previously\n",
                40, h.hash(100));
    }

    // test hashing(String) with empty String
    @Test(timeout=50)
    public void testHashing3() {
        MyHashing h = new MyHashing();
        assertEquals("Should return 0 for an empty string\n",
                0, MyHashing.hash(""));
    }

    // test hashing(String)
    @Test(timeout=50)
    public void testHashing4() {
        assertEquals("Should return the sum of the ascii values of" +
                "the input string\n",
                317, MyHashing.hash("ted"));
    }

    // test hashing(char)
    @Test(timeout=50)
    public void testHashing5() {
        MyHashing h = new MyHashing(7);
        assertEquals("Should return " +
                "(previous seed value + new seed) % MODULO\n",
                20, h.hash('a'));
    }
}
