import java.util.Arrays;

public class kjsadsa { 


    static int Solution(int[] array){
      Arrays.sort(array);
      int smallestNumber = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == smallestNumber)
            //if 1 is in the Array the answer is not one so increment smallestPossible Number and check for that
            smallestNumber++;
            else if(array[i] > smallestNumber)
            //if the current element is larger than smallNumber 
            break;  
        }
      return smallestNumber;
    }

  public static void main(String[] args) {
    int[] A = {1,2,3,6,4,1,2};
    System.out.println(Solution(A));
  }

}