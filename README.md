## test stuff

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
System.out.println(cars.length);
for (type variable : arrayname) {
  ...
}

int newSize = elements.length * 2;
elements = Arrays.copyOf(elements, newSize);


Arrays.sort(carts)
Arrays.binarySearch()

// List
    List<Human> humans = Lists.newArrayList(
      new Human("Sarah", 10), 
      new Human("Jack", 12)
    );
//previously:
Collections.sort(blah)

// using lambda (note list has sort after Java 8)
humans.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));

// can use comparator as well, kinda long (also note, define class in the function
    Collections.sort(humans, new Comparator<Human>() {
        @Override
        public int compare(Human h1, Human h2) {
            return h1.getName().compareTo(h2.getName());
        }
    });

positive if 1 is greater than 2, 0 if equals
```

ArrayList -> Implements List -> Extends Collection
Stack
LinkedList
add(), addAll(),size(), clear(), remove(index or element), get(index), set(index, element), indexOf(element), lastIndexOf, isEmpty(), contains(), sort(comparator)

Deque (double ended queue, can be stack or queue) extends Queue

PriorityQueue (class) implements Queue

LinkedList and ArrayDeque implement Deque
AddFirst, AddLast, contains, getFirst, getLast, peekFirst, peekLast, pollFirst, pollLast, (pop, push)
also offer functions that don't throw like add

Queue:
use PriorityQueue and LinkedList

Trie
```java
public class TrieNode {
    private HashMap<Character, TrieNode> children;
    private String content;
    private boolean isWord;
    
   // ...
}

public class Trie {
    private TrieNode root;
    //...
}
```

Map->HashMap, LinkedHashMap
SortedMap->TreeMap
TreeMap is sorted by default ordering.



LinkedHashMap has predictable ordering, preserved insertion order
Inline-style: 
![alt text](docs/maps.png "Logo Title Text 1")

Concurrency:
```java
ExecutorService exService = Executors.newCachedThreadPool():
// Removes threads that are idle for more than a minute
// best for when we are dealing with a reasonable number of short lived tasks
CompletableFuture:

CompletableFuture<String> future
  = CompletableFuture.supplyAsync(() -> "Hello");

// runAsync for void
CompletableFuture<Void> future = CompletableFuture.runAsync

// Can use thenApply to do further processing when data arrives
CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
}).thenApply(name -> {
    return "Hello " + name;
}).thenApply(greeting -> {
    return greeting + ", Welcome to the CalliCoder Blog";
});

// Old school:
//for void
executorService.execute(runnableTask);
// or if returns: 
Future<String> future = 
  executorService.submit(callableTask);

	Runnable runnableTask = () -> {
    try {
        TimeUnit.MILLISECONDS.sleep(300);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
};
 
Callable<String> callableTask = () -> {
    TimeUnit.MILLISECONDS.sleep(300);
    return "Task's execution";
};

// alternatively, with java 7
    private class RunnableImpl implements Runnable {
        public void run() 
        { /...    } 
    } 

//otherway:
void increment() {
    count = count + 1;
}
ExecutorService executor = Executors.newFixedThreadPool(2);

IntStream.range(0, 10000).forEach(i -> executor.submit(this::increment));
stop(executor);
System.out.println(count);  // 9965

// can extend thread
public class MyClass extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
// or implement runnable
public class MyClass implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
// and then start as such:
  public static void main(String[] args) {
    MyClass thread = new MyClass();
    thread.start(); // if it is a thread, not if it is a runnable!
    System.out.println("This code is outside of the thread");

    // if runnable:
    Thread thread = new Thread(new MyClass());
    thread.start(); 
  }
thread.join() // waits until thread is complete
```

Exceptions

Throwable
* Error
* Exception
    * RuntimeException (unchecked, unexpected)
    * IOException (checked, forces you to handle)
    
```java
try {}
catch (ex 1 | ex2 e)
finally {}
```

// casting
```java
Integer.toString()
String.valueOf()
Integer.valueOf()
Integer.parseInt()

if (animal instanceof Cat) {
    ((Cat) animal).meow();
}

// if you don't do instance of, you get a ClassCastException
```

Hackerrank
```java
// Read from inputstream = scanner
Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
```

hashCode() and equals()
Objects that are equal (according to their equals()) must return the same hash code. It's not required for different objects to return different hash codes.
Basic Hashing, just return 1, better, multiply each object (int/hashCode), better, mutiply by prime number

notify/wait
```java
synchronized(this) //creates lock on the shared resource
{
    wait() //releases the lock on the shared resource and waits until someother method invokes notify
}

synchronized(this) //creates lock on the shared resource
{
    notify() // notify allows the waiting thread to continue
}
// must call notify, or the wait will wait forever, can use wait(long timeout)
```

JAVA SPLIT:
String s = " ,ab;gh,bc;pq#kk$bb";
String[] str = s.split("[,;#$]");
```java
In the above example, words are separated whenever either of the characters specified in the set is encountered.
    public static void main(String args[])
    {
        String str = "word1, word2 word3@word4?word5.word6";
        String[] arrOfStr = str.split("[, ?.@]+");
  
        for (String a : arrOfStr)
            System.out.println(a);
    }

        String str="122.202";
        double dnum = Double.valueOf(str);
        
```



import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.*;

// Main class should be named 'Solution'
class Solution {
public static void main(String[] args) throws Exception {
System.out.println(password());
//System.out.println("starting test");
}

    static String password() throws Exception{
        Scanner scanner = new Scanner(new File("/root/data/file.txt"));
        Set<Integer> set = new HashSet<Integer>();
        
        List<Integer> passwordIndex = new ArrayList<Integer>();
        List<Character> letter = new ArrayList<Character>();
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            var index = Integer.valueOf(line);
            
            if (set.contains(index)) {
                break;
            }
            else {
                set.add(index);
            }
            
            passwordIndex.add(index);
            letter.add(decode(scanner));
        }
        
        var retVal = new Character[passwordIndex.size()];
        
        //String retVal = "";
        for (int i = 0; i < passwordIndex.size(); i++) {
            // System.out.println(i);
            var index = passwordIndex.get(i);
            retVal[index] = letter.get(i);
            //retVal += letter.get(i);
        }
        
        String retString = "";
        for (char c : retVal) {
            retString += c;
        }
        return retString;
    }
    
    static char decode(Scanner scanner) throws Exception {
        List<char[]> matrix = new ArrayList<char[]>();
        
        Integer x = null;
        Integer y = null;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            if (line.isEmpty()) break;
            
            if (x == null) {
                line = line.replace("[", "");
                line = line.replace("]", "");
                String[] arrOfStr = line.split("[, ?.@]+");
                
                x = Integer.valueOf(arrOfStr[0]);
                y = Integer.valueOf(arrOfStr[1]);

            }
            else {
                matrix.add(line.toCharArray());
                // System.out.println(line.toCharArray().length);
            }
        }
        
        int index1 = x;
        int index2 = matrix.size()- 1 - y;
        return matrix.get(index2)[index1];
    }
}

