public class learnOverloading {

    void sum1(int i){
        System.out.println("first function" + i);
    }
    void sum1(int i, int j){
        System.out.println("second function"+(i+j));
    }
    void sum1(int i, int j, int k){
        System.out.println("third function "+(i+j+k));
    }
    public static void main(String args[]){
        learnOverloading obj1= new learnOverloading();
        obj1.sum1(10,20,30);
    }
}
