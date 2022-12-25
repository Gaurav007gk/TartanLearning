public class LearnOops {
    int fact_id;
    String fac_name;
    void display() {
        System.out.println("faculty id: " + fact_id);
        System.out.println("fac_Name" + fac_name);
    }
    public static void main(String[] args) {

        LearnOops f1 = new LearnOops();
        f1.fact_id = 1;
        f1.fac_name = "Amit";
        LearnOops f2 = new LearnOops();
        f2.fact_id = 2;
        f2.fac_name = "Gaurav";
        f1.display();
        f2.display();
    }


}
