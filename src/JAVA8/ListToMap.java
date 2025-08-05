package JAVA8;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student
{
    private int id;

    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class ListToMap {

  public static void main(String[] t) {
                 // Create a list of Student objects
                 List<Student> studentList = new ArrayList<>();

                 // Add students to the list
                 studentList.add(new Student(1, "kathir"));
                 studentList.add(new Student(1, "kathirVikki"));
                 studentList.add(new Student(2, "vikki"));

                 // Convert the list of students to a HashMap with student ID as key and names concatenated as value
                 HashMap<Integer, String> hm = studentList.stream()
                         .collect(Collectors.toMap(
                                 Student::getId, // Key mapper
                                 Student::getName, // Value mapper
                                 (x, y) -> x + "," + y, // Merge function for duplicate keys
                                 HashMap::new)); // Supplier for the resulting map

                 // Print the HashMap
                 hm.forEach((x, y) -> System.out.println(x + "=" + y));

                 // Group students by their ID and collect names into a list
                 Map<Integer, List<String>> lsmap = studentList
                         .stream()
                         .collect(Collectors.groupingBy(
                                 Student::getId, // Classifier function
                                 Collectors.mapping(Student::getName, Collectors.toList()))); // Downstream collector

                 // Print the grouped map
                 lsmap.forEach((x, y) -> System.out.println(x + "==" + y));

                 // Convert the list of students to a HashMap with student ID as key and names concatenated as value
                 Map<Integer, String> mapTwo = new HashMap<>();
                 mapTwo = studentList.stream().collect(Collectors.toMap(
                         Student::getId, // Key mapper
                         Student::getName, // Value mapper
                         (x, y) -> x + ", " + y, // Merge function for duplicate keys
                         HashMap::new)); // Supplier for the resulting map

                 // Print the HashMap using a for-each loop
                 for (Map.Entry<Integer, String> mapThree : mapTwo.entrySet()) {
                     System.out.println("Key  ==== " + mapThree.getKey() + "Value =====" + mapThree.getValue());
                 }
             }

}
