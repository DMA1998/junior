package collection.hash;

public class Hcode {

    public static void main(String[] args) {
        Object obj = new Object();

        int hashCode1 = obj.hashCode();
        int hashCode2 = (new Object()).hashCode();
        System.out.println(hashCode1);
        System.out.println(hashCode2);
    }
}
