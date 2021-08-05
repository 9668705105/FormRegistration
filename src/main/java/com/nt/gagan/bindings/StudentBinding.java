package com.nt.gagan.bindings;

import lombok.Data;

@Data
public class StudentBinding {
	private String name;
	private String email;
	private Long phno;
	private String gender;
	private String course;
	private String[] timings;

}
