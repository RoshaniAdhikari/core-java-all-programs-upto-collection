package iterativestatement;

public class SumOfDigit {
public static void main(String[] args) {
	int no = 153,  temp, rem, sum = 0;

    temp = no;

    while ( no != 0)
    {
    	rem = no % 10;
    	System.out.println("rem :"+rem);
        sum += Math.pow(rem, 3);
        no/= 10;
    }
    System.out.println("Sum :"+sum);

    if(sum ==temp)
        System.out.println(temp + " is an Armstrong number.");
    else
        System.out.println(temp + " is not an Armstrong number.");
}
}