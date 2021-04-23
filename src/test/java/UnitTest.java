import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Ignore;
import org.junit.Test;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.*;

public class UnitTest {

    @Ignore
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

    // must be static (if internal class), must be private, must have public getters
    static public class Car {
        private String color;
        private String type;

        public String getColor() { return color;}
        public String getType() {return type;}
    }

    @Ignore
    public void testJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        var car = mapper.readValue(json, Car.class);
        var node = mapper.readTree(json);

        // to write to file directly:
        // mapper.writeValue(new File("target/car.json"), car);

        System.out.println(node.get("color").toString());
        String jsonCarArray =
                "[{ \"color\" : \"Black\", \"type\" : \"BMW\" }, { \"color\" : \"Red\", \"type\" : \"FIAT\" }]";

        node = mapper.readTree(jsonCarArray);
        System.out.println(node.get(1).get("color").toString());

    }

    /*@Ignore
    public void writeToFile() throws IOException {
        String content = "Hello World !!";

        Files.write(Paths.get("c:/output.txt"), content.getBytes());
    }

        //Get the file reference
        Path path = Paths.get("c:/output.txt");

        //Use try-with-resource to get auto-closeable writer instance
        try (BufferedWriter writer = Files.newBufferedWriter(path))
        {
            writer.write("Hello World !!");
        }
        */

    void treeMapTest() {
        var map = new TreeMap<String, Integer>( (l,r) -> l.compareTo(r));
        var y = map.floorKey("1");
        var x = map.ceilingEntry("1");
        x.getValue();
        for (var j : map.entrySet()) {

        }
        map.getOrDefault("s", 1);

    }

    @Test
    public void testx() {
        var x = new ArrayList<Integer>();
        // can't change the value of an Integer (can't change the value of anything by x = because pass by value), but
        // can change the value of anything in it, ie. x.val (but better using getter and setter to be explicit).
        // Always use getter and setter (or any fcn) to change value of something that is passed to another fcn
        incr(x);
        System.out.println(x.size());
    }

    void incr(List<Integer> x) {
        x.add(1);
        Deque<String> deque = new ArrayDeque<>();
        deque.a
    }

    static void decode() {

        List<Character[]> matrix = new ArrayList<Character[]>();
        StringBuilder contentBuilder = new StringBuilder();


        Scanner scanner = new Scanner(new File("filename"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            matrix.add(line.toCharArray());
        }
    }
}
