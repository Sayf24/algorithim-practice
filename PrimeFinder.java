package primeFinder;
import java.util.ArrayList;
public class PrimeFinder {
	static ArrayList<Integer> unmarked = new ArrayList<Integer>();
	static ArrayList<Integer> marked = new ArrayList<Integer>();
	public static void main(String[] args) {
		System.out.println("yes");
		fillArrayList(100);

		findPrimes(100);
		//unmarked.toString();
		printList();
		System.out.println("yes");
	}
	public static void fillArrayList(int n){
		for(int a=2;a<n;a++){
			unmarked.add(a);
		}
	}
	public static void printList(){
		for(int i=0;i<unmarked.size();i++){
			System.out.println(unmarked.get(i));
		}
	}
	public static boolean binarySearch(int n){
		int high = unmarked.size()-1;
		int low = 0;
		while(low<=high){
			int mid = (low+high)/2;
			if(n==unmarked.get(mid)){
				System.out.println("woo");
				return true;
			}
			if(n>unmarked.get(mid)){
				low=mid+1;
			}else if(n<unmarked.get(mid)){
				high=mid-1;
			}
		}
		return false;
	}
	public static void findPrimes(int n){
		for(int i=2;i<=(int)Math.sqrt(n);i++){
			if(binarySearch(i)){
				for(int a=0;a<unmarked.size();a++){
					if(unmarked.get(a)>unmarked.get(i)&& unmarked.get(a)%i==0||unmarked.get(a)==4){
						unmarked.remove(a);
					}
				}
			}
		}
	}
}
