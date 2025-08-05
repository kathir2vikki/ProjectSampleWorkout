package designpatterns.builder;

public class CallingEmployeeBuilder
{
    public static void main(String[] arg)
    {
        EmployeeBuilder emb = new EmployeeBuilder.BuilderInner().id(1).name("kathir").build();
        System.out.println("emb ===" + emb.getId());
    }
}
