package dialog;

import dialog.output.FileOutput;
import dialog.output.Output;
import dialog.output.StandartOutput;

public class CharacterDialog {
    private CharacterIdentity m_identity;
    private Output m_outputChoice;
    public CharacterDialog(String firstName, int birthYear, Output outputChoice)
    {
        m_identity = new CharacterIdentity(firstName, birthYear);
        m_outputChoice= outputChoice;
    }

    public void growOlder()
    {
        m_identity.growOlder();
    }

    public void meetSomeone()
    {
        m_outputChoice.write("Bonjour! Comment allez-vous?\n");
    }

    public void introduceItself()
    {
        m_outputChoice.write("Je m'appelle "+m_identity.getFirstName() +".\n");
    }

    public void attack()
    {
        m_outputChoice.write("A l attaque!\n");
    }

    @Override
    public String toString()
    {
        return "CharacterIdentity("+m_identity.getFirstName()+")";
    }
}
