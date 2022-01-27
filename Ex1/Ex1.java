package Ex1;

import Year.Year;

public class Ex1
{
    public void showPreviousLeap(Year year)
    {
        boolean leap = false;
        for(int i = 1; i != year.getValue() && !leap; i++)
        {
            if (Year.isLeap(year.minusYears(i).getValue()))
            {
                System.out.println("L'année bissextile précédente était : " + year.minusYears(i).toString());
                leap = true;
            }
        }        
    }
} 