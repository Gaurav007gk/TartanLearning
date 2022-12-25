public class varArgs {

    public static void m1(int i, String...name){
        int total=0;
        for(int y=1 ;y<=i; y++){
            total=total+y;
        }
        System.out.println("Name is :"+name);
        System.out.println("Total is :"+ total);
    }
    public static void main(String a[]){


        m1(10,"EEC");
    }

}
