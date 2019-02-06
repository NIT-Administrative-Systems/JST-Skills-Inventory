package com.jst.skillsinventory.service;

import com.jst.skillsinventory.entity.UserSkills;
import com.jst.skillsinventory.entity.Skill;
import com.jst.skillsinventory.repository.UserSkillsRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSkillServiceImpl implements UserSkillService{
	
	@Autowired 
	private UserSkillsRepository  _UserSkillsRepository;
	
	public Map<String, List<UserSkills>> getAllSelectedUserSkills(){
		
		List<UserSkills> usrSkillsList = _UserSkillsRepository.findAll();
		
		Map<String, List<UserSkills>> userSkillMap = 
				usrSkillsList
				.stream()
				.collect (Collectors.groupingBy(UserSkills::getSkillName));
		return userSkillMap;
	
	}
	public Map<String, List<UserSkills>> getAllSelectedUserSkillsBySkill(String skillName){
		List<UserSkills> usrSkillsList = _UserSkillsRepository.findBySkillName(skillName);
		
		Map<String, List<UserSkills>> userSkillMap = 
				usrSkillsList
				.stream()
				.collect (Collectors.groupingBy(UserSkills::getSkillName));
		return userSkillMap;
	
	}


}
