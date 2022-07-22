
public class CH08_SchoolFriend extends CH08_Friend{
	private String where;
	
	public CH08_SchoolFriend() {
		
	}
	public CH08_SchoolFriend(String s1) {
		where = s1;
	}	

	public String toString() {
		return ( "We are friends.\n"+
				"in "+where);
	}
}
