public class Q9
{
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        int sum = 0;
        double p;
        while(x <18){
            y = x / 2;
            while(y < x){
                p = (x + 15.0) /2;
                sum = (sum + 3) + x + y * 3 + (int)p;
                System.out.println(sum);
                y = y + 3;
            }
            x = x + 3;
        }
    }
}
