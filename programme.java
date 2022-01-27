import java.util.Scanner;

import Ex1.Ex1;
import Ex2.Ex2;

public class programme
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir une année: ");
        String reponse = sc.nextLine();
        Ex1 cas1 = new Ex1();
        Ex2 cas2 = new Ex2();
        cas1.showPreviousLeap(reponse);
        cas2.showNextLeap(reponse);
    }
}