import javax.swing.JOptionPane;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        check();
    }
    public static void check(){
        LocalDateTime now = LocalDateTime.now();
        String time = now.toString();
        String result = time.substring(11, 19);
        System.out.println(result);

    }
}