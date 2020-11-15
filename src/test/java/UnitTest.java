import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class UnitTest {

    @Test
    public void substringGets() {
        getSmallestAndLargest("welcomeToJava", 3);
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] sArr = new String[10];

        java.util.List<String> subStrings = new java.util.ArrayList<String>();
        for (int i = 0; i <= s.length() - k; i++) {
            subStrings.add(s.substring(i,i+k));
        }
        subStrings.sort((a,b)-> a.compareTo(b));
        smallest = subStrings.get(0);
        subStrings.size();
        largest = subStrings.get(subStrings.size() - 1);
        return smallest + "\n" + largest;
    }

    @Ignore
    public void tryThisOut() {

        class MyClass extends Thread {
            public void run() {
                System.out.println("This code is running in a thread");
            }
        }

        MyClass thread = new MyClass();
        thread.start();
        System.out.println("This code is outside of the thread");

        // for runnable, must do:
        // Runnable runnable = new MyClass();
        // Thread thread = new Thread(runnable);
    }
}
