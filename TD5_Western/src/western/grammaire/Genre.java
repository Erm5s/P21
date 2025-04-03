package western.grammaire;

public interface Genre {
    String getArticleDefini(Boolean voyelleDebut);
    String getArticleIndefini(Boolean voyelleDebut);
    String getArticlePartitif(Boolean voyelleDebut);
    String getPreposition(Boolean voyelleDebut);
}
