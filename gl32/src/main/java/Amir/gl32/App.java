package Amir.gl32;

/**
 * Class main
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RH agent = new Employe("John", "Doe", 2002);
        System.out.println(agent.salaire());
    }
}
