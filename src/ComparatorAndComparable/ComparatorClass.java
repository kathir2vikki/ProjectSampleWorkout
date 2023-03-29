package ComparatorAndComparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DeveloperComparator
{
    private int id;

    @Override
    public String toString() {
        return "DeveloperComparator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeveloperComparator(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
}

/*class SortByAge implements Comparator<DeveloperComparator>
{
    @Override
    public int compare(DeveloperComparator o1, DeveloperComparator o2) {

        return o1.getName().compareTo(o2.getName());
    }
}*/
public class ComparatorClass {

    public static void main (String[] arg) {
        List<DeveloperComparator> d1 = new ArrayList<>();
        d1.add(new DeveloperComparator(4,"dfg",43));
        d1.add(new DeveloperComparator(2,"abc",48));
        d1.add(new DeveloperComparator(3,"hij",56));

        Comparator<DeveloperComparator> cd = Comparator.comparing(DeveloperComparator::getAge)
                        .thenComparing(DeveloperComparator::getId);

        Collections.sort(d1,cd);


        System.out.println(d1);

    }

}
