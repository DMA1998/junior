package procedural.lesson_01;

public class Numbers3 {


    public static void main(String[] args) {
        String numb = "NaN";
        String hexadecimal = "0x15";

        int cool = 1*16^1 +1*16^0; int a = 1^15;

        double d1 = Double.parseDouble(numb);
        float f1 = Float.valueOf(numb);
        int i1 = Integer.decode(hexadecimal);
        //int i2 = Integer.parseInt(hexadecimal); doesn't work

        System.out.println(d1);
        System.out.println(f1);
        System.out.println(i1);



    }

}
