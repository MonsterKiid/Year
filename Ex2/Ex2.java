package Ex2;

import Year.Year;

public class Ex2
{
    public void showNextLeap(String Xyear)
    {    
        Year year = Year.parse(Xyear);
        boolean leap = false;
        for(int i = 1; !leap; i++)
            {
                if (year.plusYears(i).isLeap())
                {
                    System.out.println("L'année bissextile prochaine est : " + year.plusYears(i).toString());
                    leap = true;
                }
            }
    }
}