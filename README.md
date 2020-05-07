## Data Structures - Java and C#
---

### Description


[Oracle - Java Collections](https://docs.oracle.com/javase/tutorial/collections/intro/index.html)

[Baeldung - Java Collections Interview Questions](https://www.baeldung.com/java-collections-interview-questions)

[Microsoft - C# Collections](https://docs.microsoft.com/en-us/dotnet/standard/collections/)

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
# code block
roster
    .stream()
    .filter(e -> e.getGender() == Person.Sex.MALE)
    .forEach(e -> System.out.println(e.getName()));
```

**Recursion vs Iteration**

**Recursion** – stacking method call by calling itself, less code but higher time complexity, infinite recursion leads to CPU crash
**Iteration** – looping, more code but less time complexity, infinite iteration leads to memory exhaustion
*Use recursion for algorithms best explained recursively – trees, quicksort, DFS, divide and conquer, Tower of Hanoi, etc; use iteration for algorithms best explained iteratively - factorial.*
