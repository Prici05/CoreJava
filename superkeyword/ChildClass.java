package Superkeyword;

public class ChildClass extends ParentClass {
    String name = "Arockia Pricilla S";

    public ChildClass()
    {
        super();
        System.out.println("I am the child class constructor");
    }

    public void getData()
    {
        super.getData();
        System.out.println("I am the child class");
    }

    public void getName()
    {
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args)
    {
        ChildClass c = new ChildClass();
       c.getData();
       c.getName();

    }

}
