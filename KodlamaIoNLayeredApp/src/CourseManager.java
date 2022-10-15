import dataManagement.IManager;

public class CourseManager implements IManager{

	@Override
	public void add() {
System.out.println("Kurs eklendi.")		;
	}

	@Override
	public void update() {
		System.out.println("Kurs güncellendi.")		;
		
	}

	@Override
	public void delete() {
		System.out.println("Kurs silindi.")		;
		
	}

}
