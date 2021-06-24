/*  link- https://www.javatpoint.com/interface-in-java

    Interface is a blueprint of a class and
    it can only have abstract methods and static constants.

    Purpose of Interfaces :- To perform multiple inheritance in JAVA

    * class extends class
    * class extends interface
    * interface extendes interface
    
    Types of interfaces:-
                        1. Marker Interface  (blank interface)
                        2. Single Abstract method (SAM) a.k.a. Functional Interface
                        3. Normal Interface (more than 1 interface)

    We can also have a default method which behaves like a constructor
    
    default void method(){
        System.out.print('default method')
    }
*/


interface normal_class_interface{
    //by default all the methods decalred here are public and abstract
    public static final int num= 5;
    public abstract void show();
    public abstract void print();
}

interface normal_interface{
    //by default all the methods decalred here are public and abstract
    void show();
    void show2();
}

interface sam_interface{
    //sam can have only 1 function
    void show();
}

// Interfaces supports multiple inheritance
interface extending extends sam_interface, normal_class_interface{

}

//this class implements the interface 'normal_class_interface'
class normal_interface_class implements normal_class_interface{
    
    public void show(){
        System.out.println("In normal_class_interface interface Show");
    }
    public void print(){
        System.out.println("In normal_class_interface print: " + num);
    }

}


public class m_interface {
    
    public static void main(String[] args) {
        
        // using Class
        //Object can be of either iterface type of class type
        normal_interface_class obj= new normal_interface_class();
        obj.show();
        obj.print();

        // using Anonymous
        normal_interface obj1= new normal_interface(){
            
            public void show(){
                System.out.println("In normal_interface Show");
            }
            public void show2(){
                System.out.println("In normal_interface Show2");
            }
        };

        obj1.show();
        obj1.show2();

        // using lambda  -  only works with functional interface
        sam_interface obj2 = () -> System.out.println("In sam_interface Show");
        
        obj2.show();    
    }        
}


// Multiple Inheritance using interface

// interface Bank{  
//     float rateOfInterest();  
//     }  

//     class SBI implements Bank{  

//         public float rateOfInterest(){return 9.15f;}  
//     }  

//     class PNB implements Bank{  

//         public float rateOfInterest(){return 9.7f;}  
//     }  

//     class TestInterface2{  
//     public static void main(String[] args){  

//         Bank b=new SBI();  

//         System.out.println("ROI: "+b.rateOfInterest());  
//     }
// }
    