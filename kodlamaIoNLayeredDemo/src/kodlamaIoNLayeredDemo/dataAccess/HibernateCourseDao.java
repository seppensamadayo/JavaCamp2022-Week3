package kodlamaIoNLayeredDemo.dataAccess;

import kodlamaIoNLayeredDemo.entities.Course;

public class HibernateCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println("JDBC ile veritabanına eklendi");
}
}
