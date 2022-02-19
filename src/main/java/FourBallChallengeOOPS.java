import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBallChallengeOOPS extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int BALL_COUNT = 4;
    public static final int DIAMETER = 15;

    int initialXCoord = 0;
    int frames = 0;

    List<Ball> balls = new ArrayList<>();

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        initializeBalls();

        for(Ball ball: balls){
            drawBall(ball);
        }
    }

    private void initializeBalls() {
        for(int ballId = 1; ballId <= BALL_COUNT; ballId++){
            Ball ball = new Ball(DIAMETER,initialXCoord,ballId * HEIGHT / 5,ballId);
            balls.add(ball);
        }
    }

    @Override
    public void draw() {
        for(Ball ball: balls){
            moveBallHorizontally(ball);
            drawBall(ball);
        }
    }

    private void moveBallHorizontally(Ball ball) {
        ball.moveBallHorizontally(frames++, ball.getFrameRate());
    }

    private void drawBall(Ball ball) {
        ellipse(ball.getxCoord(), ball.getyCoord(), ball.getDiameter(), ball.getDiameter());
    }

    public static void main(String[] args) {
        PApplet.main("FourBallChallengeOOPS",args);
    }
}
