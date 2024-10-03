package Abstract;
public class ChildAbstractClass extends AbstractClass {

    public static void main(String[] args) {
        ChildAbstractClass c = new ChildAbstractClass();
        c.Safety();
        c.engine();
        c.color();

    }

    @Override
    public void color() {
        // TODO Auto-generated method stub

        System.out.println("I am going to follow my own color");
    }

    

}
