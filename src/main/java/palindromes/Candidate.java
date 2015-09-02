package palindromes;

import java.util.*;

/**
 * encapsulates a palindrome.
 */
public class Candidate implements Comparable<Candidate> {
  final String s;
  final int i;

  /**
   * palindrome.
   * @param s palindrome string.
   * @param i palindrome index.
   */ 
  public Candidate(final String s, final int i) {
    this.s = s; this. i = i;
  }

  public String getString() {
    return s;
  }

  public int getIndex() {
    return i;
  }

  public int getLength() {
    return s.length();
  }

  /**
   * pretty print palindrome in required format.
   */ 
  public String toString() {
    return new StringBuilder()
        .append("Text: ").append(s)
        .append(", Index: ").append(i)
        .append(", Length: ").append(s.length())
        .toString();
  }

  public boolean equals(final Object o) {
    if(!(o instanceof Candidate)) return false;
    return s.equals(((Candidate) o).getString());
  }

  public int compareTo(final Candidate c) {
    return s.compareTo(c.getString());
  }

  public int hashCode() {
    return s.hashCode();
  }
}

