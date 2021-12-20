package Residue_Vaccine;


public class Residual_vaccine {
    private static Residual_vaccine residual_vaccine = null;
    private int quantity;

    private Residual_vaccine() {
    }

    public static int Left_Vaccine_View(){
        return residual_vaccine.quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void Notification_Residual_vaccine(){

    }

}

