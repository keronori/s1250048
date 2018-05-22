public class Point implements Shape{
    private float x;
    private float y;
    Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public double getArea(){
        return 0;
    }
    public void move(float x,float y){
        this.x=x;
        this.y=y;
    }
}