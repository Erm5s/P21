import date.Year;
import dialog.CharacterDialog;
import dialog.output.FileOutput;
import dialog.output.StandartOutput;

public class Main {
    public static void main(String args[])
    {
        CharacterDialog luke = new CharacterDialog("Luke", -3000, new StandartOutput());
        luke.introduceItself();
        luke.meetSomeone();
        luke.attack();

        CharacterDialog leila = new CharacterDialog("Leia", -3000, new FileOutput("Leia.txt"));
        leila.introduceItself();
        leila.meetSomeone();
        leila.attack();


    }
}
