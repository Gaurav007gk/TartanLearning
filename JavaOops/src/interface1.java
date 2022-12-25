class interface1 implements i1 {

    public void m1(){
        System.out.println("value of i"+1);
    }

    public static void main(String args[]){

        System.out.println("test");
        interface1 obj= new interface1();
        obj.m1();
    }
}
