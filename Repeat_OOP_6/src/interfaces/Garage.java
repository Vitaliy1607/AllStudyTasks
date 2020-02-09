package interfaces;

public class Garage {
	private MoveAble moveAble;
	private int x;
    private int y;
	
	
	public Garage() {
		
	}

    

	public Garage(MoveAble moveAble, int x, int y) {
		this.moveAble = moveAble;
		this.x = x;
		this.y = y;
	}

    public void move(int x , int y) {
    	if(moveAble!=null) {
    moveAble.move(x, y);}
    }

	public Garage(MoveAble moveAble) {
		this.moveAble = moveAble;
	}

    

	public MoveAble getMoveAble() {
		return moveAble;
	}



	public void setMoveAble(MoveAble moveAble) {
		this.moveAble = moveAble;
		if(moveAble != null) {
         moveAble.setX(x);
         moveAble.setY(y);
	}
	

}
	}
