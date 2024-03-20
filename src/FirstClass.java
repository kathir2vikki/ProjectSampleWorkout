import java.util.ArrayList;
import java.util.List;

public class FirstClass {

 static int checkPackage (int items, int largePackage, int samllPackage)
 {
     int largePackCap = 5;
     int smallPackCap = 1;
     int lPackage = largePackage * largePackCap;
     int sPackage = samllPackage * smallPackCap;
     int i = items - lPackage;

        int totalPackage = largePackage + sPackage;
     System.out.println("remaining item === " + sPackage + " lPackage === "+ largePackage +  " totalPackage === " + totalPackage);
     return 0;
 }
    public static void main(String a[])
    {
        Employee emp = new Employee(1,"kathir");
        emp = new Employee(1,"Vikki");

System.out.println(emp.getKa());

String msgId = null;

String msg = msgId!=null ? "1234" : null;

System.out.println("fianl msgId" + msg);

String k = "hello keer";

String[] b = k.split(" ");

//System.out.println(b[0]);
        StringBuilder sb = new StringBuilder();
for (int i = 1;i>=0;i--)
{

    sb.append(b[i]);
    //String c = b[i];
    //System.out.println(b[i]);
    System.out.println(sb);
}

List kathir = new ArrayList();
System.out.println("lsit size ==== " + kathir);
int packageUsed = checkPackage(30, 2, 5);

String kathirvikki = "";

Integer in = Integer.valueOf(kathirvikki);
System.out.println(in);

    }
}
