/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

#include <iostream>

class Strategy{

    public: 
    virtual ~Strategy() = default;
    virtual int algorithmInterface_discounts(int a , int b) = 0;
};

class sale : public Strategy
{
    public:
    sale(){}
    ~sale(){}

    int algorithmInterface_discounts(int a , int b) override
    {
        return a-b;
    }
};


class Diwalisale : public Strategy
{
    public:
    Diwalisale(){}
    ~Diwalisale(){}

    int algorithmInterface_discounts(int a , int b) override
    {
        return a-(1.0*a/100)*b;
    }
};

class Cart
{
    private:
    Strategy* strategy;

    public:
    Cart(Strategy* strategy)
    {
        this->strategy = strategy;
    }

    int getDiscount(int a ,int b)
    {
       return this->strategy->algorithmInterface_discounts(a,b);
    }           
};

int main()
{
    int a= 1000, b = 20;

    Cart *cart = new Cart(new Diwalisale());
    std::cout << cart->getDiscount(a,b)<<std::endl;

}
