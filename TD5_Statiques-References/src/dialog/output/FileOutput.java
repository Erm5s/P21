package dialog.output;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements Output{
    private String m_filePath;

    public FileOutput(String filePath)
    {
        m_filePath=filePath;
    }

    @Override
    public void write(String text)
    {
        try{
            FileWriter output = new FileWriter(m_filePath, true);
            output.append(text);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
