import java.util.Scanner;
class watermelon{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		if(w>=1){
			if(w%2==0){
				System.out.println("YES");
			}
			else{
				System.out.println("No");
			}
		}
		else{
				System.out.println("No");
			}
	}
}