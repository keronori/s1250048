public class ClassifyingToys{
  public static void main(String[] args){
    String[][] array={{"0.03","0.04","0.05"},{"3.0","4.0","5.0"},{"0.3","0.4","0
.5"},{"2","3","4"},{"5","12","13"},{"0.5","1.2","1.3"},{"19.0","19.0","19.0"},{"
0.9","4.0","4.1"},{"1","1","1"},{"1","1","2"},{"12","34","56"}};
    System.out.println("Lenght of the sides (cm)\tClassification");
    for(int i=0;i<11;i++){
      for(int j=0;j<3;j++)
        System.out.print(array[i][j]+" ");

      if(i!=0 && i!=6)System.out.print("  ");
      if(Math.pow(Double.parseDouble(array[i][2]),2)==Math.pow(Double.parseDoubl
e(array[i][1]),2)+Math.pow(Double.parseDouble(array[i][0]),2))
        System.out.println("\t\tright-angled");
      else System.out.println("\t\tput here the answer of your program");
    }
  }
}
