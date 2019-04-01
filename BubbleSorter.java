import java.util.ArrayList;
import java.util.Collections;
public class BubbleSorter {
  public static ArrayList<Integer> sort(ArrayList<Integer> imputList){

    ArrayList<Integer> returnList = imputList;
    boolean ordered = false;

    while(ordered){
      for(int i = 0; i < returnList.size()-1; i++){

        if(i>i+1)
          Collections.swap(returnList, i,i+1);

        else
          ordered = true;

      }//End For
    }//End While
    return returnList;
  }//End Sort
}//End Class
