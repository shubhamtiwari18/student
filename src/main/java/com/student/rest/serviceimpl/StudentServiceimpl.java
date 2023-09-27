package com.student.rest.serviceimpl;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.rest.dao.StudentDao;
import com.student.rest.model.student;
import com.student.rest.response.BasicResponseMsg;
import com.student.rest.response.StudentRequestVo;
import com.student.rest.service.StudentService;

@Service

public class StudentServiceimpl implements StudentService {
	
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public BasicResponseMsg saveStudent(StudentRequestVo studentRequestVo) {
		
		BasicResponseMsg response=new BasicResponseMsg();
		try {
			student s=new student();
			s.setAddress(studentRequestVo.getAddress());
			s.setAge(studentRequestVo.getAge());
			s.setMobileNumber(studentRequestVo.getMobileNumber());
			s.setName(studentRequestVo.getName());
			s.setRollNo(studentRequestVo.getRollNo());
			
			student save = studentDao.save(s);
			
			response.setData(save.getId());
			response.setMessage("student saved");
			response.setStatus(200);
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		return response;
	}

	@Override
	public BasicResponseMsg getStudent(StudentRequestVo studentRequestVo) {
		// TODO Auto-generated method stub
		BasicResponseMsg response=new BasicResponseMsg();
		try {
			Optional<student> findById=studentDao.findById(Long.valueOf(studentRequestVo.getId()));
			
			if(findById.isPresent()){
			student student= findById.get();
			response.setStatus(200);
			response.setMessage("data found");
			response.setData(student);
			}
			else {
				response.setStatus(400);
				response.setMessage("data not found");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return response;
	}

	@Override
	public BasicResponseMsg updateStudent(StudentRequestVo studentRequestVo) {
		// TODO Auto-generated method stub
		BasicResponseMsg response=new BasicResponseMsg();
		try {
			
			Optional<student> findById=studentDao.findById(Long.valueOf(studentRequestVo.getId()));
			
			if(findById.isPresent())
			{
				student student=findById.get();	
				student.setName(studentRequestVo.getName());
				student.setRollNo(studentRequestVo.getRollNo());
				
				student save = studentDao.save(student);
				
				response.setData(save.getId());
				response.setMessage("student updated");
				response.setStatus(200);
				
				
			}
			else {
				response.setStatus(400);
				response.setMessage("data not found");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	
}
