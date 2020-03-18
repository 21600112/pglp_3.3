package fr.uvsq.exo3_3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Position p1 = new Position(10,10);
        Position p2 = new Position(20,20);
        
        Robot r1 = new Robot(p1,Direction.NORD);      
        RobotStatic r2 = new RobotStatic(p2,Direction.SUD);
        
        System.out.println(r1.position.toString());
        
        r1.avance();
        System.out.println(r1.position.toString());
        
    }
}
