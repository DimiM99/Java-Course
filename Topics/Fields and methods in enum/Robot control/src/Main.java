
class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {

        int iterationsForX = Math.abs(robot.getX() - toX);
        int iterationsForY = Math.abs(robot.getY() - toY);

        //Moving to the right x-coordinate
        directionForMoveOnX(robot, toX);
        for (int i = 0; i < iterationsForX; i++) {
            robot.stepForward();
        }

        //Moving to the right y-coordinate
        directionForMoveOnY(robot, toY);
        for (int i = 0; i < iterationsForY; i++) {
            robot.stepForward();
        }
    }

    private static void directionForMoveOnX(Robot robot, int toX) {
        Direction currentDirectionX = robot.getDirection();
        if (toX < robot.getX()) {
            switch (currentDirectionX) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case LEFT:
                    //do nothing, the robot is looking the right way already
                    break;
                default:
                    break;
            }
        } else if (toX == robot.getX()) {
            //do nothing, the robot is in the right x coordinate.
            return;
        } else if (toX > robot.getX()) {
            switch (currentDirectionX) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT:
                    //do nothing, the robot is looking the right way already
                    break;
                default:
                    break;
            }
        }
    }

    private static void directionForMoveOnY(Robot robot, int toY) {
        Direction currentDirectionY = robot.getDirection();
        if (toY < robot.getY()) {
            switch (currentDirectionY) {
                case LEFT:
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case DOWN:
                    //do nothing, the robot is looking the right way already
                    break;
                default:
                    break;
            }
        } else if (toY == robot.getY()) {
            //do nothing, the robot is in the right x coordinate.
            return;
        } else if (toY > robot.getY()) {
            switch (currentDirectionY) {
                case UP:
                    //do nothing, the robot is in the right x coordinate.
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}