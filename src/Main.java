import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        //Dog myDog = new Dog("Fido");
        //firstClassCitizen(myDog);

        //testFirstClassCitizen( ole->somethingElse(ole));
        //testFirstClassCitizen( (ole, ole2)->somethingElse(ole, ole2));


        //Builder pattern, utilizing a fluent interface
        //StringBuilder sb = new StringBuilder();
        //sb.append("start of text").append(" next part").append("");

        //testRobot();

        //functionTest();

        testPredicate();

        //functionChainTest();

        //functionInvokeTest();
    }

//---------------------------------------------------------------- first class citizen and higher orden functions

    public static void testFirstClassCitizen(Consumer<Dog> printDogsName)
    {
        Dog myDog = new Dog("Fido");
        printDogsName.accept(myDog);
    }

    public static void testFirstClassCitizen(ConsumeTwpPara<Dog, String> printDogsName)
    {
        Dog myDog = new Dog("Fido");
        printDogsName.accept(myDog, "larsen");
    }

    /**
     * Print dogs name
     * @param dog
     */
    public static void somethingElse(Dog dog)    {

        System.out.printf("something else: %s" , dog.getName());
    }

    /**
     * Print dogs name + dogs lastname
     * @param dog
     */
    public static void somethingElse(Dog dog, String lastName)    {

        System.out.printf("something else: %s" , dog.getName() + " - " + lastName);
    }

    public static void firstClassCitizen(Dog dog)    {

        System.out.printf("The dogs name is: %s" , dog.getName());
    }
//---------------------------------------------------------------- functional interface
    public static void testRobot()
    {
        Robot r2d2 = new Robot("R2D2");
        r2d2.executeOrder((m)-> System.out.println(String.format("I am %s", m)));

        r2d2.executeOrder((m)-> System.out.println(String.format("%s will bring you a beer", m)));

        r2d2.executeOrder( lars-> doMagic(lars)   );
    }


    private static void doMagic(String soeren)
    {
        System.out.println("It works " + soeren);
    }


//---------------------------------------------------------------- generic functional interface Function


    public static void functionTest()
    {
        Function<String, Integer> func = x -> x.length();


        Integer stringLength = func.apply("Datamatiker");

        System.out.println("The string length is: " + stringLength);
    }
//----------------------------------------------------------------

    public static void functionInvokeTest() {
        Function<Integer, Integer> funcMultiply = x -> x * 2;
        System.out.println("result" + funcMultiply.apply(10) );
    }

    public static void functionChainTest()
    {
        Function<String, Integer> funcLength = x -> x.length();

        Function<Integer, Integer> funcMultiply = x -> x * 2;

        //System.out.println("result" + funcMultiply.apply(123) );

        Integer lengthOfString = funcLength.andThen(funcMultiply).apply("Datamatiker");

        System.out.println(lengthOfString);
    }

    public static void testStream()
    {
        List<String> names = new ArrayList<>();

        names.add("Luke");
        names.add("Han");
        names.add("Anakin");
        names.add("Lando");
        names.add("Leia");
        names.add("Boba");

        //imperative


        //declarative
        //List<String> namesFiltered =

        names.stream()
                    .filter( name -> name.equals("Luke") || name.equals("Lando") )
                    //.collect(Collectors.toList())
                    .forEach( name -> System.out.println(name) );

//        System.out.println(Arrays.toString( namesFiltered.toArray() ));

        //names.forEach(z-> System.out.println(z));



    }

//---------------------------------------------------------------- generic functional interface Predicate

    public static void testPredicate()
    {
        List<Integer> numbers = Arrays.asList(10,12,4,7,90,5,9,15,67);

        //testFilterData(numbers, x->x>10);
        testFilterData(numbers, (x)-> testNumbers(x));
    }

    public static boolean testNumbers(int x)
    {
        return x>10;
    }

    public static void testFilterData(List<Integer> numbers, Predicate<Integer> filterFunction)
    {
       for(Integer no:numbers)
       {
           if(filterFunction.test(no))
               System.out.println(no);
       }


    }






}
