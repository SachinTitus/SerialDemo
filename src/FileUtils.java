import java.io.*;

public class FileUtils {

    public void serializeObject(Person person){

        try (FileOutputStream fileOutputStream = new FileOutputStream("person.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
