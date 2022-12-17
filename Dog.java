public class Dog {
    public int WeightInPounds;
    public Dog(int w) {
        WeightInPounds = w;
    }
    public void makeNoise() {
        if (WeightInPounds < 10 ) {
            System.out.println("yip!");
        } else if (WeightInPounds < 28) {
            System.out.println("barks");
        } else {
            System.out.println("Wooof!");
        }
    } 
    }
