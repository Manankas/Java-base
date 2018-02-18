package service;

import dao.DataFromBase;
import dao.IDataFromBase;

public class Calculateur implements ICalculateur {

	// injection de dependance
	IDataFromBase data;

	@Override
	public int convertTemperature() {

		return data.getTemperature() * 100;
	}

	public Calculateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IDataFromBase getData() {
		return data;
	}

	//utilisé pour instancié la classe DAO
	public void setData(IDataFromBase data) {
		this.data = data;
	}

}
