package fr.uvsq.exo3_3;

public class Position {
	public int x;
	public int y;
	
	public Position(int pX, int pY)
	{
		this.x = pX;
		this.y = pY;
	}
	
	public String toString()
	{
		return "position x : "+this.x+" position en y : "+this.y ;
	}
}
