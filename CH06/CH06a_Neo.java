
public class CH06a_Neo {
	private String e;            // emotion for constructor
	// object 생성 되리 때마다 새로운 변수가 정의됨 
	private static int howmany = 0;    // object를 만들 때마다 increment되는 변수, 
	// static이기 때문에 object 생성될 때마다 같은 n을 공유 
	public static void main(String[] args) {
		CH06a_Neo emotion1 = new CH06a_Neo("Smile");
		CH06a_Neo emotion2 = new CH06a_Neo("Angry");
		CH06a_Neo emotion3 = new CH06a_Neo("SFighting");
		CH06a_Neo emotion4 = new CH06a_Neo("Sad");
		CH06a_Neo emotion5 = new CH06a_Neo("Happy");
		CH06a_Neo emotion6 = new CH06a_Neo("Sleepy");
		
		System.out.println("The number of Emotions: "+CH06a_Neo.gethowmany());
		emotion1.emotionStyle();
		emotion2.emotionStyle();
		emotion3.emotionStyle();
		emotion4.emotionStyle();
		emotion5.emotionStyle();
		emotion6.emotionStyle();	
	}
	public CH06a_Neo(String s){
		this.e = s;
		howmany++;
	}
	
	public static int gethowmany() {
		return howmany;
	}
	
	public void emotionStyle() {
		System.out.println("Neo is " + this.e+ ".");
	}
	
}
