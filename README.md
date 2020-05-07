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


Java uses *java.Utils* package
C# uses *System.Collections* namespace

<center>**Ordered vs Sorted**</center>

An **ordered collection** means that the elements of the collection have a specific order based on the sequence inserted. The order is independent of the value. A __List__ is an example.
A **sorted collection** means that not only does the collection have order, but the order depends on the value of the element. A __SortedSet__ is an example.
In contrast, a **collection without any order** can maintain the elements in any order. A __Set__ is an example.
