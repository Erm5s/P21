package western.grammaire;

public class Substantif{
    String m_mot;
    Genre m_genre;

    public Substantif (String mot, Genre genre) {
        m_mot = mot;
        m_genre = genre;
    }

    public Boolean voyelleDebut() {
        char l = Character.toLowerCase(m_mot.charAt(0));
        if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
            return true;
        }
        return false;
    }

    public String avecArticleDefini() {
        return m_genre.getArticleDefini(voyelleDebut()) + m_mot;
    }

    public String avecArticleIndefini() {
        return m_genre.getArticleIndefini(voyelleDebut()) + m_mot;
    }

    public String avecArticlePartitif() {
        return m_genre.getArticlePartitif(voyelleDebut()) + m_mot;
    }

    public String avecPreposition() {
        return m_genre.getPreposition(voyelleDebut()) + m_mot;
    }

    public String getMot() {
        return m_mot;
    }

    public Genre getGenre() {
        return m_genre;
    }
}
