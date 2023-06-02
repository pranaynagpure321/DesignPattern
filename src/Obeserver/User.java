package Obeserver;

public class User implements  ISubscriber{


    int userid ;

    User (int id)
    {
        this.userid = id;
    }

    @Override
    public void notifySubscriber(String msg) {
        System.out.println(this.userid +" received msg " + msg);
    }
}
