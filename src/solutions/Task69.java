package solutions;

public class Task69 {
    public int mySqrt(int x) {
        int qwe = String.valueOf(x).length() / 2;
        int counter = 0;
        int number = x;
        while (counter!=qwe+1){
            number= number/10;
            counter++;
        }
        while(number*number<x){
            if((number+10000)*(number+10000)<=x && ((number+10000)*(number+10000))>0){
                number = number+10000;
                continue;
            }
            else if((number+1000)*(number+1000)<=x && ((number+1000)*(number+1000))>0){
                number = number+1000;
                continue;
            }
            else if((number+100)*(number+100)<=x && ((number+100)*(number+100))>0){
                number = number+100;
                continue;
            }
            else if((number+10)*(number+10)<=x && ((number+10)*(number+10))>0){
                number = number+10;
                continue;
            }
            else if((number+1)*(number+1)<=x && ((number+1)*(number+1))>0){
                number = number+1;
                continue;
            }
            break;
        }
        return number;
    }

    public void test() {
        int x = 1877853;
        System.out.println(mySqrt(x));
    }
}
