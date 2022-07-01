package study2;

public class Derived extends Base {

    int y;

    Derived(int a, int b) {

        super(a);
        y = b;

    }

    void countMethod(int x, int y) {
        int t = x + y;
        int z = x * y;
        System.out.println(t);
        System.out.println(z);
    }

    void Display() {

        System.out.println();

    }


}