package palindromes.test;

import palindromes.*;

import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;
import static org.testng.AssertJUnit.assertEquals;


public final class PalTest {

  final Pal p = new Pal();

  @Test
  public void testPalendrome() {
    assertTrue(p.isPal("a"));
    assertTrue(p.isPal("aa"));
    assertTrue(p.isPal("abba"));
    assertTrue(p.isPal("αννα"));
    assertFalse(p.isPal("Προαστιακός"));
    assertFalse(p.isPal("xy"));
    assertFalse(p.isPal("xxy"));
  }

  @Test
  public void testTop3() {

    Candidate[] ca = p.getTopNpalindromes(null, 3);
    assertNotNull(ca);
    assertEquals(ca.length, 0);

    ca = p.getTopNpalindromes("abba", -1);
    assertNotNull(ca);
    assertEquals(ca.length, 0);

    ca = p.getTopNpalindromes("abbbba", 3);
    assertNotNull(ca);
    assertEquals(ca.length, 3);
    assertEquals(ca[0].getString(), "abbbba");
    assertEquals(ca[0].getIndex(), 0);
    assertEquals(ca[0].getLength(), 6);
    assertEquals(ca[1].getString(), "bbbb");
    assertEquals(ca[1].getIndex(), 1);
    assertEquals(ca[1].getLength(), 4);
    assertEquals(ca[2].getString(), "bbb");
    assertEquals(ca[2].getIndex(), 1);
    assertEquals(ca[2].getLength(), 3);
    ca = null;

    ca = p.getTopNpalindromes("aba", 3);
    assertNotNull(ca);
    assertEquals(ca.length, 3);
    assertEquals(ca[0].getString(), "aba");
    assertEquals(ca[0].getIndex(), 0);
    assertEquals(ca[0].getLength(), 3);
    assertEquals(ca[1].getString(), "a");
    assertEquals(ca[1].getIndex(), 0);
    assertEquals(ca[1].getLength(), 1);
    assertEquals(ca[2].getString(), "b");
    assertEquals(ca[2].getIndex(), 1);
    assertEquals(ca[2].getLength(), 1);

    ca = p.getTopNpalindromes("aba", 3);
    assertNotNull(ca);
    assertEquals(ca.length, 3);
    assertEquals(ca[0].getString(), "aba");
    assertEquals(ca[0].getIndex(), 0);
    assertEquals(ca[0].getLength(), 3);
    assertEquals(ca[1].getString(), "a");
    assertEquals(ca[1].getIndex(), 0);
    assertEquals(ca[1].getLength(), 1);
    assertEquals(ca[2].getString(), "b");
    assertEquals(ca[2].getIndex(), 1);
    assertEquals(ca[2].getLength(), 1);

  }

}
 
