package kodlamaIoNLayeredDemo.business;


import kodlamaIoNLayeredDemo.core.logging.Logger;
import kodlamaIoNLayeredDemo.dataAccess.CourseDao;
import kodlamaIoNLayeredDemo.entities.Course;


public class CourseManager {
	private CourseDao courseDao;
	private Logger [] loggers;
	
	
public CourseManager(CourseDao courseDao,Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers=loggers;

	}


public void add(Course course) throws Exception {
	Course[] courses= {new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (C# - Angular)", 0),new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (Java - React)", 0),new Course(3, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", 0),new Course(4, "Senior Yazılım Geliştirici Yetiştirme Kampı (.Net)", 0),new Course(5, "(2022) Yazılım Geliştirici Yetiştirme Kampı - Java", 0),new Course(6, "Programlamaya Giriş İçin Temel Kurs", 0)};
	 for (Course c : courses) {
         if (course.getCourseName() == c.getCourseName()) {
             throw new Exception("Kurs ismi tekrar edemez");
         } else if (course.getCoursePrice() < 0) {
             throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz");
	}
	
	courseDao.add(course);
	  for (Logger logger : loggers) {
          logger.log(course.getCourseName());
}
}
}
}