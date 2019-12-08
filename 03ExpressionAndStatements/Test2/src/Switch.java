public class Switch {
    public static void main(String[] args) {

        String month = "july";
        switch (month.toLowerCase()){
            case "january": case "february": case "march":
                System.out.println("First quarter of the year");
            break;
            case "april": case "may": case "june":
                System.out.println("Second quarter of the year.");
            case "july": case "august": case "september":
                System.out.println("Third quarter of the year");
                break;
            case "october":case "november": case "december":
                System.out.println("Last quarter of the year");
                break;
            default:
                System.out.println("Unkonwn month");
                break;
        }
    }
}












