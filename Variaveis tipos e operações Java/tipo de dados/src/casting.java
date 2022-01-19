//------------------------- AULA 4 ----------------------------
//como fazer casting de variaveis
public class casting {
    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;
        System.out.println("b1= " +  b1);

        long l1;
        int i1= 10;
        l1= i1;
        System.out.println("l1= " + l1);

        int i2;
        long l2= 100000000000000L;
        i2= (int) l2;
        System.out.println("i2= " + i2);

        int i3;
        long l3= 10000;
        i3= (int) l3;
        System.out.println("i3= " + i3);

        double d1;
        float f1= 10.5f;
        d1= f1;
        System.out.println("d1= " + d1);

        float f2, f3;
        double d2= 10000.58d;
        double d3= 10000.5888888888888888888888888888888888888888888888888888888888d;
        f2= (float) d2;
        f3= (float) d3;
        System.out.println("l2= " + l2);
        System.out.println("l3= " + l3);

        int i4;
        float f4= 11.5697f;
        i4= (int) f4;
        System.out.println("i4= "+ i4);
    }
}
