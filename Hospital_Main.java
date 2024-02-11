//  package Hospital_Management;

import java.io.*;
import java.util.*;











interface medicalInterface
{
    void new_medi();
    void show_medi();
}
interface fecilityInterface{
    void add_feci();
    void show_feci();
}
interface patientInterface{
    void new_patient();
    void patient_info();
}
interface labInterface{
    void new_feci();
    void feci_list();
}
interface staffInterface{
    void new_staff();
    void staff_info();
}
class AuthenticationException extends Exception 
{
    public AuthenticationException(String message)
    {
        super(message);
    }
}



public class Hospital_Main
{
    public static void main(String args[])
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String pwd;
        try 
        {
            System.out.print("Enter password :: ");
            pwd = br.readLine();

            if (!pwd.equalsIgnoreCase("Sumit001"))
                throw new AuthenticationException("Incorrect password\nType correct password");
            else 
            {
                System.out.println("Welcome User !!!");
                int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("             Welcome to Hospital Management System Project in Java   ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                Doctortemp[] d = new Doctor[25];
                patient[] p = new patient[100];
                lab[] l = new lab[20];
                Facility[] f = new Facility[20];
                medical[] m = new medical[100];
                staff[] s = new staff[100];

                int i;
                for (i = 0; i < 25; i++)
                    d[i] = new Doctor();
                for (i = 0; i < 100; i++)
                    p[i] = new patient();
                for (i = 0; i < 20; i++)
                    l[i] = new lab();
                for (i = 0; i < 20; i++)
                    f[i] = new Facility();
                for (i = 0; i < 100; i++)
                    m[i] = new medical();
                for (i = 0; i < 100; i++)
                    s[i] = new staff();

                Scanner input = new Scanner(System.in);
                int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
                while (status == 1) {
                    System.out.println("\nMAIN MENU");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("1. Doctors \n2. Patients \n3. Medicines \n4. Laboratories \n5. Facilities \n6. Staff \n7. Exit");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1: {
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("                        DOCTOR SECTION");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            s1 = 1;
                            while (s1 == 1) {
                                System.out.println("1.Add New Entry\n2.Existing Doctors List");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        d[count1].new_doctor();
                                        count1++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count1; j++) {
                                            d[j].doctor_info();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s1 = input.nextInt();
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("                 !!!!!!!!!!**PATIENT SECTION**!!!!!!!!!!");
                            System.out.println("--------------------------------------------------------------------------------");
                            s2 = 1;
                            while (s2 == 1) {
                                System.out.println("1.Add New Entry\n2.Existing Patients List");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        p[count2].new_patient();
                                        count2++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("id \t Name \t Address \t  Disease \t Gender \t Admit Status \t Age");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count2; j++) {
                                            p[j].patient_info();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s2 = input.nextInt();
                            }
                            break;
                        }
                        case 3: {
                            s3 = 1;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("                         MEDICINE SECTION");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            while (s3 == 1) {
                                System.out.println("1.Add New Entry\n2. Existing Medicines List");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        m[count3].new_medi();
                                        count3++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("Name \t Company \t Expiry Date \t Cost");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count3; j++) {
                                            m[j].show_medi();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s3 = input.nextInt();
                            }
                            break;
                        }
                        case 4: {
                            s4 = 1;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("                      LABORATORY SECTION");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            while (s4 == 1) {
                                System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        l[count4].new_feci();
                                        count4++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("Fecilities\t\t Cost");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count4; j++) {
                                            l[j].feci_list();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s4 = input.nextInt();
                            }
                            break;
                        }
                        case 5: {
                            s5 = 1;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("          HOSPITAL FACILITY SECTION");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            while (s5 == 1) {
                                System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        f[count5].add_feci();
                                        count5++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("Hospital  Facility are:");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count5; j++) {
                                            f[j].show_feci();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s5 = input.nextInt();
                            }
                            break;
                        }
                        case 6: {
                            s6 = 1;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("                         STAFF SECTION");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            while (s6 == 1) {
                                String a = "nurse", b = "worker", c = "security";
                                System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        s[count6].new_staff();
                                        count6++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count6; j++) {
                                            if (a.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count6; j++) {
                                            if (b.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                    case 4: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count6; j++) {
                                            if (c.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s6 = input.nextInt();
                            }
                            break;
                        }
                        case 7: {
                            System.exit(0);
                        }

                        default: {
                            System.out.println(" You Have Enter Wrong Choice!!!");

                        }
                    }
                    System.out.println("\nReturn to MAIN MENU Press 1");
                    status = input.nextInt();
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (AuthenticationException a) {
            a.printStackTrace();
        }
    }
}