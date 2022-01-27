package Ex1;

import java.time.Year;

public class Ex1
{
    public void showPreviousLeap(Year year)
    {
        boolean leap = false;
        int val = year.getValue();
        while (!leap)
        {
            val = val - 1;
            leap = Year.isLeap(val);
        }     
        System.out.println("L'année bissextile précédente était : " + val);

    }

    public void showNextLeap(Year year)
    {    
        boolean leap = false;
        int val = year.getValue();
        while(!leap)
        {
            val = val + 1;
            leap = Year.of(val).isLeap();
        }
        System.out.println("L'année bissextile prochaine est : " + val);
    }
}