import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by mikeburton on 16/12/2016.
 * Wrap a Scanner (for testability, Mockito etc cant mock Scanner which is a final class)
 */
public class InputterImpl implements Inputter {

    Scanner scanner;

    public InputterImpl(InputStream inputStream) {
        this.scanner= new Scanner(inputStream);
    }

    public int nextInt() {
        System.out.println( "Please enter an int: ");
        return scanner.nextInt();
    }

}
