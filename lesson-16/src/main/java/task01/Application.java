package task01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import task01.dao.StudentDao;
import task01.domain.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentDao studentDao = context.getBean(StudentDao.class);

		studentDao.create(new Student(1, "John", 24));
		studentDao.create(new Student(2, "Alex", 36));
		studentDao.create(new Student(3, "Jeremy", 17));

		System.out.println("\nCreate and readAll methods:");
		studentDao.readAll().stream().forEach(System.out::println);

		System.out.println("\nUpdate and readById methods:");
		studentDao.update(new Student(2, "Maria", 29));
		System.out.println(studentDao.readById(2));

		System.out.println("\nDelete method:");
		studentDao.delete(1);
		studentDao.readAll().stream().forEach(System.out::println);

	}

}