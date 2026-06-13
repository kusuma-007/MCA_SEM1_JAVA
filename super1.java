import java.util.*;
import java.lang.*;
class Animal
{
     String name="Animal";
     Animal()
     {
        System.out.println("Animal is creted..");
     }
     void eat()
     {
        System.out.println("Animal is eating...");
     }
}

class Dog extends Animal
{
     String name="Dog";  
     Dog()
     {
        super();
        System.out.println(" Dog is creted..");
     }
     void eat()
     {
        super.eat();
        System.out.println("dog is eating...");
     }
     void printName()
     { 
        System.out.println(super.name);
        System.out.println(name);
     }

}
class Super1
{
   public static void main(String args[])
   {
    
    Dog d = new Dog();
    d.printName();
    d.eat();
   }
}
   
        


