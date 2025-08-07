package fundamentos;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Import {
    public static void main(String[] args) {
        Date d = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();

        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int sec = calendar.get(Calendar.SECOND);

        System.out.println("Hora atual:" + hora + ":" + minutes);
    }
}
