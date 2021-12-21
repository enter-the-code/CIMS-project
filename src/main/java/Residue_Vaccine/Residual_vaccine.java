package Residue_Vaccine;


public class Residual_vaccine {
    private static Residual_vaccine residual_vaccine = null;
    private static int quantity = 5;

    private Residual_vaccine() {
    }

    public static int Left_Vaccine_View(){
        return residual_vaccine.quantity;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Residual_vaccine.quantity = quantity;
    }

    public static void Notification_Residual_vaccine(){

    }

}

