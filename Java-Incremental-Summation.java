import java.util.Scanner;

class NumberSummation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = sc.nextInt();
        float a = 95.0f;
        for(int i = 0; i < n; i ++){
            System.out.print(a +", ");
            a = a + 20.5f;
        }
    }
}