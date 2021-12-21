package Participant;

public class user {

    private String name;
    private String ID;
    private String Password;
    private String Phone_num;

    public user(String s1, String s2, String s3, String s4) {
        name = s1;
        ID = s2;
        Password = s3;
        Phone_num = s4;

    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhone_num() {
        return Phone_num;
    }

    public void Make_Appointment() {

    }

}
