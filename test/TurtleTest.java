import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import javax.swing.text.Position;

import static org.junit.jupiter.api.Assertions.*;


public class TurtleTest {
    private Turtle turtle;
    private Position position;

    @BeforeEach
    void setUp() {
        turtle = new Turtle();
        position = new Position(0, 0);
    }
//

            @Test
            public void turtleCanBeCreatedTest() {
                assertNotNull(turtle);
            }

            @Test
            void penIsUpByDefaultTest() {

            assertTrue(turtle.isPenUp());
            }

            @Test
            void turtleCanMovePenDownTest() {
                assertTrue(turtle.isPenUp());
                turtle.penDown();
                assertFalse(turtle.isPenUp());

            }

            @Test
            void turtleCanMovePenUpTest() {
                assertTrue(turtle.isPenUp());
                turtle.penDown();
                assertFalse(turtle.isPenUp());
                turtle.penUp();
                assertTrue(turtle.isPenUp());

            }

            @Test
            void whenFacingEastTurtleTurnRightTest() {
                assertSame(Direction.EAST, turtle.getCurrentDirection());
                turtle.turnRight();
                assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
            }

            @Test
            void whenFacingSouthTurtleTurnRightTest() {
                assertSame(Direction.EAST, turtle.getCurrentDirection());
                turtle.turnRight();
                assertSame(Direction.SOUTH, turtle.getCurrentDirection());
                turtle.turnRight();
                assertEquals(Direction.WEST, turtle.getCurrentDirection());
            }

            @Test
            void whenFacingWestTurtleTurnRightTest() {
                assertSame(Direction.EAST, turtle.getCurrentDirection());
                turtle.turnRight();
                assertSame(Direction.SOUTH, turtle.getCurrentDirection());
                turtle.turnRight();
                assertSame(Direction.WEST, turtle.getCurrentDirection());
                turtle.turnRight();
                assertEquals(Direction.NORTH, turtle.getCurrentDirection());
            }


//    @Test
//    void whenFacingNorthTurtleTurnRightTest() {
//        assertSame(Direction.EAST, turtle.getCurrentDirection());
//        turtle.turnRight();
//        assertSame(Direction.SOUTH, turtle.getCurrentDirection());
//        turtle.turnRight();
//        assertSame(Direction.WEST, turtle.getCurrentDirection());
//        turtle.turnRight();
//        assertEquals(Direction.NORTH, turtle.getCurrentDirection());
//    }
//

            @Test
            void whenFacingEastTurtleTurnLeftTest() {
                assertSame(Direction.EAST, turtle.getCurrentDirection());
                turtle.turnLeft();
                assertEquals(Direction.NORTH, turtle.getCurrentDirection());
            }

            @Test
            void whenFacingNorthTurnleLeftTest() {
                assertSame(Direction.EAST, turtle.getCurrentDirection());
                turtle.turnLeft();
                assertSame(Direction.NORTH, turtle.getCurrentDirection());
                turtle.turnLeft();
                assertEquals(Direction.WEST, turtle.getCurrentDirection());
            }

            @Test
            void whenFacingSouthTurnLeftTest() {
                assertSame(Direction.EAST, turtle.getCurrentDirection());
                turtle.turnLeft();
                assertSame(Direction.NORTH, turtle.getCurrentDirection());
                turtle.turnLeft();
                assertSame(Direction.WEST, turtle.getCurrentDirection());
                turtle.turnLeft();
                assertEquals(Direction.SOUTH, turtle.getCurrentDirection());

            }

            @Test
            void turnCanMoveForwardFacingEastTest() {
                assertSame(Direction.EAST, turtle.getCurrentDirection());
                turtle.move(5);
                Position position = new Position(0, 5);

                assertEquals(new Position(0, 5), turtle.getCurrentPosition());
            }
        }








