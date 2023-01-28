package Entities;

import Entities.Enums.StatusFunc;
import Entities.Interface.IFuncionario;

public abstract class Funcionario implements IFuncionario{
	
	private Integer id;
	private String name;
	private String role;
	protected Double salary;
	protected Integer hourWork;
	private StatusFunc status;
	
	public Funcionario() {}

	
	public Funcionario(Integer id, String name, String role, Double salary, Integer hourWork, StatusFunc status) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.hourWork = hourWork;
		this.status = status;
	}

	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Integer getHourWork() {
		return hourWork;
	}


	public void setHourWork(Integer hourWork) {
		this.hourWork = hourWork;
	}


	public StatusFunc getStatus() {
		return status;
	}


	public void setStatus(StatusFunc status) {
		this.status = status;
	}


	@Override
	public Double finalValue() {
		return null;
	}
	
	

}
