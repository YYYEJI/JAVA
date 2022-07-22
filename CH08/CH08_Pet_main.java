import java.util.Scanner;

public class CH08_Pet_main {
	public static void main(String[] args) {
		String cat_name, dog_name;
		
		CH08_Cat cat = new CH08_Cat();
		CH08_Dog dog = new CH08_Dog();
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the cat name and dog name: ");
		cat_name = s.next();
		dog_name = s.next();
		
		cat.setName(cat_name);    cat.getName();        feed(cat);
		dog.setName(dog_name);    dog.getName();        feed(dog);
		s.close();
		
	}
	public static void feed(CH08_Pet pet) {
		System.out.println("feed: " + pet.food());
	}
}
