public class accessModifier
{

int i=10;
//public int i=10;
//private int i=10;
//protected int i=10;
void m1(){
    System.out.println("value of i is:"+ i);
}

}
class child extends accessModifier{
    void m2(){
        System.out.println("value of i is: " + i);
    }
}
class inheritdemoo{
    public static void main(String args[]){
        child obj1=new child();
        obj1.m2();
        obj1.m1();
    }

}
