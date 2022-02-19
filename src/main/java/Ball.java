public class Ball {

    private int diameter;
    private int xCoord;
    private int yCoord;
    private int frameRate;

    public Ball(int diameter, int xCoord, int yCoord, int frameRate) {
        this.diameter = diameter;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.frameRate = frameRate;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getFrameRate() {
        return frameRate;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void moveBallHorizontally(int frames, int frameRate) {
        this.xCoord = frames / (FourBallChallengeOOPS.BALL_COUNT+1-frameRate);
    }


}
