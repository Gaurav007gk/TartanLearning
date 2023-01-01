class myException extends RuntimeException{
    myException(String s){
        super(s);
    }
}
public class except4 {
  static void validage(int age) throws myException {
      if(age<18){
          throw new myException("Not Valid");
          //throw new ArithmeticException("Not Valid");
      }else{
          System.out.println(("Welcome to vote"));
      }

  }

  public static void main(String args[]) {
//      try{
//          validage(Integer.parseInt(args[0]));
//     // }catch(ArithmeticException e){
//      }catch( myException my){
//
//          System.out.println(e);
//      }
                validage(Integer.parseInt(args[0]));

      System.out.println("Testing complete");
  }
}
