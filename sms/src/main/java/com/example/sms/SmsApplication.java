package com.example.sms;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	public void run(String... args) throws Exception{
		Student student1 = new Student("Al", "Xayeed", "alxayeed@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Abdullah", "Sayeed", "alsayeed@yahoo.com");
		studentRepository.save(student2);
	}
}
