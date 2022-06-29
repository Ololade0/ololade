package HospitalManagementSystem;

public class Doctor {
    private String name;
    private String gender;
    private int age;
    private String doctorsSpecialty;
    private String doctorsQualification;

    public Doctor(String name, String gender, int age, String doctorsSpecialty, String doctorsQualification){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.doctorsSpecialty = doctorsSpecialty;
        this.doctorsQualification = doctorsQualification;

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getDoctorsSpecialty() {
        return doctorsSpecialty;
    }

    public String getDoctorsQualification() {
        return doctorsQualification;
    }
}

