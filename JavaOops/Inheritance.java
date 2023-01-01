public class inheritance {
    static int i = 10;

    inheritance() {
        System.out.println("value of i in parent class: " + i);
    }
}

    class child1 extends inheritance {
        child1() {
            super();
            System.out.println("child2 class" + i);
        }

    }

    class child3 extends inheritance {
        child3() {
            super();
            System.out.println("child class" + i);

        }
    }
    class inheritdemo
    {
        public static void main(String args[]){
            child3 obj1= new child3();
            child1 obj2= new child1();
        }

    }


