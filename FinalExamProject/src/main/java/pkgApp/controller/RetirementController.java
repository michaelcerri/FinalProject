package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtAnnualReturnWorking;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtAnnualReturnRetired;
	
	@FXML
	private TextField txtRequiredIncome;
	
	@FXML
	private TextField txtMonthlySSI;
	
	@FXML
	private TextField txtAmountToSave;
	
	@FXML
	private TextField txtTotalAmountSaved;

	

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		
		//	TODO: Clear all the text inputs
		txtYearsToWork.clear();
		txtAnnualReturnWorking.clear();
		txtYearsRetired.clear();
		txtAnnualReturnRetired.clear();
		txtRequiredIncome.clear();
		txtMonthlySSI.clear();
		
		txtAmountToSave.clear();
		txtTotalAmountSaved.clear();
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		txtAmountToSave.setDisable(false);
		txtTotalAmountSaved.setDisable(false);
		Retirement r = new Retirement();
		txtAmountToSave.setText(Double.toString(r.AmountToSave()));
		txtTotalAmountSaved.setText(Double.toString(r.TotalAmountSaved()));
		txtAmountToSave.setDisable(true);
		txtTotalAmountSaved.setDisable(true);
	}
	
}
