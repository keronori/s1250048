class Rectangle{
  protected float height;
  protected float length;
  Rectangle(float a,float b){
    height=a;
    length=b;
  }
  protected float calculate(){
    return height*2+length*2;
  }
}
class Box{
  protected float height;
  protected float length;
  protected float width;
  Box(float a,float b,float c){
    height=a;
    length=b;
    width=c;
  }
  protected float calculate(){
    return height*4+length*4+width*4;
  }
}
class TestObject{
  public static void main(String[] args){
    Rectangle rectangle=new Rectangle(4f,6f);
    Box box=new Box(2f,5f,3f);

    System.out.println("Rectangle ver");
    System.out.println("Height : "+rectangle.height+"  Length : "+rectangle.length);
    System.out.println("the perimeter of the object : "+rectangle.calculate());

    System.out.println("Box ver");
    System.out.println("Height : "+box.height+"  Length : "+box.length+" Width : "+box.width);
    System.out.println("the perimeter of the object : "+box.calculate());
  }
}
