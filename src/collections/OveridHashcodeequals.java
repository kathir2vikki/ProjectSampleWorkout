package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student
{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public Student()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class OveridHashcodeequals {

    public static void main(String[] a)
    {
        Student s1 = new Student(1, "kathir");
        Student s2 = new Student(1,"kathisr");
        Student s3 = new Student();
        Student s4 = new Student();

        System.out.println(s1 + "=== " + s2);
        boolean equl = s1.equals(s2);

        System.out.println("Instance check === " + equl);


        Map<Object, String> hm = new HashMap<>();
        hm.put(s1,"HCL");
        hm.put(s2,"CTS");

            for(Map.Entry map : hm.entrySet())
            {
                System.out.println(map);
        }
    }
}
