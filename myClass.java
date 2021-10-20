public class MyClass{
	public static int myResult(int b, int c, int d, int result){
		int temp=c*d;
		for (int i=0; i<7;i++){
			result=(result-b*i)+temp;
		}
		return result;
	}
	public static void main(String [] args){
		System.out.println(myResult(2,5,7,0));
	}
}