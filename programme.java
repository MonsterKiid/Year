import java.util.Scanner;

import Ex1.Ex1;
import Ex2.Ex2;
import Year.Year;

public class programme
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir une année: ");
        Year year = Year.parse(sc.nextLine());
        if (year.isLeap()) {
            System.out.println("Cette année est bissextile");
        } else {
            System.out.println("Cette année n'est pas bissextile");
        }
        System.out.println("Cette année contient " + year.length() + " jours");
        Ex1 cas1 = new Ex1();
        Ex2 cas2 = new Ex2();
        cas1.showPreviousLeap(year);
        cas2.showNextLeap(year);
    }
}