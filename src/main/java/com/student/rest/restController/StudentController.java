package com.student.rest.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.rest.response.BasicResponseMsg;
import com.student.rest.response.StudentRequestVo;
import com.student.rest.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("saveStudent")

	public ResponseEntity<BasicResponseMsg> saveStudent(@RequestBody StudentRequestVo studentRequestVo) {
		BasicResponseMsg response = new BasicResponseMsg();
		try {

			response = studentService.saveStudent(studentRequestVo);

		} catch (Exception e) {
			e.printStackTrace();

		}

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("getStudent")

	public ResponseEntity<BasicResponseMsg> getStudent(@RequestBody StudentRequestVo studentRequestVo) {

		BasicResponseMsg response = new BasicResponseMsg();
		try {

			response = studentService.getStudent(studentRequestVo);

		} catch (Exception e) {
			e.printStackTrace();

		}

		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PutMapping("updateStudent")

	public ResponseEntity<BasicResponseMsg> updateStudent(@RequestBody StudentRequestVo studentRequestVo) {

		BasicResponseMsg response = new BasicResponseMsg();
		try {

			response = studentService.updateStudent(studentRequestVo);

		} catch (Exception e) {
			e.printStackTrace();

		}

		return new ResponseEntity<>(response, HttpStatus.OK);
}
}
