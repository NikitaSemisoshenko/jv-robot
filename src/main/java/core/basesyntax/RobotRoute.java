package core.basesyntax;

public class RobotRoute {
    public RobotRoute() {
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            if (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            if (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getX() == toX) {
            if (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("You are brilliant!");
        } else {
            System.out.println("Something went wrong");
        }
    }
}
