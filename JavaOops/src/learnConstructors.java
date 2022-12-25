public class learnConstructors {
     int i;
     String name;
     float f;
     double d;
    learnConstructors(int x, String n, float y,double z){
        i=x;
       name=n;
       f=y;
       d=z;
    }
  learnConstructors(){
      i=50;
      name="Gaurav";
      f=4.6f;
      d=13.5;

  }
  public static void main(String[] args){
        learnConstructors obj1= new learnConstructors(17, "LearnJava",13.5f,3.5);
        learnConstructors obj2= new learnConstructors();
        System.out.println(obj1.i);
        System.out.println(obj1.name);
        System.out.println(obj1.f);
        System.out.println(obj1.d);
      System.out.println(obj2.i);
      System.out.println(obj2.name);
      System.out.println(obj2.f);
      System.out.println(obj2.d);

  }


}
