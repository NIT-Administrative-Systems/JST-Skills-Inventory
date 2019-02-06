package com.jst.skillsinventory.service;

import com.jst.skillsinventory.entity.UserSkills;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface UserSkillService {
	public Map<String, List<UserSkills>> getAllSelectedUserSkills();
	public Map<String, List<UserSkills>> getAllSelectedUserSkillsBySkill(String skill);
}
