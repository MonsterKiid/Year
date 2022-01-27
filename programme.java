import java.util.Scanner;

import Ex1.Ex1;
import java.time.Year;

public class programme
{
    public static void main(String[] args)
    {
        Ex1 cas = new Ex1();

        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir une année: ");
        Year year = Year.parse(sc.nextLine());

        showLeap(year);
        showNumberDays(year);
        
        cas.showPreviousLeap(year);
        cas.showNextLeap(year);
    }

    public static void showLeap(Year year)
    {
        if (year.isLeap()) {
            System.out.println("Cette année est bissextile");
        } else {
            System.out.println("Cette année n'est pas bissextile");
        }
    }

    public static void showNumberDays(Year year)
    {
        System.out.println("Cette année contient " + year.length() + " jours");
    }
}