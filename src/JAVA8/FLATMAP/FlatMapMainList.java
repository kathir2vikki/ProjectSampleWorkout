package JAVA8.FLATMAP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMainList {

    public static void main(String[] ar)
    {
        EmpAddrss empAddrss = new EmpAddrss("karaikal");
        EmpAddrss empAddrssOne = new EmpAddrss("karaikalOne");

        EmpAddrss empAddrssTwo = new EmpAddrss("karaikalTwo");
        EmpAddrss empAddrssthree = new EmpAddrss("karaikalTHree");


        List<EmpAddrss> addresList = new ArrayList<>();
        addresList.add(empAddrss);
        addresList.add(empAddrssOne);

        List<EmpAddrss> addresListONe = new ArrayList<>();
        addresList.add(empAddrssTwo);
        addresList.add(empAddrssthree);

        EmpClass empClass = new EmpClass(1, "kathir",addresList);

        EmpClass empClassOne = new EmpClass(2, "kathirVikki",addresListONe);

        List<EmpClass> empClasses = new ArrayList<>();

        empClasses.add(empClass);
        empClasses.add(empClassOne);

       List<String> stringList = empClasses.stream().flatMap(q -> q.getEmpAdress().stream().map(EmpAddrss::getStreetName)).collect(Collectors.toList());

        stringList.forEach(System.out::println);

        List<String> stringListSample = empClasses.stream().flatMap(z -> z.getEmpAdress().stream().map(EmpAddrss::getStreetName)).collect(Collectors.toList());




    }
}
