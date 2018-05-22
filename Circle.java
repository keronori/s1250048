public class Circle implements Shape{
    private float r;
    Point point;
    Circle(float r){
        this.r=r;
        point=new Point(0f,0f);
    }
    public double getArea(){
        return r*r*Math.PI;
    }
    public void move(float x,float y){
        point.move(x,y);
    }
}