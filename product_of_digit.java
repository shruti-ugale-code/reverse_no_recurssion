public class product_of_digit {
    public static void main(String[] args) {
        System.out.println(product(125));

    }
    public static int product(int n){
        if(n%10==n) {
            return n;
        }
        int sum=0;
        int rem=n%10;
        int digit=n/10;
        sum=rem*product(digit);
        return sum;


    }

}
