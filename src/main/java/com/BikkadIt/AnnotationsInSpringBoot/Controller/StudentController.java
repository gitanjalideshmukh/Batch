package com.BikkadIt.AnnotationsInSpringBoot.Controller;

import com.BikkadIt.AnnotationsInSpringBoot.Service.StudentService;
import com.BikkadIt.AnnotationsInSpringBoot.model.Student;

public class StudentController {

	public StudentController() {
		super();
		System.out.println("Student Class Controller");
	}

	public Student saveStudentController(Student stu) {
		System.out.println(stu);
		
	StudentService studentservice= new StudentService();
	Student saveStudentService = studentservice.saveStudentService(stu);
		return stu;
		
	}
<<<<<<< HEAD
	private Student Controller(){
=======
	
private Student Controller(){
>>>>>>> 81d2c1c (this is demo file and other commit)

return stu;
}

private Student Controller(){

return stu;
}
<<<<<<< HEAD
=======



>>>>>>> 81d2c1c (this is demo file and other commit)
}
