package Ex2;

import Year.Year;

public class Ex2
{
    public void showNextLeap(String year)
    {    
        Year currentYear = Year.parse(year);
        boolean leap = false;
        for(int i = 1; !leap; i++)
            {
                if (currentYear.plusYears(i).isLeap())
                {
                    System.out.println("L'année bissextile prochaine est : " + currentYear.plusYears(i).toString());
                    leap = true;
                }
            }
    }
}