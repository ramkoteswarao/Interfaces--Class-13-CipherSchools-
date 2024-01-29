interface shape{
    double pi=3.14;//public,static,abstract
    double getsquare(double r);//public , abstract
}
class circle implements shape{
   public double getsquare(double r){
        return r*r;
    }
}
interface numbers{
   int x=10;
   void fun();
}
interface alphabets{
 int x=10;
void fun();
}
interface lost extends numbers{
   void print();
}
class ok implements lost{
    public void print(){
//if we implement a class then it has to override all methods of its paremt methods and its ancistors methods also
    }
    public void fun(){

    }
}
interface k extends numbers,alphabets{
      
}
class B1 implements numbers,alphabets{
    public void fun(){
        System.out.println("Im a method in multiple inheritence");
        System.out.println(alphabets.x+" "+numbers.x);// here to call x we get ambiguity that which x it has to call so we need to call it with its fully qualified name
    }
}
class A{
    int make(int a){
        System.out.println("This  is parent");
        return 0;
    }
}
class B extends A{
    int make(int a){
        System.out.println("This is in child");
        return 0;
    }
    void print(){
        System.out.println("This is 2nd in child");
    }
}
public class Interfaces_13 {//Interfaces are blueprint of class and class is blue print of objects ....
    //interfaces gives more or full abstraction than abstact class to its abstract methods
    //interfaces methods are abstract  and public by default
    // variables init are public,static and abstarct by default even if we dont mention them
    public static void main(String[] args) {
        circle a=new circle();
      System.out.println( a.getsquare(2.5)); 
      A a1=new B();
         a1.make(2);
        //  a1.print();
        B1 l=new B1();
        l.fun();
        
    }
}
