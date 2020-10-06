import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String []args) throws IOException {
        MyFilter mf = new MyFilter("txt", "pdf");
        File folder = new File("C:/Users/Макс/Desktop/Test");
       File folderForCopy=new File("C:/Users/Макс/Desktop/Test2");
FileCopy fc=new FileCopy(folder);
fc.copy(mf,folderForCopy);

    }
}
