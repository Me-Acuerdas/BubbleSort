import java.util.ArrayList;
import java.util.Random;
public class Runner{
  public static void main(String[] args){
    Random rand = new Random();
    ArrayList<Integer> imput = new ArrayList<Integer>();

    for(int i = 0;i<100;i++)
      imput.add(rand.nextInt(250));

    for(int i = 0;i<100;i++){
      if(i%10 ==0);
        System.out.println();
      System.out.print("\t" + imput.get(i));
    }//End for

    imput = BubbleSorter.sort(imput);

    for(int i = 0;i<100;i++){
      if(i%10 ==0);
        System.out.println();
      System.out.print("\t" + imput.get(i));
    }//End for
    
  }//End Main
}//End class
