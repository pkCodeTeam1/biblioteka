package pl.edu.pk.pkCodeTeam1.biblioteka;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Działanie karty czytelników: " );
        ReaderCard prs1 = new ReaderCard("123", "Kamil", "Strózik");
        ReaderCard prs2 = new ReaderCard("124", "Jan", "Kowalski");
        System.out.println(prs1);
        prs2.type_junior();
        System.out.println(prs2);
        prs1.show_fee();
        prs2.show_penalty();
    }
}
