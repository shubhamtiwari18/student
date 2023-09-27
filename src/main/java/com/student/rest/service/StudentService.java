package com.student.rest.service;

import com.student.rest.response.BasicResponseMsg;
import com.student.rest.response.StudentRequestVo;

public interface StudentService {

	BasicResponseMsg saveStudent(StudentRequestVo studentRequestVo);

	BasicResponseMsg getStudent(StudentRequestVo studentRequestVo);

	BasicResponseMsg updateStudent(StudentRequestVo studentRequestVo);



}
