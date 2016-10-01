package com.example;
import java.util.Scanner;

public class MyClass
{
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);

        String captainCode="aa1a";
        String firstOfficerCode="22b2";
        boolean silentCountdown=false;

        inputCode(captainCode, "Captain");
        System.out.println("Identity confirmed. Additional authorization required.");

        inputCode(firstOfficerCode, "First Officer");
        System.out.println("Identity confirmed. Auto-destruct sequence armed.\nSpecify time until auto-destruct");

        System.out.println("Minutes: ");
        int minutes=in.nextInt();
        System.out.println("Seconds: ");
        int seconds=in.nextInt();

        System.out.println("If silent countdown, enter s now. Otherwise, enter any other letter");
        if(in.next().equals("s"))
            silentCountdown=true;

        if(minutes>0)
            System.out.println("Auto destruct in " + minutes + " minutes and " + seconds + " seconds");
        else
            System.out.println("Auto destruct in " + seconds + " seconds");

        if(silentCountdown)
            System.out.println("There will be no further auto destruct warnings.");

    }

    private static void inputCode(String code, String officer)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(officer + ", enter code for auto destruct sequence");
        String codeIn=in.next();
        int counter=0;

        while (!codeIn.equals(code))
        {
            counter++;
            System.out.println("Invalid code!");

            if (counter == 2)
                System.out.println("If correct code is not inputted on next attempt,\nall ship command codes will be disabled, and \ndistress beacon will be activated");
            if (counter == 3)
            {
                System.out.println("Incorrect code has been entered three times.\nall command codes have been disabled, and \ndistress beacon has been activated");
                while (1 == 1)
                {
                    boolean deadInTheWater = true;
                }
            }
            codeIn = in.next();
        }
    }
}
