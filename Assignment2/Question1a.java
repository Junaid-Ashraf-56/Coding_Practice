package Assignment2;
class Patient{
    private int patientId;
    private String name;
    private int age;
    private String medicalHistory;
    private String prescription;
    private  String role;

    public Patient(){
        this(404,"404",404,"404","404","404");
    }

    public Patient(int patientId, String name, int age, String medicalHistory, String prescription,String role) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.prescription = prescription;
        this.role = role;
    }
    public void setPatientInfo(int patientId, String name, int age, String medicalHistory, String prescription) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.prescription = prescription;
    }
    public void setRole(String role){
        this.role=role;
    }
    public int getPatientId(){
        return patientId;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void updatePatientInfo(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void updateMedicalInfo(String medicalHistory,String prescription){
        if(role.equalsIgnoreCase("doctor")) {
            this.medicalHistory = medicalHistory;
            this.prescription = prescription;
            System.out.println("Medical record updated successfully!");
        } else {
            System.out.println("Unauthorized access! Only doctors can update medical records.");
        }
    }
    public void display(){
        System.out.println();
        System.out.println("------------------------------\n");
        System.out.println("Patient Information");
        System.out.println("------------------------------\n");
        System.out.println("Patient ID "+getPatientId()+"\nName "+getName()+"\nAge "+ getAge()+"\nMedical History "+ medicalHistory+"\nPrescription "+prescription);
        System.out.println("------------------------------\n");
    }
}
public class Question1a {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.setPatientInfo(1,"Junaid",19,"No","No");
        p1.setRole("Doctor");
        p1.updateMedicalInfo("Yes","Yes");
        p1.updatePatientInfo("Junaid Ashraf",20);
        p1.display();

        Patient p2 = new Patient(2,"Mannan",21,"no","no","patient");
        p2.updateMedicalInfo("No","no");
        p2.updatePatientInfo("Mannan Khan",22);
        p2.display();
    }
}
