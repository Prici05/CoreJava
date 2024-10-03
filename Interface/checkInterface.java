package Interface;

public class checkInterface  implements InterfaceDemo{

    public static void main(String[] args) {

        System.out.println("Start");
        InterfaceDemo a = new checkInterface();
        a.GreentoGo();
        a.RedtoStop();
        a.YellowtoReady();
        
        
    }

    @Override
    public void GreentoGo() {
        // TODO Auto-generated method stub
        System.out.println("Ready to Go");
    }

    @Override
    public void RedtoStop() {
        // TODO Auto-generated method stub
        System.out.println("Ready to Stop");
    }

    @Override
    public void YellowtoReady() {
        // TODO Auto-generated method stub
        System.out.println("Ready to ready");
    }
    

}
