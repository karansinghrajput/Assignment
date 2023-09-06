// Q1 1. Write a program to demonstrate method overloading with 3 different parameters.

class Overload{

    void add(int a, int b,int c){
        
        int e = a + b + c;
        System.out.println("The add of three number is " +e);
    }

    void add(int a, float b,double c)
    {
        double e = a+b+c;
        System.out.println("The addition of three number is " +e); 
    
    }

     void add(int a, int b,long c)
    {
        long e = a+b+c;
        System.out.println("The addition of three number is " +e); 
    
    }
}


class A1{
   
    public static void main(String[] args) {
     
        Overload obj = new Overload();
        obj.add(4,5,6);
        obj.add(4,5.5f,666.9);
        obj.add(10,16,2324242);
    }
}