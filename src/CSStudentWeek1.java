public class CSStudentWeek1 {

    public static void main(String[] args) {
        CSStudentWeek1 cs1 = new CSStudentWeek1();
        cs1.day(WEEKDAY.Monday);
        cs1.tuesday();
        cs1.weekendDay(WEEKDAY.Sunday);
    }

    public void day(WEEKDAY weekday)
    {
        System.out.println();
        System.out.println(String.format("Get out of bed at 0600 its %s" , weekday));
        System.out.println("get breakfast");
        System.out.println("Go to school");
        System.out.println("Programming");
        System.out.println("go to sleep");
    }

    public void tuesday()
    {
        System.out.println();
        System.out.println( String.format("Get out of bed at 0600 its %s" , WEEKDAY.Tuesday));
        System.out.println("get breakfast");
        System.out.println("Dont go to school, I dont care what grade I get");
        System.out.println("Programming");
        System.out.println("go to sleep");
    }

    public void weekendDay(WEEKDAY weekday)
    {
        System.out.println();
        System.out.println(String.format("Get out of bed at 0600 its %s I need to make my Week assignment" , weekday));
        System.out.println("get breakfast");
        System.out.println("Programming");
        System.out.println("Submit assignment");
        System.out.println("go to sleep");

    }

    enum WEEKDAY
    {
        Monday,
        Tuesday,
        Wednesday,
        Saturday,
        Sunday
    }

}
