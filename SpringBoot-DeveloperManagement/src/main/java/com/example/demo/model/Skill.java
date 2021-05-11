package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@NoArgsConstructor  
@Entity
public class Skill {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    private String label;
    private String description;
    
    public Skill(String label, String description) {
		super();
		this.label = label;
		this.description = description;
	}
}
