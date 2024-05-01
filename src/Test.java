import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {

    public static void main(String[] args) throws IOException {
        executeAround(s->write(s), "Hi");
        executeAround(s->append(s), "Hi2");
    }

    private static void executeAround( Consumer<String> useFile, String text) throws IOException
    {
        File file = new File("Hello1.txt");

        // creates the file
        file.createNewFile();

        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);

        useFile.accept(text);
        // Writes the content to the file
        //if(doThisOrThat)
        //    writer.write("This\n is\n an\n example\n");
        //else
        //    writer.append("hi");

        writer.flush();
        writer.close();
    }

    private static void write(String text)
    {
        //writer.write(text);
    }

    private static void  append(String text)
    {
        //writer.append(text);
    }
}
