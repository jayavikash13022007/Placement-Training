package Final_Task;
import java.util.*;
class PatientNotFoundException extends Exception{
    PatientNotFoundException(String s){
        super(s);
    }
}
class DoctorNotFoundException extends Exception{
    DoctorNotFoundException(String s){
        super(s);
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
abstract class Person{
    private int ID;
    private String Name;
    Person(int ID,String Name){
        this.ID=ID;
        this.Name=Name;
    }
    void displayDetails(){
        System.out.println("ID: "+ID+"\nName: "+Name+"\n");
    }
    int getID(){
        return ID;
    }
    String getName(){
        return Name;
    }
}
class Department{
    private int DepID;
    private String DepName;
    Department(int DepID,String DepName){
        this.DepID=DepID;
        this.DepName=DepName;
    }
}
class Patient extends Person{
    private int Age;
    private String Disease,BloodGroup;
    Patient(int ID,String Name,int Age,String Disease,String BloodGroup) throws InvalidAgeException{
        super(ID,Name);
        if(Age<=0) throw new InvalidAgeException("Invalid Age");
        this.Age=Age;
        this.Disease=Disease;
        this.BloodGroup=BloodGroup;
    }
    void displayDetails(){
        System.out.println("Patient ID: "+getID()+"\nName: "+getName()+"\nAge: "+Age+"\nDisease: "+Disease+"\nBlood Group: "+BloodGroup+"\n");
    }
}
class Doctor extends Person{
    private int Fee;
    private String Speciality,Experience;
    Doctor(int ID,String Name,int Fee,String Speciality,String Experience){
        super(ID,Name);
        this.Speciality=Speciality;
        this.Experience=Experience;
        this.Fee=Fee;
    }
    void displayDetails(){
        System.out.println("Doctor ID: "+getID()+"\nName: "+getName()+"\nSpeciality: "+Speciality+"\nExperience: "+Experience+"\nFee: "+Fee+"\n");
    }
}
class Appointment{
    private int AppointmentID;
    private Patient patient;
    private Doctor doctor;
    private String Date,Time,Status;
    Appointment(int AppointmentID,Patient patient,Doctor doctor,String Date,String Time,String Status){
        this.AppointmentID=AppointmentID;
        this.patient=patient;
        this.doctor=doctor;
        this.Date=Date;
        this.Time=Time;
        this.Status=Status;
    }
}
class Hospital{
    ArrayList<Patient> Patients=new ArrayList<>();
    ArrayList<Doctor> Doctors=new ArrayList<>();
    ArrayList<Department> Departments=new ArrayList<>();
    LinkedList<Appointment> Appointments=new LinkedList<>();
    void addPatient(Patient p){
        Patients.add(p);
    }
    void addDoctor(Doctor d){
        Doctors.add(d);
    }
    void addDepartment(Department d){
        Departments.add(d);
    }
    Patient searchPatient(int id) throws PatientNotFoundException{
        for(Patient p:Patients){
            if(p.getID()==id){
                return p;
            }
        }
        throw new PatientNotFoundException("Patient not found");
    }
    Doctor searchDoctor(int id) throws DoctorNotFoundException{
        for(Doctor d:Doctors){
            if(d.getID()==id){
                return d;
            }
        }
        throw new DoctorNotFoundException("Doctor not found");
    }
}
public class Multi_Speciality_Hospital_Management_System{
    public static void main(String[] args){
        Hospital h = new Hospital();
        Scanner s = new Scanner(System.in);
        int ch = 0;
        while(ch != 7){
            System.out.println("1. Add Patient\n2. Add Doctor\n3. Add Department\n4. Add Appointment\n5. Search Patient\n6. Search Doctor\n7. Exit\nEnter your choice: ");
            ch = s.nextInt();
            switch(ch){
                case 1:{
                    System.out.println("Enter Patient Details");
                    System.out.print("Patient ID: ");
                    int id = s.nextInt();
                    s.nextLine();
                    System.out.print("Name: ");
                    String name = s.nextLine();
                    System.out.print("Age: ");
                    int age = s.nextInt();
                    s.nextLine();
                    System.out.print("Disease: ");
                    String disease = s.nextLine();
                    System.out.print("Blood Group: ");
                    String blood = s.nextLine();
                    try{
                        Patient p = new Patient(id,name,age,disease,blood);
                        h.addPatient(p);
                    }
                    catch(InvalidAgeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2:{
                    System.out.println("Enter Doctor Details");
                    System.out.print("Doctor ID: ");
                    int id = s.nextInt();
                    s.nextLine();
                    System.out.print("Name: ");
                    String name = s.nextLine();
                    System.out.print("Fee: ");
                    int fee = s.nextInt();
                    s.nextLine();
                    System.out.print("Speciality: ");
                    String speciality = s.nextLine();
                    System.out.print("Experience: ");
                    String experience = s.nextLine();
                    Doctor d = new Doctor(id,name,fee,speciality,experience);
                    h.addDoctor(d);
                    break;
                }
                case 3:{
                    System.out.println("Enter Department Details");
                    System.out.print("Department ID: ");
                    int id = s.nextInt();
                    s.nextLine();
                    System.out.print("Department Name: ");
                    String name = s.nextLine();
                    Department d = new Department(id,name);
                    h.addDepartment(d);
                    break;
                }
                case 4:{
                    System.out.println("Enter Appointment Details");
                    System.out.print("Appointment ID: ");
                    int appointmentId=s.nextInt();
                    System.out.print("Patient ID: ");
                    int patientId=s.nextInt();
                    System.out.print("Doctor ID: ");
                    int doctorId=s.nextInt();
                    s.nextLine();
                    try{
                        Patient patient=h.searchPatient(patientId);
                        Doctor doctor=h.searchDoctor(doctorId);
                        System.out.print("Date: ");
                        String date=s.nextLine();
                        System.out.print("Time: ");
                        String time=s.nextLine();
                        System.out.print("Status: ");
                        String status=s.nextLine();
                        Appointment a=new Appointment(appointmentId,patient,doctor,date,time,status);
                        h.Appointments.add(a);
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 5:{
                    System.out.print("Patient ID: ");
                    int patientId=s.nextInt();
                    try{
                        Patient patient=h.searchPatient(patientId);
                        patient.displayDetails();
                    }
                    catch(PatientNotFoundException e){
                        System.out.println(e);
                    }
                    break;
                }
                case 6:{
                    System.out.print("Doctor ID: ");
                    int doctorId=s.nextInt();
                    try{
                        Doctor doctor=h.searchDoctor(doctorId);
                        doctor.displayDetails();
                    }
                    catch(DoctorNotFoundException e){
                        System.out.println(e);
                    }
                    break;
                }
                case 7:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        s.close();
    }
}