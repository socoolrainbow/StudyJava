package chapter6;

public class HospitalExample
{
    
    public static void main(String[] args)
    {
        // »ó¼Ó
        DoctorValue doctorVo = new DoctorValue();
        NurseValue nurseVo = new NurseValue();
        PatientValue patientVo = new PatientValue();
        PersonValue personVo = new PersonValue();
        
        System.out.println("Doctor Info : " + doctorVo.getInfo());
        System.out.println("Nurse Info : " + nurseVo.getInfo());
        System.out.println("Patient Info : " + patientVo.getInfo());
        System.out.println("Person Info : " + personVo.getInfo());
    }
    
}
