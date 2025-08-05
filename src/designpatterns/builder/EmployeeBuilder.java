package designpatterns.builder;

public class EmployeeBuilder {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

   private EmployeeBuilder (BuilderInner builder)
    {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static class BuilderInner {
        private Integer id;
        private String name;

        public BuilderInner id(Integer id)
        {
            this.id = id;
            return this;
        }

        public BuilderInner name(String name)
        {
            this.name = name;
            return this;
        }

        public EmployeeBuilder build()
        {
            return new EmployeeBuilder(this);
        }

    }

    public static void main(String[] fg)
    {
        EmployeeBuilder employeeBuilder = new BuilderInner().id(2).name("kathir").build();
        System.out.println(employeeBuilder.id);
    }

}
