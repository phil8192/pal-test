package palindromes;

import java.util.*;

/**
 * palindromes impl.
 */
public final class Pal {

  public Pal() {}

  /**
   * check if an array of strings is a palindrome.
   *
   * checks if a string is "symmetric": first element must be equal to the last
   * element, next element must be equals to last-1 element and so forth.
   *
   * @param s an array of strings.
   * @return true or false.
   */ 
  public boolean isPal(final String[] s) {
    for(int i = 0, j = s.length-1; i <= j; i++, j--) 
      if(!s[i].equalsIgnoreCase(s[j])) return false;
    return true;
  }

  /**
   * check if a string is a palindrome.
   * @param s string.
   * @return true or false.
   */
  public boolean isPal(final String s) {
    final String[] split = stringToArray(s);
    return isPal(split);
  }

  /**
   * convert a string to a string array.
   * @param s the string to convert.
   * @return an array where array.length() == string.length.
   */ 
  private String[] stringToArray(final String s) {
    final String[] split = s.split("");
    return Arrays.copyOfRange(split, 1, split.length);
  }

  /**
   * find the top N unique palindromes in a string.
   *
   * a string is a palindrome if it is symmetric:
   * reverse(string) == string.
   *
   * a palendrome is unique if it is not a duplicate. for example, the subject
   * string "abbbba" constsists of the following unique palindromes:
   *
   * abbbba (the string itself)
   * bbbb (the next biggest palendrome)
   * bbb (the 3rd biggest)
   * bb (the 4th biggest)
   * a 
   * b
   *
   * bbb, bb, a, and b, are reported once, as per the property of uniqueness.
   *
   * individial characters are themselves palindromes since they possess the 
   * symmetric property.
   *
   * note that in the above example, the subject string "abbbba" could be
   * considered the only possible palindrome as per a stricter definition of
   * _uniqueness_ in which prohibits overlap: bbbb is a subset of abbbba and
   * would not be permited in this case. this implementation assumes the former
   * definition of "uniqueness"; related to the result set.
   *
   * @param s the subject string.
   * @param n limit on number of unique found palindromes.
   * @return an array of @see Candidate palindrome objects.
   */ 
  public Candidate[] getTopNpalindromes(final String s, final int n) {
    if(s == null || s.length() == 0 || n <= 0) return new Candidate[0];
    final Set<Candidate> cset = new LinkedHashSet<Candidate>(); 
    final int len = s.length();
    for(int range = len; range > 0; range--) {
      for(int i = 0, j = range; j <= len; i++, j++) {
        if(cset.size() == n) break;
        final String sub = s.substring(i, j); 
        if(isPal(sub)) cset.add(new Candidate(sub, i));
      }   
    }
    return cset.toArray(new Candidate[0]);
  }

  /**
   * entry point.
   */
  public static void main(final String args[]) {
    if(args.length == 0) {
      System.err.println("supply a string.");
      System.exit(0);
    }
    final int N = 3;
    final Pal p = new Pal();
    final Candidate[] ca = p.getTopNpalindromes(args[0], N);
    for(int i = 0; i < ca.length; i++)
      System.out.println(ca[i]);
    System.exit(0);
  }
}

