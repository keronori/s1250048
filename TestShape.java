public class TestShape{
    public static void main(String[] args){
        double total_area=0;

        Rectangle rectangle[]=new Rectangle[4];
        rectangle[0]=new Rectangle(2f,2f);
        rectangle[1]=new Rectangle(3f,3f);
        rectangle[2]=new Rectangle(4f,4f);
        rectangle[3]=new Rectangle(2f,4f);
        Circle circle[]=new Circle[5];
        circle[0]=new Circle(4f);
        circle[1]=new Circle(3f);
        circle[2]=new Circle(2f);
        circle[3]=new Circle(1f);
        circle[4]=new Circle(5f);

        for(int i=0;i<4;i++)
            total_area+=rectangle[i].getArea();

        for(int i=0;i<5;i++)
            total_area+=circle[i].getArea();

        System.out.println("Total: "+total_area);
    }
}