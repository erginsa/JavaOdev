package Homework;

public class InstructorManager implements UserManager {

	
	public void courseAdd() {
		System.out.println("Dersiniz sisteme eklenemiştir");
	}

	@Override
	public void add(User user) {
		System.out.println("Eğitmen olarak eklendiniz");
		
	}
	
}
