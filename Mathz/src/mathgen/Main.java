package mathgen;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		int a = 0;
		main.run();
		
	}
	private void run() {
		String token = "string:";
		String s = "(73134345*a/4^2)";
		for(String t : s.split(" ")){
			System.out.println("t:"+t);
				for(String u : t.split("((?<=[-0-9()/*^+])(?=[-a-zA-Z()+/^*]))|((?<=[a-zA-Z])(?=[-a-zA-Z()*/^+]))|((?<=[-a-zA-Z()+*^/])(?=[0-9]))")){
					token = token.concat(u);
					System.out.println("u:"+u);
				}
			}
		System.out.println(token);
		System.out.println("hello");
	}
	private Main(){
		
	}


}