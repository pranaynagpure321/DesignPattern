package Singelton;

public class SingleDemo {

    private  static  SingleDemo  instance= new SingleDemo();

    private SingleDemo (){}

    public static SingleDemo getInstance()
    {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }

}
