package fr.uvsq.exo3_3;

public class Robot {
	private Position position;
	private Direction direction;
	
	public Robot(Position pPosition, Direction pDirection)
	{
		this.position = pPosition;
		this.direction = pDirection;
	}
	
	public void tourner()
	{
		switch(this.direction)
		{
			case NORD:
				this.direction = Direction.EST;
			break;
			case EST:
				this.direction = Direction.SUD;
			break;
			case SUD:
				this.direction = Direction.OUEST;
			break;
			case OUEST:
				this.direction = Direction.NORD;
			break;
			default:
			break;
		}
	}
	
	public void avance()
	{
		switch(this.direction)
		{
			case NORD:
				this.position.y++;
			break;
			case EST:
				this.position.x++;
			break;
			case SUD:
				this.position.y--;
			break;
			case OUEST:
				this.position.x--;
			break;
			default:
			break;
		}
	}
	
}
