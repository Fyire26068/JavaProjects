public class Loop{
	public Loop(){
		int x = 0;
		while (x < 1000000) {
			System.out.print(x);
			x++;
		}
	}
	
	public static void main(String[] args) {
		new Loop();
	}
	
}