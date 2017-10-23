package org.glsid.metier;

import org.glsid.dao.CompteRepository;
import org.glsid.dao.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationMetierImpl implements OperationMetier {
	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Override
	public boolean verser(String code, double solde, Long codeEmp) {
		
		return false;
	}

	@Override
	public boolean retirer(String code, double solde, Long codeEmp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp) {
		// TODO Auto-generated method stub
		return false;
	}

}
