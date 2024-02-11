// package Com_Hospital_Management;

import java.util.Scanner;

public class lab implements labInterface
{
    String Facility;
    int lab_cost;
    public void new_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Facility:-");
        Facility = input.nextLine();
        System.out.print("cost:-");
        lab_cost = input.nextInt();
    }
    public void feci_list()
    {
        System.out.println(Facility + "\t\t" + lab_cost);
    }
}

