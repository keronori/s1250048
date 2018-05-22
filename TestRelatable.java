public class TestRelatable{
    public static void main(String[] args){
        MyRectangle myrectangle[];
        myrectangle=new MyRectangle[5];
        myrectangle[0]=new MyRectangle(10f,3f);
        myrectangle[1]=new MyRectangle(1f,6f);
        myrectangle[2]=new MyRectangle(5f,2f);
        myrectangle[3]=new MyRectangle(3f,2f);
        myrectangle[4]=new MyRectangle(7f,2f);

        int count=0;
        for(int i=1;i<myrectangle.length;i++){
            if(myrectangle[i].isLargerThan(myrectangle[count])==1)count=i;
        }
        System.out.println("myrectangle["+count+"] is the most largest than all. "+myrectangle[count].getPerimeter());
    }
}