package com.raghu.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.raghu.Repository.CaseWorkerRepository;
import com.raghu.entity.CaseWorker;
import com.raghu.service.ICaseWorkerService;

@Service
public class CaseWorkerServiceImpl implements ICaseWorkerService {

	private CaseWorkerRepository repo;

	@Override
	public Integer saveCaseWorker(CaseWorker caseworker) {
		return repo.save(caseworker).getId();
	}

	@Override
	public Integer updateCaseWorker(CaseWorker caseworker) {
		return repo.save(caseworker).getId();

	}

	@Override
	public void deleteCaseWorker(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public CaseWorker getOneCaseWorker(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public List<CaseWorker> getAllCaseWorker() {
		return repo.findAll();
	}

	@Override
	public boolean isCaseWorkerExist(Integer id) {
		return repo.existsById(id);
	}

	@Override
	public boolean isCaseWorkerEmailExist(String mail) {
		return false;
	}

}
