package dialog;

public class CharacterIdentity {
    private String m_firstName;
    private int m_age;

    public CharacterIdentity(String firstName, int birthYear){
        m_firstName= firstName;
        m_age = birthYear;
    }

    public String getFirstName() {
        return m_firstName;
    }

    public int getAge() {
        return m_age;
    }

    public void growOlder()
    {
        m_age++;
    }

    @Override
    public String toString() {
        return "CharacterDialog("+m_firstName+")";
    }


}
