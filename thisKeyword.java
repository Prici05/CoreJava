public class thisKeyword {


    int a = 1; // This variable can be accessed across the class level

    public void getData()
    {
        int a = 2; // This variable has scope only inside this method
        // So both variables has name name and if i want to access that class level variable we need to use this keyword
        // this refers to curent object- object scope lies in class level
        System.out.println(a);
        System.out.println(this.a);
    }
    public static void main(String[] args) {

        thisKeyword tk = new thisKeyword();
        tk.getData();
        
    }

}
