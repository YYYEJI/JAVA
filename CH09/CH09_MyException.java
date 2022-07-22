
public class CH09_MyException extends Exception {
	public String toString() {
		return ("String should not include\nspecial character $.");
	}
}
