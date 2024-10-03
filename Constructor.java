public class Constructor {

    public Constructor()
    {
        System.out.println("This is called default constructor since no args are passed");
    }

    public Constructor(String str)
    {
        System.out.println(str + " This is parametrised constructor");
    }

    public Constructor(int a, int b)
    {
        int c=a+b;
        System.out.println(c);
    }

    public void Check()
    {
        System.out.println("Checking...");
    }

    public static void main(String[] args) {
        Constructor c  = new Constructor();
        Constructor c1 = new Constructor("Hi Prici");
        Constructor c2 = new Constructor(32, 90);

    }

}
