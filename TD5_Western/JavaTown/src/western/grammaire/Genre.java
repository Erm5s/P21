package western.grammaire;

public interface Genre {
    default Boolean voyelleDebut(String mot) {
        char l = Character.toLowerCase(mot.charAt(0));
        if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
            return true;
        }
        return false;
    }
    String getArticleDefini(String mot);
    String getArticleIndefini(String mot);
    String getArticlePartitif(String mot);
    String Preposition(String mot);
}
