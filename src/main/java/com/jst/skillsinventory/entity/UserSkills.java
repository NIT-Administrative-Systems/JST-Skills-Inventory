package com.jst.skillsinventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
 
@Entity
@Table(name = "USERS_SKILLS", 
        uniqueConstraints = { 
                @UniqueConstraint(name = "USERS_SKILLS_UK", columnNames = {"USERS_ID", "SKILL_NAME"}) })
public class UserSkills {
 
    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    private Long id;
 
    @ManyToOne
    @JoinColumn(name="USERS_ID", insertable = false, updatable = false)
    private Users users;
    
    @ManyToOne
    @JoinColumn(name="SKILL_NAME", insertable = false, updatable = false)
    private Skill skill;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SKILL_LEVEL_ID", insertable = false, updatable = false)
    private SkillLevel skillLevel;
    
    @ManyToOne
    @JoinColumn(name="ROLE_ID", insertable = false, updatable = false)
    private Role role;

	@Column(name = "USERS_ID",  nullable = false)
    private Long userId;
    
    @Column(name = "SKILL_NAME",  nullable = false)
    private String skillName;

	@Column(name = "SKILL_LEVEL_ID",  nullable = false)
    private Long skillLevelId;
 
    @Column(name = "SKILL_LAST_TIME_USED", length = 20,  nullable = false)
    private String skillLastTimeUsed;
    
    @Column(name = "YEARS_SKILL_USED",  nullable = false)
    private int yearsSkillUsed;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Long getSkillLevelId() {
		return skillLevelId;
	}

	public void setSkillLevelId(Long skillLevelId) {
		this.skillLevelId = skillLevelId;
	}

	public String getSkillLastTimeUsed() {
		return skillLastTimeUsed;
	}

	public void setSkillLastTimeUsed(String skillLastTimeUsed) {
		this.skillLastTimeUsed = skillLastTimeUsed;
	}

	public int getYearsSkillUsed() {
		return yearsSkillUsed;
	}

	public void setYearsSkillUsed(int yearsSkillUsed) {
		this.yearsSkillUsed = yearsSkillUsed;
	}
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	   
    public SkillLevel getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(SkillLevel skillLevel) {
		this.skillLevel = skillLevel;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}