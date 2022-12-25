class super1{

    super1(){
        System.out.println("Super class constructor");
    }
    int i=10;
    void m1(){
        System.out.println("Super class method");
    }

}
class child2 extends super1{
    int i=20;
   void  m1(){
        System.out.println("value of i " + super.i);
        super.m1();
    }

}
public class learnSuperK {
    public static void main(String args[]){
        child2 obj = new child2();
        obj.m1();
    }


}
