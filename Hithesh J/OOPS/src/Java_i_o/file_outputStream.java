package Java_i_o;
import java.io.FileOutputStream;
public class file_outputStream {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("Store");
            String s = "This is example of out put stream";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Sucess...");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
