public class except3 {
    public static void main(String args[]){
     int i=20;
        try{
            i=i/Integer.parseInt(args[0]);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{

            System.out.println("finally block");
        }
        System.out.println("value of i is:" +i);
    }
}
