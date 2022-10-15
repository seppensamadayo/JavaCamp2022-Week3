package kodlamaIoNLayeredDemo.business;

import kodlamaIoNLayeredDemo.core.logging.Logger;
import kodlamaIoNLayeredDemo.dataAccess.InstructorDao;
import kodlamaIoNLayeredDemo.entities.Instructor;

public class InstructorManager {
	 private InstructorDao instructorDao;
	    private Logger[] loggers;

	    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
	        this.instructorDao = instructorDao;
	        this.loggers = loggers;
	    }

	    public void add(Instructor instructor) {
	        instructorDao.add(instructor);
	        for (Logger logger : loggers) {
	            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
}
}
}