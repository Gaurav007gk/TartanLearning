public class StringPractice {

public static void main(String[] args){
    String brand="HappyCoding";
    System.out.println(brand);
    for(int i=0; i<brand.length(); i++){
        System.out.println(brand.charAt(i));
    }
    System.out.println(brand.length());
    System.out.println(brand.substring(0,7));
    System.out.println(brand.isEmpty());
    System.out.println(brand.toUpperCase());
    System.out.println(brand.toLowerCase());
    System.out.println(brand.indexOf(5));
    String addString="practice";
    String newBrand=brand + addString;
    System.out.println(newBrand);
    StringBuilder str= new StringBuilder(newBrand);
    System.out.println(str);
    str.append('d');
    System.out.println(str);
    str.reverse();
   System.out.println(str);
}

}
