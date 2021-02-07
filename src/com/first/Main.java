package com.first;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long epoch;//For epoch value as int can not hold value from 2023
        String DateFormat;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the date");
        DateFormat = input.nextLine();
        System.out.println("Your Entered Format is : "+DateFormat);
        DateValidation(DateFormat);

    }
    
    public static void DateValidation(String DateFormat){
        long calculate = 0;
        List<SimpleDateFormat> formatString = new ArrayList<SimpleDateFormat>();
        formatString.add(new SimpleDateFormat("dd/mm/yyyy"));
        formatString.add(new SimpleDateFormat("mm/dd/yyyy"));
        formatString.add(new SimpleDateFormat("dd-mm-yyyy"));
        formatString.add(new SimpleDateFormat("mm-dd-yyyy"));
        formatString.add(new SimpleDateFormat("dd.mm.yyyy"));
        formatString.add(new SimpleDateFormat("mm.dd.yyyy"));
        formatString.add(new SimpleDateFormat("ddmmyyyy"));
        formatString.add(new SimpleDateFormat("mmddyyyy"));
        if (DateFormat.trim().equals(""))      //To Check if the entered string is empty
        {
            System.out.println("Entered String is empty.");

        }else {

            for (SimpleDateFormat pattern : formatString){
                try{
                     pattern.parse(DateFormat);
                    calculate = pattern.parse(DateFormat).getTime()/1000;

                   }catch (ParseException e){
                }

            }

            if (calculate != 0 && calculate>0){
                System.out.println(calculate);
            }else {
                System.out.println("Unable to convert the provided date");
            }


        }
    }
}
