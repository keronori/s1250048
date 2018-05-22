public class MyRectangle implements Relatable{
    private float width;
    private float length;
    MyRectangle(float w,float l){
        this.width=w;
        this.length=l;
    }
    MyRectangle(){
        this.width=0;
        this.length=0;
    }
    public float getPerimeter(){
        return width*2+length*2;
    }
    public int isLargerThan(Relatable other){
        MyRectangle othermyrec=(MyRectangle)other;
        if(this.getPerimeter()<othermyrec.getPerimeter())return -1;
        else if(this.getPerimeter()>othermyrec.getPerimeter())return 1;
        else return 0;
    }
}