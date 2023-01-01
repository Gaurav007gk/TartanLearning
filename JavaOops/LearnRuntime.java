class runtime {
   int i=20;
    void m1(){

        System.out.println("Class Parent");

    }

}
class runtime2 extends  runtime{
   int i=30;
    void m1(){
        System.out.println("class child");
    }
}
class runtime3 extends runtime2{
    int i=35;
    void m1(){
        System.out.println("class child-2");
    }
}

public class LearnRuntime{
    public static void main (String args[]) {
        runtime obj1 = new runtime();
        runtime2 obj2 = new runtime2();
        runtime3 obj3 = new runtime3();
        System.out.println(obj1.i);
        System.out.println(obj2.i);
        System.out.println(obj3.i);


    }
}
