import java.io.File;
import java.io.IOException;

public class IODemo1File {

  // show new a File class
  public static void main(String[] args)  throws IOException {
    File f = new File("C:\\Windows\\notepad.exe");
    System.out.println(f);  //output: C:\Windows\notepad.exe

    File f2 = new File("test.txt");
    System.out.println(f2);

    // display OS's separator
    System.out.println(File.separator); // print "\" or "/"


    // show File's method about path
    File f3 = new File("..");
    System.out.println(f3.getPath());
    System.out.println(f3.getAbsoluteFile());
    System.out.println(f3.getCanonicalPath());
  }
}
