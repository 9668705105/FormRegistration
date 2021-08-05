package com.nt.gagan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.gagan.entity.Courses;
import com.nt.gagan.entity.Genders;
import com.nt.gagan.entity.Timings;
import com.nt.gagan.repositories.CourseRepository;
import com.nt.gagan.repositories.GenderRepository;
import com.nt.gagan.repositories.TimingRepository;

@Service
public class StudentService {
	
	@Autowired
	private GenderRepository gendersRepo;
	@Autowired
	private CourseRepository coursesRepo;
	@Autowired
	private TimingRepository timingsRepo;
	
	public List<String> getGenders(){
		List<Genders> findAll = gendersRepo.findAll();
		List<String> genders=new ArrayList<>();
		findAll.forEach(g->{
			genders.add(g.getGenderName());	
		});
		return genders;	
	}
	public List<String> getCourses(){
		List<Courses> khojingAll = coursesRepo.findAll();
		
		List<String> course=new ArrayList<>();
		khojingAll.forEach(c->{
			course.add(c.getCourseName());
		});
		return course;
	}
	public List<String> getTimings(){
		List<Timings> findAll = timingsRepo.findAll();
		List<String> addingAll=new ArrayList<>();
		findAll.forEach(t->{
			addingAll.add(t.getTimingName());
		});
		return addingAll;
	}
	
	
	
	
	

}
