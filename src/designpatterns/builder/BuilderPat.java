package designpatterns.builder;

public class BuilderPat {

    private int age;
    private BuilderPat(BuilderPattern build)
    {
        this.age = build.age;
    }

    public static class BuilderPattern
    {
        private int age;

        public BuilderPattern(int age) {
            this.age = age;
        }

        public BuilderPattern age(int ageOne)
        {
            this.age = ageOne;
            return this;
        }

        public BuilderPat build()
        {
            return new BuilderPat(this);
        }
    }

    public static void main(String ag[])
    {
        BuilderPat bp = new BuilderPat.BuilderPattern(6).age(5).build();
        System.out.println("kathir builder " + bp.age);
    }
}
