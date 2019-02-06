package com.jst.skillsinventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "SKILL_LEVEL",
		uniqueConstraints = {
				@UniqueConstraint(name = "SKILL_LEVEL_UK", columnNames = "SKILL_LEVEL")
		})
public class SkillLevel {
	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name = "SKILL_LEVEL", nullable = false)
	private String skillLevel;
	
	@Column(name = "SKILL_LEVEL_DESCRIPTION", nullable = false)
	private String skillLevelDescription;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}

	public String getSkillLevelDescription() {
		return skillLevelDescription;
	}

	public void setSkillLevelDescription(String skillLevelDescription) {
		this.skillLevelDescription = skillLevelDescription;
	}

}
