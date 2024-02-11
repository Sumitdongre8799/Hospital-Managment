
// package Com_Hospital_Management;
import java.util.Scanner;


public class Facility implements fecilityInterface
{
    String fec_name;
    public void add_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fec_name = input.nextLine();
    }
    public void show_feci()
    {
        System.out.println(fec_name);
    }
}
