public class App {
    public static void main(String[] args) throws Exception {
        
        String[] students = {"Saleh","Othman","Maha","Nasser","Nada"};

       /* for(int i = 0 ; i < students.length; i++)
        {
            System.out.println(students[i]);
        }
            int i = 0;
            while (i < 10) {
                System.out.println(students[i]);
            i++;
        }*/

        String[] WeekDays = {"Sat","Sun","Mon","Tue","Wed","Thr","Fri"};
        for(int i = 0 ; i < WeekDays.length; i++)
        {
            if (i <= 6) // Otherwise: if (i >= 5) break;}
            {
                System.out.println(WeekDays[i]);
            }
        }

        
    }
}
