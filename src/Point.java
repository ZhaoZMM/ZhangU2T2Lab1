public class Point {
    private int x;
    private int y;
    public Point(int setX, int setY){
        x = setX;
        y = setY;
    }
    public Point(int set){
        x = set;
        y = set;
    }
    public Point(){
        x = 0;
        y = 0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int newPointX){
        x = newPointX;
    }
    public void setY(int newPointY){
        y = newPointY;
    }
    public String coordinate(){
        return "("+x+", "+y+")";
    }
    public String quadrant(){
        if (x > 0 && y > 0){
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else if (x == 0 && y == 0) {
            return "origin";
        } else {
            return "on an axis";
        }
    }
}
