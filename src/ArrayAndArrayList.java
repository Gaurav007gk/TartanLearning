import java.util.ArrayList;

public class ArrayAndArrayList {

    public static void main(String[] args){

        int arr[]= new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=5;
        arr[4]=6;
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        ArrayList<Integer> ar= new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(4);
        ar.add(6);
        ar.remove(2);
        for(int i=0; i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}
