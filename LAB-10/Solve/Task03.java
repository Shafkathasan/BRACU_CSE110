import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Please Enter Number:");
        a[0]=sc.nextInt();
        int largest=a[0], largestL=0, i,
            smallest=a[0], smallestL=0;
        for(i=1; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=sc.nextInt();
            if(a[i]>largest) {
                largest=a[i];
                largestL=i;
            } else if(a[i]<smallest) {
                smallest=a[i];
                smallestL=i;
            }
        }
        System.out.println("Smallest Number "+smallest+" was found at loaction "+smallestL);
        System.out.println("Largest Number "+largest+" was found at loaction "+largestL);
    }
}
