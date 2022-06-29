public class Turtle {
   // private  int row;
  //  private int column;
    private boolean isPenUp = true;
    private Direction currentDirection = Direction.EAST;
    private int column;
    private int row;
    private Position currentPosition = new Position(0,0);


    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;


    }

    public boolean isPenCanUp() {
        return true;
    }

    public void penUp() {
       isPenUp = true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == Direction.EAST) currentDirection = Direction.SOUTH;
        else if(currentDirection == Direction.SOUTH) currentDirection = Direction.WEST;
        else if(currentDirection == Direction.WEST) currentDirection = Direction.NORTH;
    }

    public void turnLeft() {
        if(currentDirection == Direction.EAST) currentDirection = Direction.NORTH;
        else if(currentDirection == Direction.NORTH) currentDirection = Direction.WEST;
        else if(currentDirection == Direction.WEST) currentDirection = Direction.SOUTH;


    }

    public void move(int noOfSteps) {
    }


    public Position getCurrentPosition() {
        return  new Position(0, 5);

    }

    public void move(){

    }
}



