package com.nt.gagan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="GENDERS")
public class Genders {
	
	@Id
	@Column(name="GENDER_ID")
	private Integer genderId;
	@Column(name="GENDER_NAME")
	private String genderName;

}
