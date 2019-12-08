public class SecondsMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(0,59));
        System.out.println(getDurationString(100,59));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(100));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = 0;
        String duration = "Invalid value";
        if(minutes >=0 && seconds >= 0 && seconds <= 59){
            hours = minutes / 60;
            minutes = minutes % 60;
            duration = "";
            //creating "xxh yym zzs"
            String intHours = hours > 9 ? hours + "h " : "0"+hours + "h ";
            String intMinutes = minutes > 9 ? minutes + "m " : "0"+minutes + "m ";
            String intSeconds = seconds > 9 ? seconds + "m " : "0"+ seconds + "m ";
            duration  = intHours + intMinutes + intSeconds;
        }
        return  duration;
    }

    public static String getDurationString(int seconds){
        String duration = "Invalid value";
        if(seconds >= 0){
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes,seconds);
        }
        return duration;
    }

}
