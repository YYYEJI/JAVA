
public class CH08_ClassFrined extends CH08_SchoolFriend{
	private String where;
	private String what_class;

	public CH08_ClassFrined(String s1, String s2) {
		where = s1;
		what_class = s2;
	}


	public String toString() {
		return ("We are friends.\n"
				+"in "+where
				+"\nin "+what_class);
	}
}
