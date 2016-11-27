package calenderpractice;


import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.*;
import java.util.Calendar;
import java.util.Date;

public class CalenderPractice {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,0);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        System.out.println(cal.getTime() +" "+ formatted);

        }
    }

