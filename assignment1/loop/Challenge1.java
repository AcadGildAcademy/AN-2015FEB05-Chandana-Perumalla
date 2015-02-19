package chandana.assignment1.loop;

public class Challenge1 {

	public static void main(String[] args) {
		int count;
		System.out.println("Prime numbers between 1 to 100 are:");
		for(int i=1;i<101;i++){
			count = 0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
					count++;
				if(count>2)
					break;					
			}
			if(count < 3)
			System.out.print(i+" ");
		}
	}

}
