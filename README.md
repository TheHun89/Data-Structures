## Data Structures - Java and C#
---

### Description


[Oracle - Java Collections](https://docs.oracle.com/javase/tutorial/collections/intro/index.html)

[Baeldung - Java Collections Interview Questions](https://www.baeldung.com/java-collections-interview-questions)

![Image](https://media.geeksforgeeks.org/wp-content/uploads/java-collection.jpg)

[Microsoft - C# Collections](https://docs.microsoft.com/en-us/dotnet/standard/collections/)

![Image](https://media.geeksforgeeks.org/wp-content/uploads/Untitled-Diagram-20.jpg)

![Image](https://www.tutorialsteacher.com/Content/images/csharp/generic-collections.jpg)


### Choosing a Collection in C#

| I want to…  | Generic collections  |  Non-generic collections |  Thread-safe or immutable collections |
|---|---|---|---|
| Store items as key/value pairs for quick look-up by key  | Dictionary<TKey,TValue>  | Hashtable (A collection of key/value pairs that are organized based on the hash code of the key.)  | ConcurrentDictionary<TKey,TValue> ReadOnlyDictionary<TKey,TValue> ImmutableDictionary<TKey,TValue>  |
| Access items by index Use items first-in-first-out (FIFO)| List<T>  | Array ArrayList  | ImmutableList<T> ImmutableArray  |
| Use items first-in-first-out (FIFO)  | Queue<T>  | Queue  | ConcurrentQueue<T> ImmutableQueue<T>  |
| Use data Last-In-First-Out (LIFO)  | Stack<T>  | Stack  | ConcurrentStack<T> ImmutableStack<T>  |
| Access items sequentially  | LinkedList<T>  |   |   |
| Receive notifications when items are removed or added to the collection. (implements INotifyPropertyChanged and INotifyCollectionChanged)  | ObservableCollection<T>  |   |   |
| A sorted collection  | SortedList<TKey,TValue>  | SortedList  | ImmutableSortedDictionary<TKey,TValue> ImmutableSortedSet<T>  |
| A set for mathematical functions  | HashSet<T> SortedSet<T>  |   | ImmutableHashSet<T> ImmutableSortedSet<T>  |


Java uses *java.Utils* package.

C# uses *System.Collections* namespace.

**Ordered vs Sorted**

An **ordered collection** means that the elements of the collection have a specific order based on the sequence inserted. The order is independent of the value. A __List__ is an example.
A **sorted collection** means that not only does the collection have order, but the order depends on the value of the element. A __SortedSet__ is an example.
In contrast, a **collection without any order** can maintain the elements in any order. A __Set__ is an example.

![Image](https://4.bp.blogspot.com/-V-rvs9vZVtI/WVUhbcYjORI/AAAAAAAAI9A/k5TJVIumbC0_KETzR_vPZ33gN4viR6obgCLcBGAs/s280/Java%2BCollection%2BSummary%2B.jpg)


NOTE:  It’s always best to declare what type the collection contains so that errors are caught at compile time and not run time.

NOTE:  **Synchronized** means accessible by multiple threads (thread safe).

**Traversing Collections**:
1.	Aggregate operations: Java uses Streams (1.8) and C# uses LINQ to query in-memory objects.
2.	Foreach construct
3.	Iterators – calling collection’s iterator method (ie: .next(), .hasNext()); C# uses IEnumberable/IEnumerator and Java uses Iterable/Iterator interface.

**Aggregate Operations**

**Java**:

**Pipeline** – sequence of aggregate operations which consists of
1.	Source
2.	Zero or more intermediate operations that produce a stream  ie: filter
3.	Terminal operation that produces a non-stream result such as a primitive value, a collection or no value at all  ie: forEach

**Stream** – sequence of elements; it is not a data structure; carries values from a source through a pipeline

**Reduction** – JDK terminal operations (such as average, sum, min, max, and count) that return one value by combining the contents of a stream

**Parallelism** – dividing a problem into subproblems, solving those problems simultaneously (in parallel, with each subproblem running in a separate thread), and then combining the results of the solutions to the subproblems

```
roster
    .stream()
    .filter(e -> e.getGender() == Person.Sex.MALE)
    .forEach(e -> System.out.println(e.getName()));
```

**Recursion vs Iteration**

* **Recursion** – stacking method call by calling itself, less code but higher time complexity, infinite recursion leads to CPU crash
* **Iteration** – looping, more code but less time complexity, infinite iteration leads to memory exhaustion

*Use recursion for algorithms best explained recursively – trees, quicksort, DFS, divide and conquer, Tower of Hanoi, etc; use iteration for algorithms best explained iteratively - factorial.*

**Comparing**
Java interfaces:  [Baeldung - Comparable vs Comparator](https://www.baeldung.com/java-comparator-comparable)

**Comparable** – uses Natural Ordering

**Comparator** – allows for more customization to define multiple comparison strategies
    
```
public static void main(String[] args) {
List<Player> footballTeam = new ArrayList<>();
Player player1 = new Player(59, "John", 20);
Player player2 = new Player(67, "Roger", 22);
Player player3 = new Player(45, "Steven", 24);
footballTeam.add(player1);
footballTeam.add(player2);
footballTeam.add(player3);

System.out.println("Before Sorting : " + footballTeam);
Collections.sort(footballTeam);
System.out.println("After Sorting : " + footballTeam);
}



public class Player {
    private int ranking;
    private String name;
    private int age;
    
    // constructor, getters, setters  
}

public class Player implements Comparable<Player> {
 
    // same properties and methods as before
 
    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(getRanking(), otherPlayer.getRanking());
    }

}


Before Sorting : [John, Roger, Steven]
After Sorting : [Steven, John, Roger]


public class PlayerRankingComparator implements Comparator<Player> {
 
    @Override
    public int compare(Player firstPlayer, Player secondPlayer) {
       return Integer.compare(firstPlayer.getRanking(), secondPlayer.getRanking());
    }
 
}

public class PlayerAgeComparator implements Comparator<Player> {
 
    @Override
    public int compare(Player firstPlayer, Player secondPlayer) {
       return Integer.compare(firstPlayer.getAge(), secondPlayer.getAge());
    }
 
}


Using this approach, we can override the natural ordering:

PlayerRankingComparator playerComparator = new PlayerRankingComparator();
Collections.sort(footballTeam, playerComparator);

Before Sorting : [John, Roger, Steven]
After Sorting by ranking : [Steven, John, Roger]


PlayerAgeComparator playerComparator = new PlayerAgeComparator();
Collections.sort(footballTeam, playerComparator);
Now, when we run our PlayerAgeSorter, we can see a different sort order by age:

Before Sorting : [John, Roger, Steven]
After Sorting by age : [Roger, John, Steven]

```
    

C# interfaces:  

	**IComparable**

	**IComparator**


### Array
* Store a fixed size sequential collection of elements of the same type
* Accessible by indexes
* Faster, better performance than ArrayList
* Type safe – all members of same type
* Store primitive OR reference types
* Can NOT make array final
* [Array vs ArrayList](https://programming.guide/java/array-vs-arraylist.html)

```
int[] anArray = new int[10];
anArray[0] = 100;
anArray[1] = 200;
System.out.println("Element at index 0: " + anArray[0]);
```


### ArrayList
* Use when you don’t know the size of the array
* Dynamic scaling
* Does NOT store primitive types; only stores reference types
* CAN make list final

```
int n = 5; 

// Declaring the ArrayList with initial size n 
ArrayList<Integer> arrli = new ArrayList<Integer>(n); 

// Appending new elements at the end of the list 
for (int i = 1; i <= n; i++) 
    arrli.add(i); 

arrli.remove(3); 

// Displaying the ArrayList after deletion 
System.out.println(arrli); 

// Printing elements one by one 
for (int i = 0; i < arrli.size(); i++) 
    System.out.print(arrli.get(i) + " "); 
```

**Vector** vs **ArrayList**

* Vector – synchronized, thread safe
* ArrayList – not synchronized, not thread safe
* NOTE:  If multiple threads access an ArrayList instance concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally.

### Stack
* Last in first out / First in last out
* Push – Pop
* Empty, Search, Peek
* Can contain null

![Image](https://media.geeksforgeeks.org/wp-content/uploads/Selection_028.png)

### Queue:  
* First in first out
* Poll, Remove, Peek, Element

**Priority Queue**

* PriorityQueue elements are ordered by either Natural ordering OR by use of Comparator used at construction

![Image](https://howtodoinjava.com/wp-content/uploads/2018/10/priority-queue-pattern.png)

### String
* char primitive type
* String class – immutable, synchronized/thread safe, fast
* StringBuilder – mutable, not synchronized/not thread safe
* StringBuffer – mutable, synchronized/thread safe (multiple threads can call the methods of SB simultaneously)
* [Oracle - String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)


### LinkedList
* Linked nodes to store and retrieve elements with references to previous and next nodes
* Single – node has two fields: data and next
* Circular – Single but contains head and tail
* Double – node has three fields: previous, data and next

![Image](https://www.geeksforgeeks.org/wp-content/uploads/gq/2013/03/Linkedlist.png)

**LinkedList** vs **ArrayList**

**ArrayList** – access elements by index, less memory and in most cases outperforms

**LinkedList** – elements put into Node objects, more efficient when you have lots of insertions/deletions in different parts of list especially if list is large

### LinkedHashMap
* combination of HashMap and a Queue
* stores key/value pairs but also remembers the order in which they were inserted


### Set
* NO Order to elements returned
* Collection of distinct, non-equal objects with no structure
* No two elements can be equal (ie: e1.equals(e2)

**TreeSet** – ordered via some predefined Comparator

**HashSet vs HashMap vs HashTable**

**HashSet** –allows nulls, no duplicate values, no key/pair; {1, 2, 3, 4, 5, 6, 7}

**HashMap** –allows null key and values, duplicate values but not keys, key/pair, non synchronized / not thread safe, can NOT be shared with multiple threads; no order; implements Cloneable and Serializable interface;  {a -> 1, b -> 2, c -> 2, d -> 1}

**HashTable** –no nulls or duplicates, synchronized / thread safe, can be shared with multiple threads





**Performance of HashMap**
Performance of HashMap depends on 2 parameters: 

1. **Initial Capacity** – It is the capacity of HashMap at the time of its creation (It is the number of buckets a HashMap can hold when the HashMap is instantiated). In java, it is 2^4=16 initially, meaning it can hold 16 key-value pairs. 

2. **Load Factor** – It is the percent value of the capacity after which the capacity of Hashmap is to be increased (It is the percentage fill of buckets after which Rehashing takes place). In java, it is 0.75f by default, meaning the rehashing takes place after filling 75% of the capacity. 

Threshold – It is the product of Load Factor and Initial Capacity. In java, by default, it is (16 * 0.75 = 12). That is, Rehashing takes place after inserting 12 key-value pairs into the HashMap.

Rehashing – It is the process of doubling the capacity of the HashMap after it reaches its Threshold. In java, HashMap continues to rehash(by default) in the following sequence – 2^4, 2^5, 2^6, 2^7, …. so on. 
 
If the initial capacity is kept higher then rehashing will never be done. But by keeping it higher increases the time complexity of iteration. So it should be chosen very cleverly to increase performance. The expected number of values should be taken into account to set initial capacity. The most generally preferred load factor value is 0.75 which provides a good deal between time and space costs. Load factor’s value varies between 0 and 1. 
 

**Synchronized HashMap**
As it is told that HashMap is unsynchronized i.e. multiple threads can access it simultaneously. If multiple threads access this class simultaneously and at least one thread manipulates it structurally then it is necessary to make it synchronized externally. It is done by synchronizing some object which encapsulates the map. If No such object exists then it can be wrapped around Collections.synchronizedMap() to make HashMap synchronized and avoid accidental unsynchronized access. As in the following example: 
 

```
Map m = Collections.synchronizedMap(new HashMap(...));
```
Now the Map m is synchronized. 






**Fail-fast vs fail-safe iterators**
Iterators for different collections are either fail-fast or fail-safe, depending on how they react to concurrent modifications. 

Fail-fast iterators (those returned by HashMap, ArrayList, and other non-thread-safe collections) iterate over the collection's internal data structure, and they throw ConcurrentModificationException as soon as they detect a concurrent modification.

Fail-safe iterators (returned by thread-safe collections such as ConcurrentHashMap, CopyOnWriteArrayList) create a copy of the structure they iterate upon. They guarantee safety from concurrent modifications. Their drawbacks include excessive memory consumption and iteration over possibly out-of-date data in case the collection was modified.



### Tree
**Binary** – recursive data structure where each node can have 2 children at most; every node has a value that is greater than or equal to the node values in the left sub-tree and less than or equal to the node values in the right sub-tree

![Image](https://www.baeldung.com/wp-content/uploads/2017/12/Tree-1.jpg)



Key Words
Anagram – string has the exact same characters as another
Palindrome – string is the same in reverse order
GCD
Fibonacci sequence – 0, 1, 1, 2, 3, 5, 8, 13, 21, 24, 55…
    Fn = Fn-1 + Fn-2
with seed values
   F0 = 0 and F1 = 1


Algorithms
