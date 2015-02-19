package chandana.assignment1.loop;

public class Challenge2 {

	public static void main(String[] args) {
		int i=1;
		int row = 1;
		while(i>0 && i<10){
			for(int j=1;j<i;j++){
				System.out.print(j);			
			}
		 row++;
		 if(row<=6)
		 i++;
		 else
		 i--;
		 System.out.println();
		}

	}

}
