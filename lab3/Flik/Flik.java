/** An Integer tester created by Flik Enterprises. */
public class Flik {
    // change '==' to '.equal()'
    public static boolean isSameNumber(Integer a, Integer b) {
        return a.equals(b);
    }

    /* Bug:
     Integer is the wrapper class of int and is Object compared by reference
     The JVM is caching Integer values. == only works for numbers between -128 and 127
     In this range references will be the same as autoboxing uses Integer.valueOf() which caches small integers
     */
}
