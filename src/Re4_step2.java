
import java.lang.NullPointerException;

public class Re4_step2 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("間違えています"+e);

        }
    }
}
