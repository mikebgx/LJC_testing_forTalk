/**
 * Created by mikeburton on 16/12/2016.
 */
public class Adder {

    Inputter inputter;

    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.setInputter( new InputterImpl(System.in) );
        System.out.println( "I can add 3 numbers for you, yehay!! ...");
        int result= adder.add3InputInts();
        System.out.println( "Total is "+ result );
    }

    public int add3InputInts() {
        int tot= 0;
        for (int i=0; i<3; i++) {
            tot += inputter.nextInt();
        }
        return tot;
    }

    public void setInputter(Inputter inputter) {
        this.inputter = inputter;
    }
}
