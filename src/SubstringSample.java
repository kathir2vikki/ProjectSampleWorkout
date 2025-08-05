import java.text.ParseException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SubstringSample extends Kathir {


    public static void main(String[] a) throws ParseException {


        String streetTypeCode = "VI";
        String nAdre = null;
        String streetName = "CAVALIERI kathit = ?";
        String normalAddress = nAdre != null ? nAdre.trim() : streetName;
        StringBuilder sb = new StringBuilder();
        sb.append(streetTypeCode);
        sb.append(" ");
        sb.append(normalAddress.trim());
        System.out.println("final ===" + sb.toString());
        String finalOne = sb.toString();
        String x = finalOne.length() >= 64 ? finalOne.substring(1, 64) : finalOne.substring(1);

        String kathir = streetName.replace("CAVALIERI kathit = ?", "");


        // String add = adddescription != null ? "C/O" : adddescription.trim();
        // finalOne.substring(1,64);
    /*    System.out.println("final ======" + kathir);
        DateTimeFormatter dateFormatterNew = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss+HH:MM");
        DateTimeFormatter dateFormatterCurrent = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
        LocalDateTime effectiveDate = LocalDateTime.parse(LocalDateTime.now().toString(), dateFormatterCurrent);
        String formattedEffectiveDate = dateFormatterNew.format(effectiveDate);
*/
     /*   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss+HH:MM");
        LocalDateTime date = LocalDateTime.parse(LocalDateTime.now().toString(), formatter);

        String dateFinal = date.toString();*/
     //   System.out.println("formattedEffectiveDate==== " + formattedEffectiveDate);

        Predicate<String> con1 = i -> i.equals("hi");
        Predicate<String> con2 = i -> i.equals("bye");
        Predicate<String> con3 = i -> i.equals("cdfist");
        Predicate<String> con4 = i -> i.equals("health");

        Consumer<String> i;

        List<String> identifiers = new ArrayList<>();
        identifiers.add("hi");
        identifiers.add("bye");
    List<String> finalFlat = identifiers.stream()
                .filter(con1.or(con2)).map(s -> s.toString()).collect(Collectors.toList());


        finalFlat.stream().forEach(c ->
        {
            if(c.equals("hi"))
            {
                System.out.println("hi==== " );
            }
            else if(c.equals("bye"))
            {
                System.out.println("bye==== ");
            }
        });
        System.out.println("finalFlat==== " + finalFlat.size());

        Kathir kathirsample = new SubstringSample();
        kathirsample.kathirMethod();
        SubstringSample substringSample1 = new SubstringSample();
     /*   substringSample1.kathirMethod();
        Kathir kathirOne = new Kathir();
        kathirOne.kathirMethod();*/
       // Kathir kathirsampleTwo = (Kathir)substringSample1;

        ((Kathir)kathirsample).kathirMethod();

    }

    public void kathirMethod()
    {
        int k = 10;
                if((k>10?k++:k--)<10)
                    System.out.println("MAC");
        if(k<10)
            System.out.println("PC");
       // super.kathirMethod();
        System.out.println("Subclass ");


        List<String>  clientIds = new ArrayList<>();

       // clientIds = null;
if(clientIds.isEmpty()) {

    System.out.println("clientIds" +clientIds);
}

        String kat = " ";

        if(Objects.equals(kat,"SMS"))
        {
            System.out.println("kat ===" + kat);
        }

        String samStr = "123123";

        Integer in = Integer.parseInt(samStr);
System.out.println("in in in in " + in);

        String samStrOne = "29:34,56,23";

        final int pos = samStrOne.indexOf(":");
        System.out.println("in in in in " + samStrOne.substring(0,pos));


        final int position = samStrOne.indexOf(":");
        System.out.println("in in  " + samStrOne.substring(position +":".length()));


        Map<String,String> hmMap = new HashMap<>();

        hmMap.put("kathir", "1");
        hmMap.put("kathir1", "2");

        hmMap.entrySet().forEach((g) -> System.out.println(g.getKey() + "===" + g.getValue()));

        String s = "wfm10.1.1-34,10.12.12.33";

        String nodeis = s.substring(0,s.indexOf("-"));

        System.out.println("nodeid" + nodeis);

        int l = 3, r = 4;    
        int mid = l + (r-l)/2;
        int fl = 1/2;

        System.out.println("mid vlaue" + mid);

    }//SYSDATE format yyyy-mm-ddThh:mm:ss.nnn (example: 2019-09-02T11:40:03.374)


}

