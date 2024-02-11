
//  package Com_Hospital_Management;

import java.util.Scanner;

public class patient implements patientInterface
{
    String pid, pname, address, disease, Gender, admit_status;
    int age;
    public void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("name:-");
        pname = input.nextLine();

        System.out.println("Address:-");
        address = input.nextLine();



        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("Gender:-");
        Gender = input.nextLine();
        System.out.print("admit_status:-");
        admit_status = input.nextLine();
        System.out.print("age:-");
        age = input.nextInt();
    }
    public void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + address + "\t" + disease +  "\t" + Gender + "\t" + admit_status + "\t" + age);
    }
}
