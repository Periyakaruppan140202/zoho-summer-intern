/* We have used a singleton design pattern to create a single instance and use it globally. */

class Singleton {
    private static Singleton obj;
    private int a = 10;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }

    public int square() {
        return this.a * this.a;
    }

    public void setValue(int a) {
        this.a = a;
    }

    public int getValue() {
        return a;
    }
}

public class Square {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getSingleton();
        System.out.println("Value of a: " + obj1.getValue());
        System.out.println("Square: " + obj1.square());

        obj1.setValue(5);
        System.out.println("Value of a: " + obj1.getValue());
        System.out.println("Square: " + obj1.square());
    }
}