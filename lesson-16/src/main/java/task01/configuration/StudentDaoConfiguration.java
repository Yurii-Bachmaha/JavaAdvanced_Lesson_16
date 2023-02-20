package task01.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import task01.dao.StudentDao;
import task01.dao.impl.StudentDaoImpl;

@Configuration
public class StudentDaoConfiguration {

	@Bean(name = "student")
	public StudentDao studentDao() {
		return new StudentDaoImpl();
	}
	
}