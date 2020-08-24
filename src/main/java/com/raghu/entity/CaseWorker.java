package com.raghu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CASE_WORKER")
public class CaseWorker {

	@Id
	@GeneratedValue(generator = "Id_Gen")
	@SequenceGenerator(name = "Id_Gen", sequenceName = "CaseWorkerId_GEN")
	@Column(name = "CASEWORKER_ID")
	private Integer Id;
	@Column(name = "FIRST_NAME")
	private String FirstName;
	@Column(name = "LAST_NAME")
	private String LastName;
	@Column(name = "EMAIL")
	private String Email;
	@Column(name = "Gender")
	private String Gender;

	@ElementCollection
	@JoinTable(name = "CatL_Role", joinColumns = @JoinColumn(name = "CASEWORKER_ID_FK"))
	private List<String> Role;

}
