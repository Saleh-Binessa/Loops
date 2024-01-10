public class App {
    public static void main(String[] args) throws Exception {

        String[] WeekDays = { "Sat", "Sun", "Mon", "Tue", "Wed", "Thr", "Fri" };
        for (int i = 0; i < WeekDays.length; i++) {
            if (i <= 6) // Otherwise: if (i >= 5) break;}
            {
                System.out.println(WeekDays[i]);
            }
        }
    }
}
