import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {
String [] arr;

    public MyFilter(String... arr) {
        this.arr = arr;
    }
    public boolean check(String ext){
        for (String a:arr) {
            if(a.equals(ext))return true;
        }
        return false;
    }

    @Override
    public boolean accept(File pathname) {
        int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        String ext = pathname.getName().substring(pointerIndex + 1);
        return check(ext);
    }

}
