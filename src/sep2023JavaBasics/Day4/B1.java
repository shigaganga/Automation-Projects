package sep2023JavaBasics.Day4;

class A{    
A get(){return this;}   //return type is object of class A 
}    
    
public class B1 extends A{    
@Override  
B1 get(){return this;}   //return type is object of claas B 
void message(){System.out.println("welcome to covariant return type");}    
    
public static void main(String args[]){    
new B1().get().message();    
}    
}     

