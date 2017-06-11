package tn.enis.pfa.dao;

import tn.enis.pfa.model.InsuranceCard;

public interface InsuranceCardDao {
	
	public void persistInsuranceCard(InsuranceCard insuranceCard) ;
	public void updateInsuranceCard(InsuranceCard insuranceCard);
	public void deleteInsuranceCard(InsuranceCard insuranceCard);
	public InsuranceCard searchCardById(int id);

}
