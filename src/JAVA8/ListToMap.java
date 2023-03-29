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
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "kathir"));
        studentList.add(new Student(1, "kathirVikki"));
        studentList.add(new Student(2, "vikki"));

        HashMap<Integer,String> hm = studentList.stream()
                .collect(Collectors
                        .toMap(
                                Student::getId,
                                Student::getName,
                                (x, y)
                                        -> x + "," + y,
                                HashMap::new));

        hm.forEach((x,y) -> System.out.println(x + "=" +y));

     Map<Integer, List<String>> lsmap =   studentList
             .stream()
                .collect(Collectors
                        .groupingBy(Student::getId,
                                Collectors
                                        .mapping(Student::getName,Collectors.toList())));
        lsmap.forEach((x,y) -> System.out.println(x + "==" +y));

        Map<Integer, String> mapTwo = new HashMap<>();
        mapTwo =  studentList.stream().collect(Collectors.toMap(Student::getId,
                Student::getName,
                (x,y) -> x + ", " +y,
                HashMap::new));

        for(Map.Entry<Integer, String> mapThree : mapTwo.entrySet())
        {
            System.out.println("Key  ==== " + mapThree.getKey() + "Value =====" + mapThree.getValue());
        }

    }

}
