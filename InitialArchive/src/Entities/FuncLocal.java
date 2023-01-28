package Entities;

import Entities.Enums.StatusFunc;

public class FuncLocal extends Funcionario{
	
	private Double transportFee;
	private Double voucherFee;
	
	public FuncLocal() {
		super();
	}

	public FuncLocal(Integer id, String name, String role, Double salary, Integer hourWork, StatusFunc status,Double transportFee, Double voucherFee) {
		super(id, name, role, salary, hourWork, status);
		this.transportFee = transportFee;
		this.voucherFee = voucherFee;
	}

	public Double getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(Double transportFee) {
		this.transportFee = transportFee;
	}

	public Double getVoucherFee() {
		return voucherFee;
	}

	public void setVoucherFee(Double voucherFee) {
		this.voucherFee = voucherFee;
	}
	
	@Override
	public Double finalValue() {

		return salary - voucherFee - transportFee;
	}
	
}
