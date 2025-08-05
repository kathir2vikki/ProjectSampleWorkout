package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Developer implements Comparable<Developer>
{
    private int id;

    public Developer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;

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


    @Override
    public int compareTo(Developer o) {
        if(id == o.id) {
            return 0;
        }
       else if(id > o.id)
        {
            return 1;
        }
        else {
            return -1;
        }

        //return name.compareTo(o.name);
    }
}

public class ComparableClass {

    public static void main(String[] a)
    {
List<Developer> d = new ArrayList<>();
        d.add( new Developer(5,"kathir"));
        d.add(new Developer(7,"Vikki"));

            Collections.sort(d);

        for(Developer f : d)
        {
            System.out.println(f.getId() + " ==== " + f.getName());
        }
    }

}
