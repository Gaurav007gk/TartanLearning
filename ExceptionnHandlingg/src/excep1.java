public class excep1 {
    public static void main(String args[]) {

        int i = 10;
        try {
            i = i / Integer.parseInt(args[0]);
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("value of i " + i);

    }
}
