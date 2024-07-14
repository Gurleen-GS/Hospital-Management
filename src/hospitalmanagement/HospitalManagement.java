package hospitalmanagement;
import java.util.*;

import Hospital.Appointment;
import Hospital.Doctor;
import Hospital.Patient;
public class HospitalManagement
{
    private static  ArrayList<Patient> patients =new ArrayList<>();
    private static  ArrayList<Doctor> doctors =new ArrayList<>();
    private static  ArrayList<Appointment> appointments =new ArrayList<>();
    public static void main(String[] args) 
    {
        Scanner ob=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice=ob.nextInt();

            switch(choice)
            {
                case 1:
                    addPatient(ob);
                    break;
                case 2:
                    addDoctor(ob);
                    break;
                case 3:
                    scheduleAppointment(ob);
                    break;
                case 4:
                    viewPatients();
                    break;
                case 5:
                    viewDoctors();
                    break;
                case 6:
                    viewAppointments();
                    break;
                case 0:
                    System.out.println("EExiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        
        }while(choice!=0);
      
    }
    private static void addPatient(Scanner ob)
    {
        System.out.println("Enter the Patient Name");
        String name=ob.next();
        System.out.println("Enter Patient age");
        int age=ob.nextInt();
        System.out.println("Enter Patient Gender");
        String gender=ob.next();


        Patient patient=new Patient(name,gender,age);
        patients.add(patient);
        System.out.println("Patient added successfully");
    }

    private static void addDoctor(Scanner ob) 
    {
        System.out.print("Enter Doctor Name: ");
        String name = ob.next();
        System.out.print("Enter Doctor Specialty: ");
        String specialty = ob.next();

        Doctor doctor = new Doctor(name, specialty);
        doctors.add(doctor);

        System.out.println("Doctor added successfully!");
    }

     private static void scheduleAppointment(Scanner ob) 
     {
        System.out.print("Enter Patient ID: ");
        int patientId = ob.nextInt();
        System.out.print("Enter Doctor ID: ");
        int doctorId = ob.nextInt();
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String date = ob.next();

        Patient patient = findPatientById(patientId);
        Doctor doctor = findDoctorById(doctorId);

        if (patient != null && doctor != null) 
        {
            Appointment appointment = new Appointment(patient, doctor, date);
            appointments.add(appointment);
            System.out.println("Appointment scheduled successfully!");
        } 
        else 
        {
            System.out.println("Invalid Patient ID or Doctor ID.");
        }
    }
    private static void viewPatients() 
    {
        System.out.println("List of Patients:");
        for (Patient patient : patients) 
        {
            System.out.println(patient);
        }
    }

    private static void viewDoctors() 
    {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) 
        {
            System.out.println(doctor);
        }
    }

    private static void viewAppointments() 
    {
        System.out.println("List of Appointments:");
        for (Appointment appointment : appointments) 
        {
            System.out.println(appointment);
        }
    }
    private static Patient findPatientById(int id) 
    {
        for (Patient patient : patients) 
        {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }

    private static Doctor findDoctorById(int id) 
    {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) 
            {
                return doctor;
            }
        }
        return null;
    }

}