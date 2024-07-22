public class sum_of_digit {
    public static void main(String[] args) {
        System.out.println(summ(125));

    }
    public static int summ(int n){
        if(n==0) {
            return 0;
        }
        int sum=0;
        int rem=n%10;
        int digit=n/10;
        sum=rem+summ(digit);
        return sum;


    }



}
