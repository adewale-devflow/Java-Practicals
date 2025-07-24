import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class BasicStreamExample {


    public static void main(String[] args) {
        // From a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Stream<String> namesStream = names.stream();

        // From an array
        String[] cities = {"London", "Paris", "Tokyo"};
        Stream<String> citiesStream = Arrays.stream(cities);

        // From individual elements
        Stream<String> streamOfNames = Stream.of("John", "Jane", "Jack");
    }

    // Filtering
    //Filter elements based on a condition using filter.


    public class SimpleStreamExample {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
            // Filter even numbers
            List<Integer> evenNumbers = numbers.stream()
                                               .filter(n -> n % 2 == 0)
                                               .collect(Collectors.toList());
    
            System.out.println("Even Numbers: " + evenNumbers);
        }
    }

    // Mapping
    //Transform each element using map.

    public class MappingExample {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("alice", "bob", "charlie");
    
            // Convert each name to uppercase
            List<String> uppercasedNames = names.stream()
                                                .map(String::toUpperCase)
                                                .collect(Collectors.toList());
    
            System.out.println("Uppercased Names: " + uppercasedNames);
        }
    }

    /*
     * Intermediate and Terminal Operations
    
     Intermediate Operations: Operations like
     filter, map, sorted, etc., return a new 
     stream and are lazy (they don’t execute 
     until a terminal operation is called).
    
     Terminal Operations: Operations like
     collect, forEach, reduce finalize the 
     stream processing.
     */

    public class SortingExample {
        public static void main(String[] args) {
            List<String> fruits = Arrays.asList("Banana", "Apple", "Orange", "Mango");
    
            // Sort fruits alphabetically and collect as a list
            List<String> sortedFruits = fruits.stream()
                                              .sorted()
                                              .collect(Collectors.toList());
    
            System.out.println("Sorted Fruits: " + sortedFruits);
        }
    }

    // Advanced Stream Operations

    //    Reducing
    //The reduce method combines all elements into a single result using a binary operation.

    public class ReducingExample {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

            // Sum all numbers
            int sum = numbers.stream()
                            .reduce(0, (a, b) -> a + b);

            System.out.println("Sum of Numbers: " + sum);
        }
    }


    // Using flatMap for Complex Data Structures
    //The flatMap method is used to flatten a stream of collections into a single stream.
 
    public class FlatMapExample {
        public static void main(String[] args) {
            List<List<String>> namesList = Arrays.asList(
                    Arrays.asList("Alice", "Bob"),
                    Arrays.asList("Charlie", "David"),
                    Arrays.asList("Eve", "Frank")
            );

            // Flatten the nested list
            List<String> flattenedList = namesList.stream()
                                                .flatMap(List::stream)
                                                .collect(Collectors.toList());

            System.out.println("Flattened List: " + flattenedList);
        }
    }

    // Parallel Streams for Concurrency
    // Using parallelStream can leverage multiple cores for faster processing.
   
    public class ParallelStreamExample {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Using parallel stream to find squares of numbers
            numbers.parallelStream()
                .map(n -> n * n)
                .forEach(System.out::println);
        }
    }

    //Combining Multiple Stream Operations
    //An example showing a more advanced use case with multiple operations:
    
    public class AdvancedStreamExample {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("Stream", "Java", "Parallel", "Filter", "Lambda");
    
            // Find words with length > 5, convert them to uppercase, sort them, and collect as a list
            List<String> result = words.stream()
                                       .filter(word -> word.length() > 5)
                                       .map(String::toUpperCase)
                                       .sorted()
                                       .collect(Collectors.toList());
    
            System.out.println("Filtered and Processed Words: " + result);
        }
    }

}
