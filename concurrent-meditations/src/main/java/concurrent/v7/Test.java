package concurrent.v7;

/**
 * Created by DT on 16/4/6.
 */
public class Test {


    public static void main(String[] args) {
        int COUNT_BITS = Integer.SIZE - 3;



        System.out.println( Integer.toBinaryString((-1 << COUNT_BITS)));
        System.out.println( Integer.toBinaryString(( 0 << COUNT_BITS)));
        System.out.println( Integer.toBinaryString(( 1 << COUNT_BITS)));
        System.out.println( Integer.toBinaryString(( 2 << COUNT_BITS)));
        System.out.println( Integer.toBinaryString(( 3 << COUNT_BITS)));



    }

}
