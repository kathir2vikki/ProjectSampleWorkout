package JAVA8.FLATMAP;

import java.util.List;

public class EmpClass {
    public EmpClass(int id, String name, List<EmpAddrss> empAdress) {
        this.id = id;
        this.name = name;
        this.empAdress = empAdress;
    }

    private int id;

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

    public List<EmpAddrss> getEmpAdress() {
        return empAdress;
    }

    public void setEmpAdress(List<EmpAddrss> empAdress) {
        this.empAdress = empAdress;
    }

    private String name;
    private List<EmpAddrss> empAdress;
}
