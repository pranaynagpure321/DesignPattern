package Obeserver;

import java.util.ArrayList;

public class Group {

    ArrayList<ISubscriber> list;

    Group ()
    {
        this.list = new ArrayList<>();
    }

    public void subscribe(ISubscriber user)
    {
        list.add(user);
    }

    public void  unsubscribe(ISubscriber user)
    {
        list.remove(user);
    }

    public void  notify_user(String msg)
    {
        for(var user: list)
        {
            user.notifySubscriber(msg);
        }
    }
}
