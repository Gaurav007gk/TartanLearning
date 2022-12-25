public class excep2 {

    public static void main(String args[]){
        int i=10;
        try{
            i=i/Integer.parseInt(args[0]);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e1){
            System.out.println(e1);
        }
        System.out.println("value of i is: " + i);
    }
}
