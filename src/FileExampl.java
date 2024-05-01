import java.io.File;
import java.io.FileFilter;
import java.util.function.Predicate;

public class FileExampl {


    public static void main(String[] args) {

        File myDir = new File("c:\\tmp");
        //File[] files = myDir.listFiles((File)->File.isFile());   // uses interface FilenameFilter with one method, method: boolean accept(File dir, String name);

        //with filefilter interface
        //FileFilter filter = (File f) -> f.isFile();
        //File[] files = myDir.listFiles(filter);

        //with predicate interface
        Predicate<File> predicate = (File f) -> f.isFile();
        File[] files2 = myDir.listFiles((File f)->predicate.test(f));

        //Are the lambda´s the same?
        //filter = predicate;
        //Object filterObj = (File f) -> f.isFile();


        for(File f: files2)
        {
            System.out.println("Filename: " + f.getName());
        }
    }

}
