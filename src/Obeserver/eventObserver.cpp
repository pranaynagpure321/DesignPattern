
#include<iostream>
#include<map>
#include <string>
#include <vector>
#include <algorithm>


class EventType
{
    public:
    std::string name;
    public: 
    EventType()
    {
    }
    ~EventType()
    {}
};
class User
{
    public:
    std::string name;
    std::string email;
    int age;
    public:
    User(std::string name, int age, std::string email)
    {
        this->name = name;
        this->age = age;
        this->email = email;
    }
    
    bool operator==(const User &user)
    {
        return this->email ==  user.email;
    }
    ~User(){}

};

class EventListner
{
    private:
    std::map<EventType *, std::vector<User>> mp;
    // subscrible

    public:
    EventListner(){}
    ~EventListner(){}
    void add(EventType *type , User &user)
    {
        mp[type].push_back(user);
    }
    // unsubscribe
    void remove(EventType *type , User &user)
    {
        auto &event = mp[type];
        auto it = std::find(event.begin(),event.end(),user);
        if(it != event.end())
        event.erase(it);
    }
    //notify
    void notify(EventType *type)
    {
        auto &event = mp[type];
        for(auto &user : event)
        {
            std::cout << "User " << user.name << " received notification for " << type->name << std::endl;
        }
    }
        
};



class musicEvent : public EventType
{
    
    EventListner *listner = new EventListner();
    public:
    
    musicEvent(){
        name = "musicEvent";
    }
    ~musicEvent(){}

    void addSubcriber(User &user)  
    {
        listner->add(this,user);
    }

    void removeSubscriber(User &user)
    {
        listner->remove(this,user);
    }

    void notify()
    {
        listner->notify(this);
    }

};

class comedyEvent : public EventType
{
    EventListner *listner = new EventListner();
    public :
    comedyEvent(){  name = "comedyEvent";}
    ~comedyEvent(){}

    void addSubcriber(User &user)  
    {
        listner->add(this,user);
    }

    void removeSubscriber(User &user)
    {
        listner->remove(this,user);
    }

    void notify()
    {
        listner->notify(this);
    }

};

int main()
{
    User user1("pranay",28,"abc@gmail.com");
    User user2("yamini",25,"xyz@gmail.com");
    User user3("unnati",25,"xrc@c.om");

    musicEvent *music = new musicEvent();
    comedyEvent *comedy = new comedyEvent();

    music->addSubcriber(user1);
    music->addSubcriber(user2);
    comedy->addSubcriber(user3);

    music->notify();
    comedy->notify();
}


