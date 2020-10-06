import java.io.File;
import java.io.IOException;

public class FileCopy {
    private File file;

    public FileCopy() {
        super();
    }

    public FileCopy(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

public boolean copy(MyFilter mFF,File folderForCopy) throws IOException {
    int n=0;
    int k=0;
    int l=0;
    File[] arr=file.listFiles();
    for (File ar:arr) {
        if (mFF.accept(ar)){
            n++;
        }
    }
    File []arr2=new File[n];

    for (int i=0;i<arr.length;i++) {
        if (mFF.accept(arr[i])){
            arr2[k]=arr[i];
            k++;
        }
    }
    for (File ak:arr2) {
        new File(folderForCopy+"/"+arr2[l].getName()).createNewFile();
        l++;
    }
return true;
}
}
