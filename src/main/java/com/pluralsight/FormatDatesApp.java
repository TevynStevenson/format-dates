package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;


public class FormatDatesApp {
    public static void main(String[] args) {

        //DateTimeFormatter MM/dd/yyyy
        DateTimeFormatter today = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(today.format(LocalDate.now()));

        //DateTimeFormatter. yyyy-MM-dd
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(date.format(LocalDate.now()));

        //DateTimeFormatter EEEE,MMMM dd, yyyy
        DateTimeFormatter dayAndMonth = DateTimeFormatter.ofPattern("EEEE,MMMM dd, yyyy");
        System.out.println(dayAndMonth.format(LocalDate.now()));

        //ZonedDateTime
        //DateTimeFormatter EEEE, MMM dd, yyyy HH:mm

        ZonedDateTime dayMonthAndTime = ZonedDateTime.now(ZoneId.of("Etc/GMT"));
        DateTimeFormatter dateAndTime = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        System.out.println(dateAndTime.format(dayMonthAndTime));









    }
}
