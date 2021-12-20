package Residue_Vaccine;


class hospital {
    private String Location;
    private int Phone_Number;
    private String Business_Hours;

    //constructor
    public hospital(String location, int phone_Number, String business_Hours) {
        Location = location;
        Phone_Number = phone_Number;
        Business_Hours = business_Hours;
    }


    //getter, setter
    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(int phone_Number) {
        Phone_Number = phone_Number;
    }

    public String getBusiness_Hours() {
        return Business_Hours;
    }

    public void setBusiness_Hours(String business_Hours) {
        Business_Hours = business_Hours;
    }
}

