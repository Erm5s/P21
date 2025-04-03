package western.grammaire;

public class Substantif {
    String m_mot;
    Genre m_genre;

    public Substantif (String mot, Genre genre) {
        m_mot = mot;
        m_genre = genre;
    }

    public String getMot() {
        return m_mot;
    }

    public Genre getGenre() {
        return m_genre;
    }
}
