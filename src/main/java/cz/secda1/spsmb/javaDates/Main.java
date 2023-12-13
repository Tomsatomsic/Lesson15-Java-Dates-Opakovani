package cz.secda1.spsmb.javaDates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {

        System.out.println(DateTimeUtils.formattedDate(LocalDateTime.of(2023,12,13,10,22)));

        String dateString = "13.12.2023";
        System.out.println(dateString);




    }
}
