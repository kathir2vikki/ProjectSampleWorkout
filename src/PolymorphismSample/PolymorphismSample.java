package PolymorphismSample;

public class PolymorphismSample {

    public static void main (String arg[])
    {
        PolymorphismSampleParent polymorphismSampleParent = new PolymorphismSampleParent();
        polymorphismSampleParent.sampleMethod();

        PolymorphismSampleParent polymorphismSampleParent1 = new PolymorphismSampleChild();

        polymorphismSampleParent1.sampleMethod();


        PolymorphismSampleChild polymorphismSampleChild = (PolymorphismSampleChild)polymorphismSampleParent1;

        polymorphismSampleChild.sampleMethod();
    }
}
