package com.raghu.service;

import java.util.List;

import com.raghu.entity.CaseWorker;

public interface ICaseWorkerService {
	Integer saveCaseWorker(CaseWorker caseworker);

	Integer updateCaseWorker(CaseWorker caseworker);

	void deleteCaseWorker(Integer id);

	CaseWorker getOneCaseWorker(Integer id);

	List<CaseWorker> getAllCaseWorker();

	boolean isCaseWorkerExist(Integer id);

	boolean isCaseWorkerEmailExist(String mail);

}
