package rajeshwari.codes.probsolv;

public class Main {
	public static void main(String[] args){
		int totalSum=0;
		for(int e=0; e<1000; e++){
			if(e%3==0 || e%5==0){
				totalSum+=e;
			}
		}
		System.out.println("The sum is:" + "" + totalSum);
	}

} 
