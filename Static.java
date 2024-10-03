public class Static {

    String name;   //Instance variable these are tied upto the object 
    String address;  //if we create one more obbject another set of instance variables will be created for this object
      //these variables change from object to object
      static String city; //This variable copy is shared by all objects so all objects will have chennai as city
      //these are not dependent on instance variable This variable is called class variable since it is tied upto the class
      static int i;
      int j =0;

      // ALl static variables are class variables
      // Remaining variables declared in the class are instance variables
      // variables declared in the constructor are local variables
      static{
        city = "Chennai";
        i=0;
      }

    public Static(String name, String address) //These are local variables scope only will be inside this block so we are using this keyword to assign to class variable
    {
        this.name = name;
        this.address = address;
    }

    public static void getCity()
    {
        // Static methods allow only static variables to access it will not allow instance variable
        System.out.println(city);
    }

    public void getaddress()
    {
        System.out.println(address+" "+city);
        i++;  //all objects uses same i value so it will increment
        j++; // j variable is a instance so it will be newly created for every object so it will be 1 for all objects after incrementation
        System.out.println(i);
        System.out.println(j);
    }


    public static void main(String[] args) {

        Static s = new Static("Prici", "guindy");
        s.getaddress();
        Static s1 = new Static("mel", "madurai");
        s1.getaddress();

        Static.getCity();  // static methods are called only with classname.methodname as they are object independent

        Static.i = 5;
        s.address = "Bangalore";

        
    }
}
