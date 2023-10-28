package com.example5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example5.entity.Student;
import com.example5.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		
		Student student1 =new Student("siddhu","swargam","siddhu@gmail.com");
	    studentRepository.save(student1);
	    
	    Student student2 =new Student("candy","nivanshi","candy@gmail.com");
	    studentRepository.save(student2);
	    
	    Student student3 =new Student("tom","tommy","tommy@gmail.com");
	    studentRepository.save(student3);
	    
	  
	}

}
