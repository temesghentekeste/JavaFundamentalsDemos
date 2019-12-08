package blogspot.uandiprogramming;

public class FeetInchToCentimeter {

    public static void main(String[] args) {
	// write your code here
        System.out.println(calculateFeetAndInchesToCentimeter(1,1));
        System.out.println(calculateFeetAndInchesToCentimeter(13));
        System.out.println(calculateFeetAndInchesToCentimeter(6,0));
        System.out.println(calculateFeetAndInchesToCentimeter(8,4));
        System.out.println(calculateFeetAndInchesToCentimeter(157));
    }

    public static double calculateFeetAndInchesToCentimeter(double feet, double inches){
        double centimeters = 0;
        if(feet < 0 || ( inches < 0 || inches > 12)){
            return -1;
        }
        centimeters = inches * 2.54 + feet*12*2.54;
        return  centimeters;
    }

    public static double calculateFeetAndInchesToCentimeter(double inches){
        double centimeters = 0;
        double feet = 0;
        if( inches < 0 ){
            return -1;
        }
        if(inches > 12){
            feet = (int)inches/12;
            inches = (int) inches%12;
            System.out.println("Feet: " + feet + " ,inches: " + inches);
        }
        centimeters = calculateFeetAndInchesToCentimeter(feet,inches);
        return  centimeters;
    }
}
