public class Robots {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        moveRobot(robot, 3, -2);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
    int x = toX - robot.getX();
    Direction xDirection, yDirection;
    if (x > 0) {
        xDirection = Direction.RIGHT;
    } else {
        xDirection = Direction.LEFT;
    }

    int y = toY - robot.getY();
    if (y > 0) {
        yDirection = Direction.UP;
    } else {
        yDirection = Direction.DOWN;
    }

    while (!robot.getDirection().equals(xDirection)) {
        robot.turnLeft();
    }
    for (int i = 0; i < Math.abs(x); i++) {
        robot.stepForward();
    }

    while (!robot.getDirection().equals(yDirection)) {
        robot.turnLeft();
    }
    for (int i = 0; i < Math.abs(y); i++) {
        robot.stepForward();
    }
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void getData() {
            System.out.println(getX());
            System.out.println(getY());
            System.out.println(getDirection());
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

}
