package com.jst.skillsinventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.jst.skillsinventory.entity.UserSkills;

@Repository
@Transactional
public interface UserSkillsRepository extends JpaRepository<UserSkills, Long>{
	
	public List<UserSkills> findBySkillName(String skillName);
	public List<UserSkills> findAll();
}
