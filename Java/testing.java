class testing{
    static int count(String X){
        //int answer = 0;
        for (int i = 0; i < X.length(); i++){
            //if(string contains only letters)
                //if the current character uppercase increment to the next character
                    //if the current character is lowercase add one to answer then increment to next character
                    // else 
            //if character is uppercase and the following letter is lower case add one to answer
        }
        //return answer;
    }

    public static void LargeBeforeSmall(String[] args) {
      String A = "bCcCDce";  
      String B = "b[C][c]CbBce";
      String C = "b[C]cCdB[c]e";
      String D = "bCc[C]bB[c]e";
      System.out.println("Input: bCcCDce"+ count(A));
      count(B);
      count(C);
      count(D);
    }
}