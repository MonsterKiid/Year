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
                System.out.println("L'ann�e bissextile pr�c�dente �tait : " + currentYear.minusYears(i).toString());
                leap = true;
            }
        }        
    }
}