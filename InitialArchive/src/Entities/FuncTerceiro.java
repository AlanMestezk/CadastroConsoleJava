package Entities;

import Entities.Enums.StatusFunc;

public class FuncTerceiro extends Funcionario{
	
	private Double taxPeyment;
	
	public FuncTerceiro() {
		super();
	}

	public FuncTerceiro(Integer id, String name, String role, Double salary, Integer hourWork, StatusFunc status,Double taxPeyment){
		super(id, name, role, salary, hourWork, status);
		this.taxPeyment = taxPeyment;
	}

	public Double getTaxPeyment() {
		return taxPeyment;
	}

	public void setTaxPeyment(Double taxPeyment) {
		this.taxPeyment = taxPeyment;
	}
	
	@Override
	public Double finalValue() {
		return salary -= taxPeyment;
	}
}
