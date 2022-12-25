public class finalKey {
    void m1() {
        System.out.println("parent class");
    }
}
class finalchild extends finalKey{
  void m1(){
      System.out.println("child class");
  }
}
class finaltest{

    public static void main(String args[]){

        finalchild obj1= new finalchild();
        obj1.m1();
    }
}


