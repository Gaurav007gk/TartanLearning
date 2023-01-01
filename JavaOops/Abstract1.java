  abstract class abs1 {
    abstract void m1();
    void m2(){
        System.out.println(("m2 method of abstract class");

    }
}

class abschild extends abs1{
    void m1()
    {
        System.out.println("m1 method of child class");
    }    void m3(){
        System.out.println("m3 method of child class");
    }
}

class abstract1{

    public static void main(String args[]){
        abschild obj= new abschild();
        obj.m2();
        obj.m3();
    }
}