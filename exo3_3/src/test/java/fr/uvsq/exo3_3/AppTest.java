package fr.uvsq.exo3_3;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
	public void robotAvanceNord()
	{	
		Position p1 = new Position(10,10);
		Robot r1 = new Robot(p1,Direction.NORD);
		r1.avance();
		
		assertEquals(r1.position.y,11);
	}
	
	@Test
	public void robotAvanceEst()
	{	
		Position p1 = new Position(10,10);
		Robot r1 = new Robot(p1,Direction.EST);
		r1.avance();
		
		assertEquals(r1.position.x,11);
	}
	
	@Test
	public void robotAvanceSud()
	{	
		Position p1 = new Position(10,10);
		Robot r1 = new Robot(p1,Direction.SUD);
		r1.avance();
		
		assertEquals(r1.position.y,9);
	}
	
	@Test
	public void robotAvanceOuest()
	{	
		Position p1 = new Position(10,10);
		Robot r1 = new Robot(p1,Direction.OUEST);
		r1.avance();
		
		assertEquals(r1.position.x,9);
	}
	
	
	@Test
	public void robotTourneDepuisNord()
	{	
		Position p1 = new Position(10,10);
		Robot r1 = new Robot(p1,Direction.NORD);
		r1.tourner();
		
		assertEquals(r1.direction,Direction.EST);
	}
	
	@Test
	public void robotTourneDepuisEst()
	{	
		Position p1 = new Position(10,10);
		Robot r1 = new Robot(p1,Direction.EST);
		r1.tourner();
		
		assertEquals(r1.direction,Direction.SUD);
	}
	
	@Test
	public void robotTourneDepuisSud()
	{	
		Position p1 = new Position(10,10);
		Robot r1 = new Robot(p1,Direction.SUD);
		r1.tourner();
		
		assertEquals(r1.direction,Direction.OUEST);
	}
	
	@Test
	public void robotTourneDepuisOuest()
	{	
		Position p1 = new Position(10,10);
		Robot r1 = new Robot(p1,Direction.OUEST);
		r1.tourner();
		
		assertEquals(r1.direction,Direction.NORD);
	}
	
	
	
}

