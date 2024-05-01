import java.util.function.Function;

public class CSStudentWeek2 {

    public static void main(String[] args) {
        CSStudentWeek2 cs1 = new CSStudentWeek2();
        cs1.day(WEEKDAY.Monday, (s)->String.format("Go to school it is %s", s));
        cs1.day(WEEKDAY.Tuesday, (s)->String.format("Dont go to school, I dont care what grade I get, its %s", s));
        cs1.day(WEEKDAY.Sunday, (s)->String.format("Go to church it is %s", s));
    }

    public void day(WEEKDAY weekday, Function<String,String> doing)
    {
        System.out.println();
        System.out.println(String.format("Get out of bed at 0600 its %s" , weekday));
        System.out.println("get breakfast");

        System.out.println(doing.apply(weekday.toString()));    //<- Execute arround

        System.out.println("Programming");
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
