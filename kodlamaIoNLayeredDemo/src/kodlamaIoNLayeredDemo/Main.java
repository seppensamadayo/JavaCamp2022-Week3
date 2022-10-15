package kodlamaIoNLayeredDemo;

import kodlamaIoNLayeredDemo.business.CategoryManager;
import kodlamaIoNLayeredDemo.business.CourseManager;
import kodlamaIoNLayeredDemo.business.InstructorManager;
import kodlamaIoNLayeredDemo.dataAccess.JdbcCategoryDao;
import kodlamaIoNLayeredDemo.dataAccess.JdbcCourseDao;
import kodlamaIoNLayeredDemo.dataAccess.JdbcInstructorDao;
import kodlamaIoNLayeredDemo.entities.Course;
import kodlamaIoNLayeredDemo.entities.Instructor;
import kodlamaIoNLayeredDemo.entities.Category;
import kodlamaIoNLayeredDemo.core.logging.DatabaseLogger;
import kodlamaIoNLayeredDemo.core.logging.FileLogger;
import kodlamaIoNLayeredDemo.core.logging.Logger;
import kodlamaIoNLayeredDemo.core.logging.MailLogger;
import kodlamaIoNLayeredDemo.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		Category category1 = new Category(1,"Junior");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);
        
		Course course1=new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (C++)", 0);

CourseManager courseManager=new CourseManager(new JdbcCourseDao(), loggers);
courseManager.add(course1);

for (Logger logger:loggers) {
	logger.log(course1.getCourseName());
	
	Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
    InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
    instructorManager.add(instructor);
}
	}

}
