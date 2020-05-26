package com.zetcode.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;


@Entity                     // 클래스와 테이블 매핑
@Table(name = "cities")     // 매핑할 테이블 정보 명시 
public class City implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name="ProjectID")
	private String id;
	          
	private String name;
	private String population;
	
	
	@CreationTimestamp
	private Timestamp regDate;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPopulation() {
		return population;
	}


	public void setPopulation(String population) {
		this.population = population;
	}


	public Timestamp getRegDate() {
		return regDate;
	}


	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	

	
}

// 모델: 백그라운드에서 동작하는 로직을 처리합니다


