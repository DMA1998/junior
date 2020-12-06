package procedural.lesson_01;

public class Numbers {

    public static void main(String[] args) {
    int a = 2;
    int b = 4;

        System.out.println("a before:" + a);
        System.out.println("b before:" + b);

        int temp = a;

        a = b;
        b = temp;

        System.out.println("a after:" + a);
        System.out.println("b after:" + b);


    }
}
