import javax.swing.JOptionPane;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        check();
    }
    public static void check(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

    }
}