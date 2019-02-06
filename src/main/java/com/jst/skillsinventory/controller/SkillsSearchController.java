package com.jst.skillsinventory.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jst.skillsinventory.dto.UserDto;
import com.jst.skillsinventory.entity.UserSkills;
import com.jst.skillsinventory.repository.UserSkillsRepository;
import com.jst.skillsinventory.repository.UsersRepository;
import com.jst.skillsinventory.service.UserSkillService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SkillsSearchController {
	
	@Autowired
	private UserSkillsRepository _UserSkillsRepository;
	
	@Autowired
	private UserSkillService _UserSkillService;
	
	private List skillsList = new ArrayList();
	
	@RequestMapping(value = {"/skillSearch"}, method = RequestMethod.GET)
	public String skillsSearch(Model model) {
		model.addAttribute("skills", skillsList);
		return "SkillsSearch";
	}
	@RequestMapping(value = {"/skillSearchResult"}, method = RequestMethod.GET)
	public String skillSearchResult(Model model) {
		
		Map<String, List<UserSkills>> userSkills = _UserSkillService.getAllSelectedUserSkills();
		
		model.addAttribute("userSkills", userSkills);
		return "SkillsSearchResult";
	}
	@RequestMapping(value = {"/individualSkillsSearchResult/{id}"}, method = RequestMethod.GET)
	public String indivSkillSearchRes(@PathVariable(value="id") Long id, Model model)
	{
		return "IndividualSkillsSearchResult";
	}
		
}
