package com.example.CurrencyConverter;
import java.util.*;
import java.text.DecimalFormat;
public class Currency_Converter {
    public static void main (string[] args)
    {
      double rupee,dollar,pound,code,euro,KWD;
      DecimalFormat  f = new Decimalformat( Pattern:"##.###");
      Scanner sc= new Scanner(System.in);
      System.out.println("*** Welcome to webeduclick currency converter projrct *** \n enter the currency code " +
              "\n 1:Rupees \n 2:Dollar \n 3:Pound \n 4:Euro \n 5:Kvwaiti Dinar");
      if(code==1)
      {
          system.out.println("Enter amount in rupes");
          rupee =sc.nextDouble();
          dollar =rupee/77.34;
          system.out.println("Doller :" +f.format(dollar));
          pound =rupee/94.46;
          system.out.println("Pound :"+f.format(dollar));
          euro=rupee/80.36;
          system.out.println("Euro :"+f.format(euro));
          KWD=rupee/251.92;
          system.out.println("Kuwaiti Dinar :"+f.format(KWD));
      }
      else  if(code==2)
      {
         system.out.println("Enter amount in dollar:");
         dollar =sc.nextDouble();
         rupee =dollar * 77.34;
         system.out.println("Rupees :" +f.format(rupee));
         pound =dollar * 0.82;
         system.out.println("pound :"+f.format(pound));
         euro =dollar * 0.96;
         system.out.println("Euro :"+f.format(euro));
         KWD =dollar * 0.31;
         system.out.println("Kuwaiti Dinar :"+f.format(KWD));
      }
      else  if (code==3)
     {
         system.out.println("Enter amount in pound:");
         pound =sc.nextDouble();
         rupee =pound * 94.43;
         system.out.println("Rupees :" +f.format(rupee));
         dollar =pound * 1.22;
         system.out.println("Dollar :"+f.format(dollar));
         euro =pound * 1.17;
         system.out.println("Euro :"+f.format(euro));
         KWD =pound * 0.3748;
         system.out.println("Kuwaiti Dinar :"+f.format(KWD));
     }
      else if(code==4)
    {
        system.out.println("Enter amount in Euro");
        euro =sc.nextDouble();
        rupee =euro * 80.43;
        system.out.println("Rupees :" +f.format(rupee));
        dollar =euro * 1.04;
        system.out.println("Dollar :"+f.format(dollar));
        pound =euro * 0.85;
        system.out.println("Pound :"+f.format(pound));
        KWD =euro * 0.318949;
        system.out.println("Kuwaiti Dinar :"+f.format(KWD));
    }
      else if (code==5)
        {
            system.out.println("Enter amount in KWD");
            KWD =sc.nextDouble();
            rupee =KWD * 251.96;
            system.out.println("Rupees :" +f.format(rupee));
            dollar =KWD * 3.26;
            system.out.println("Dollar :"+f.format(dollar));
            pound =KWD * 2.67;
            system.out.println("Pound :"+f.format(pound));
            euro =KWD * 3.13;
            system.out.println("Euro :"+f.format(euro));
        }

      else
          system.out.println( "Invalid code" );
    }
}