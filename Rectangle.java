public class Rectangle implements Shape{
    private float w;
    private float h;
    Point point;
    Rectangle(float w,float h){
        this.w=w;
        this.h=h;
        point=new Point(0f,0f);
    }
    public double getArea(){
        return w*h;
    }
    public void move(float x,float y){
        point.move(x,y);
    }
}