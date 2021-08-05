package com.nt.gagan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="TIMINGS")
public class Timings {
	
	@Id
	@Column(name="TIMING_ID")
	private Integer timingId;
	@Column(name="TIMING_NAME")
	private String timingName;

}
