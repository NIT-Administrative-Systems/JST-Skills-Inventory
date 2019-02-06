package com.jst.skillsinventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "SKILLS",
		uniqueConstraints = {
				@UniqueConstraint(name = "SKILLS_UK", columnNames = "SKILL_NAME")
		})
public class Skill {
//	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
	private Long id;
	@Id
	@Column(name = "SKILL_NAME", nullable = false)
	private String skillName;
	
	@Column(name = "SKILL_DESCRIPTION", nullable = false)
	private String skillDescription;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}
	

}
