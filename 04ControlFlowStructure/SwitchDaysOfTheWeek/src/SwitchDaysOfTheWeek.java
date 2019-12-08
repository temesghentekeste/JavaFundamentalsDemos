public class SwitchDaysOfTheWeek {
    public static void main(String[] args) {
        dayOftheWeek(0);
        dayOftheWeek(3);
        dayOftheWeek(6);
        dayOftheWeek(10);
    }

    public static void dayOftheWeek(int intday) {
        switch (intday){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thurseday");
                break;
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Unkonwn");
                break;
        }
    }
}
