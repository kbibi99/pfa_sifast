package tn.enis.pfa.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tn.enis.pfa.model.InsuranceCard;

import tn.enis.pfa.dao.InsuranceCardDao;

@Repository("insuranceCardDao")
public class InsuranceCardDaoImpl implements InsuranceCardDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistInsuranceCard(InsuranceCard insuranceCard) {
		sessionFactory.getCurrentSession().persist(insuranceCard);
		
	}

	public void updateInsuranceCard(InsuranceCard insuranceCard) {
		sessionFactory.getCurrentSession().update(insuranceCard);
		
	}

	public void deleteInsuranceCard(InsuranceCard insuranceCard) {
		sessionFactory.getCurrentSession().delete(insuranceCard);
		
	}

	public InsuranceCard searchCardById(int id) {
		return (InsuranceCard) sessionFactory.getCurrentSession().get(InsuranceCard.class, id);
		
	}


	
	

}
