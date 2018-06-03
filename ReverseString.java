import java.io.*;
public class ReverseString{
    public static void main(String[] args) throws IOException{
        int array[]=new int[2000];
        int i=0;
        File file=new File("input.txt");
        File file2=new File("output_q1.txt");
        FileInputStream fin=null;
        FileOutputStream fout=null;
        try{
            fin=new FileInputStream(file);
            fout=new FileOutputStream(file2);
            while((array[i]=fin.read())!=-1){
                i++;
            }
            for(int j=i-1;j>=0;j--){
                fout.write(array[j]);
            }
        } catch(FileNotFoundException e){
            System.out.println("File could not be found on filesytem.");
        } finally{
            if(fin!=null)
                fin.close();
            if(fout!=null)
                fout.close();
        }
    }
}