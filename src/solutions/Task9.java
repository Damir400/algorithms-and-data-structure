package solutions;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public boolean isPalindrome(int x) {
        List<Integer> result = new ArrayList<>();
        if(x<0){
            return false;
        }
        while (x>0){
            result.add(x%10);
            x = x/10;
        }
        for (int i = 0; i < result.size()/2; i++) {
            if(result.get(i).equals(result.get(result.size()-i-1))){
            }
            else {
                return false;
            }
        }
        return true;
    }

    public void test() {
        System.out.println(isPalindrome(-121));
    }
}
