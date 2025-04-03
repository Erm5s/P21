package western.personnages;

import western.grammaire.Feminin;
import western.grammaire.Masculin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import western.grammaire.Substantif;

public class PersonnagesTest
{
    /*
    @Test
    void presentationBrigand()
    {
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        Assertions.assertEquals("Dalton - Bonjour, je suis Dalton le méchant et j'aime le whisky. Ma tête est mise à prix 100$ !", dalton.sePresenter());
    }

    @Test
    void presentationDame()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        Assertions.assertEquals("Scarlett - Bonjour, je suis Miss Scarlett et j'aime l'eau." , scarlett.sePresenter());
    }

    @Test
    void presentationBrigandKinapping()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        dalton.kidnapper(scarlett);
        Assertions.assertEquals("Dalton - Bonjour, je suis Dalton le méchant et j'aime le whisky. Ma tête est mise à prix 150$ !",
                dalton.sePresenter());
    }

    @Test
    void presentationDameKinapping()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        dalton.kidnapper(scarlett);
        Assertions.assertEquals("Scarlett - Bonjour, je suis Miss Scarlett et j'aime l'eau.",
                scarlett.sePresenter());
    }

    @Test
    void presentationDameLiberation()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Substantif("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        luke.capturer(dalton);
        Assertions.assertEquals("Scarlett - Bonjour, je suis Miss Scarlett et j'aime l'eau.",
                scarlett.sePresenter());
    }

    @Test
    void presentationBrigandCapture()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Substantif("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        luke.capturer(dalton);
        Assertions.assertEquals("Dalton - Bonjour, je suis Dalton le méchant et j'aime le whisky. Ma tête est mise à prix 150$ !",
                dalton.sePresenter());
    }

    @Test
    void presentationCowboyCapture()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Substantif("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        luke.capturer(dalton);
        Assertions.assertEquals("Luke - Bonjour, je suis Luke et j'aime la bière.",
                luke.sePresenter());


    }*/
}
