package western.grammaire;

public class Substantif {
    String m_mot;

    Create Substantif ()
            + <<Create>> Substantif(boisson:String, genre:Genre)
            + articleDefini() : String
            + articleIndefini() : String
            + articleParitif() : String
            + preposition() : String
}
}
