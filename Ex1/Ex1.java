package Ex1;

import Year.Year;

public class Ex1
{
    public void showPreviousLeap(String year)
    {
        Year currentYear = Year.parse(year);
        boolean leap = false;
        for(int i = 1; i != currentYear.getValue() && !leap; i++)
        {
            if (Year.isLeap(currentYear.minusYears(i).getValue()))
            {
                System.out.println("L'année bissextile précédente était : " + currentYear.minusYears(i).toString());
                leap = true;
            }
        }        
    }
}