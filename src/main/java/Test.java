import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        int i = 3;
        switch (i) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("one def");
                break;
        }
        SimpleDateFormat yearNow = new SimpleDateFormat("yyyy");
        int year = Integer.parseInt(yearNow.format(new Date()));
        System.out.println(year);
    }
}
