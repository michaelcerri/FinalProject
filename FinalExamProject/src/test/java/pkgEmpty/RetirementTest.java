package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class RetirementTest {

	@Test
	public void Testpv() {
		int iYearsRetired = 20;
		double dannualReturn = 0.02;
		double dExpectedPV = -1454485.55;
		
		Retirement rt = new Retirement();
		
		rt.setdAnnualReturnRetired(dannualReturn);
		rt.setdMonthlySSI(2642);
		rt.setdRequiredIncome(10000);
		rt.setiYearsRetired(iYearsRetired);
		
		assertEquals(dExpectedPV,rt.TotalAmountSaved(), 1);
	}

	@Test 
	public void Testpmt() {
		int iYearsRetired = 20;
		double dannualReturn = 0.02;
		double dExpectedPMT = 554.13;
		double dAnnualReturnWorking = .07;
		int iYearsToWork = 40;
		
		Retirement rt = new Retirement();
		
		rt.setdAnnualReturnRetired(dannualReturn);
		rt.setdMonthlySSI(2642);
		rt.setdRequiredIncome(10000);
		rt.setiYearsRetired(iYearsRetired);
		rt.setdAnnualReturnWorking(dAnnualReturnWorking);
		rt.setiYearsToWork(iYearsToWork);
		
		
		assertEquals(dExpectedPMT, rt.AmountToSave(),1);
	}
}
