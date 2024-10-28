import java.util.Scanner;
class BloodData {

    private static String bloodType = "O,A,B,AB";
    private static String rhFactor;
    public BloodData(){
    	bloodType = "O";
    	rhFactor = "+";
    }
    public BloodData(String bt, String rh){
    	this.bloodType=bt;
    	this.rhFactor=rh;
    	
    }
    public String getBloodType(){
    	return bloodType;
    }
    public void setBloodType(String bloodtype){
    	this.bloodType = bloodtype;
    }
    public String getRhFactor(){
    	return rhFactor;
    }
    public void setRhFactor(String rhfactor){
    	this.rhFactor = rhfactor;
    }
    public void display (){
    System.out.println(bloodType + rhFactor + " is added to the blood bank" );
    }
    	
    
    
}


public class RunBloodData {

    public static void main (String []args) {
    	Scanner sc = new Scanner (System.in);
    	BloodData bd = new BloodData ();
    	System.out.println("Enter blood type of patient: ");
    	bd.setBloodType(sc.nextLine());
    	System.out.println("Enter Rhesus Factor : ");
    	bd.setRhFactor(sc.nextLine());
    	System.out.println();
    	bd.display();
    	System.out.println();
    }
    
    
}