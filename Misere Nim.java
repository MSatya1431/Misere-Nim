import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'misereNim' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY piles as parameter.
     */

    public static String misereNim(List<Integer> piles) 
    {
        int totalStones = 0;
        for (int stones : piles) 
        {
            totalStones += stones;
        }
        if ((totalStones % 2 == 0 && Collections.min(piles) == 1 && piles.size() % 2 == 1) ||                 (totalStones % 2 == 1 && Collections.min(piles) == 1 && piles.size() % 2 == 0) ||
            (totalStones % 2 == 1 && Collections.min(piles) != 1)) 
        {
           return "Second";
        }
        else
        {
           return "First";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int test_cases = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < test_cases; i++) {
            int num_piles = Integer.parseInt(bufferedReader.readLine().trim());
            List<Integer> piles = new ArrayList<>();
            String[] pile_strings = bufferedReader.readLine().split(" ");
            for (String pile_string : pile_strings) {
                piles.add(Integer.parseInt(pile_string));
            }

            String result = Result.misereNim(piles);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
