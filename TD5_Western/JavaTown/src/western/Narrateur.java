package western;

public class Narrateur {
    String m_histoire = "";
    public Narrateur() {
    }

    public void ajouterLignes(String nvLigne) {
        m_histoire += (nvLigne + "\n");
    }

    public String raconterHistoire() {
        return this.m_histoire;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
