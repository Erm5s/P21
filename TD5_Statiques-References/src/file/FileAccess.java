package file;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileAccess {
    String m_path;

    public FileAccess(String path){
        m_path= path;
    }

    /**
     * lit la premiere ligne du fichier
     * @param code
     * @return
     * @throws IOException
     * @throws Exception
     */
    public String read(int code) throws IOException, Exception {
        if(code== 4 || code == 5 || code == 6 || code== 7 ){
            BufferedReader reader = new BufferedReader(new FileReader(m_path));
            String result = reader.readLine();
            reader.close();
            return result;
        }
        throw new Exception(code+" does not allow you to read the file");

    }

    public void write(int code, String text) throws IOException, Exception{
        if(code== 2 || code == 3 ||code == 6 ||  code== 7 ){
            FileWriter output = new FileWriter(m_path, true);
            output.append(text);
            output.close();
        } else {
            throw new Exception(code+" does not allow you to write into the file");
        }
    }

    public void execute(int code) throws IOException, Exception
    {
        if(code== 1 || code == 3 || code == 5 || code== 7 ){
            BufferedReader reader = new BufferedReader(new FileReader(m_path));
            System.out.println( reader.readLine() );
            reader.close();
        } else {
            throw new Exception(code+" does not allow you to execute the file");
        }
    }

}
