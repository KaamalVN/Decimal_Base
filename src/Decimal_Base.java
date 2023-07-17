import java.util.Scanner;

public class Decimal_Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int base = scanner.nextInt();
        String result="";
        while(number>0){

            if(number==1){
                result+="1";
            }
            else {
                result += String.valueOf(number % base);
            }
            number/=base;
        }

        char ch;
        String reverse_result="";
        for (int i=0; i<result.length(); i++)
        {
            ch= result.charAt(i); //extracts each character
            reverse_result= ch+reverse_result; //adds each character in front of the existing string
        }
        int result_number=Integer.parseInt(reverse_result);
        System.out.println(result_number);
    }
}
