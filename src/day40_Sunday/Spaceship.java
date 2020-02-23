package day40_Sunday;

public class Spaceship {

    String name;
    String currentDirection;
    int x ;
    int y ;

    public void setInitialPosition (int newX, int newY){

        x= newX;
        y= newY;

    }

    public void setDirection(String newDirection){
        if (newDirection.equalsIgnoreCase("up") ||
        newDirection.equalsIgnoreCase("down") ||
        newDirection.equalsIgnoreCase("right")  ||
        newDirection.equalsIgnoreCase("left") ) {

            currentDirection = newDirection;
        } else {
            System.out.println("Invalid Direction");
            currentDirection = "";
        }

    }


    public void move1Block(){

        switch (currentDirection){
            case "right":
                x+=1;
                break;
            case  "left" :
                x -=1;
                break;
            case  "up" :
                y +=1;
                break;
            case  "down" :
                y -=1;
                break;
            default:
                break;
        }

    }

    // add a functionality to moveBlock with direction provided in one shot

    /**
     * This will take a direction and move spaceship object 1 block
     * @param newDirection
     */
    public void move1Block (String newDirection) {
        // we are reusing the functionality we already have to move1block
        setDirection(newDirection);
        move1Block();

    }



    // right click in your class anywhere
    //select generate
    //select toString ===>
    //delete "@override" thing

    public String toString() {
        return "Spaceship{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

   /*
  TASK:
  Create a class called SpaceShip
            it has 4 attributes :
    name as String
    currentDirection as String  | up , down , right, left
    x as int
    y as int

    few behaviours :
    setInitialPosition
    accept 2 int parameters

    to provide initial position of spaceship
    setDirection  void method
    accept 1 String parameter to set the direction

    move1Block    void method
    accept no parameter
    and change the position according to the direction
    toString method
 	 	return String reperesntation of Spaceship Object
  */



}
