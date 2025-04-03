package dialog.output;

public class StandartOutput implements Output{
    public StandartOutput()
    {
    }

    /**
     * write the text in standart ouput
     * @param text
     */
    @Override
    public void write(String text)
    {
        System.out.print(text);
    }

    @Override
    public String toString()
    {
        return "StandartOuput";
    }
}
