package com.ust.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Finance_rest_tab")
public class Finance {
	@Id
	@Column(name="fId", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer fId;

	@Column(name="fName",length = 20)
	private String fName;

	@Column(name="email")
	private String email;

	@Column(name="exp")
	private Integer exp;

}

