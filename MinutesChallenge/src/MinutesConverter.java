public class MinutesConverter {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(61,1));
        System.out.println(getDurationString(65,145));
    }
    public static String getDurationString(int seconds) {

        int minutes = seconds/60;

        if(seconds >=0){
            return getDurationString(minutes,seconds%60);
        }
        return "Invalid Value";

    }


    public static String getDurationString(int minutes, int seconds) {
        int hours = (minutes / 60) + (seconds/3600);
        int remainingminutes = (minutes % 60)+(seconds%3600)/60;
        int remainingseconds = (seconds%3600)%60;
        if (minutes >= 0 && seconds >= 0) {
            return hours + "h " + remainingminutes + "m " + remainingseconds + "s";
        }
        return "Invalid Value";

    }
}
