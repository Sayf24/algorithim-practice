package primeFinder;

public class mathConjecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkSteps(9));
	}
	public static int checkSteps(int n){
		int count = 1;
		while((double)n/2!=1){
			if(n%2==0){
				n=n/2;
				count++;
			}else{
				n=n*3+1;
				count++;
			}
		}
		return count;
	}
}
