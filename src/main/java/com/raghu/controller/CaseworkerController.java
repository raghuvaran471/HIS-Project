package com.raghu.controller;

import java.util.List;

import javax.persistence.PostPersist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.raghu.entity.CaseWorker;
import com.raghu.service.ICaseWorkerService;

@Controller
public class CaseworkerController {

	private ICaseWorkerService service;

	@GetMapping("/register")
	public String registerPage(Model model) {

		model.addAttribute("case", new CaseWorker());
		return "CaseReg";

	}

	@PostMapping("/save")
	public String saveCaseworker(@ModelAttribute CaseWorker caseworker, Model model) {

		Integer id = service.saveCaseWorker(caseworker);

		model.addAttribute("caseworkerId", "seved with an - " + id);

		return "CaseData";

	}

	@GetMapping("/getOne")
	public String getcaseWorker(@RequestParam Integer id, Model model) {

		CaseWorker caseWorker = service.getOneCaseWorker(id);

		model.addAttribute("oneCaseWorker", caseWorker);

		return "UpdateCase";
	}

	@PutMapping("/update")
	public String updatecaseWorker(@ModelAttribute CaseWorker caseworker, Model model) {
		Integer id = service.updateCaseWorker(caseworker);

		model.addAttribute("caseId", "Caseworker updated - " + id);

		return "CaseData";
	}

	@DeleteMapping("/delete")
	public String deletecaseWorker(@RequestParam Integer id, Model model) {

		service.deleteCaseWorker(id);

		model.addAttribute("CaseId", "Delete Id - " + id);

		return "CaseData";
	}

	@GetMapping("/getAll")
	public String getAllcaseWorker(Model model) {

		List<CaseWorker> allCaseWorker = service.getAllCaseWorker();

		model.addAttribute("allCaseWorker", allCaseWorker);

		return "CaseData";
	}
	/*
	 * public String getcaseWorker() {
	 * 
	 * return null; }
	 */

}
