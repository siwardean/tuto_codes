package org.glsid.metier;

import java.util.Date;

import org.glsid.dao.CompteRepository;
import org.glsid.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CompteMetierImpl implements CompteMetier {
	@Autowired
	public CompteRepository compteRepository;
	@Override
	public Compte saveCompte(Compte cp) {
		// TODO Auto-generated method stub
		cp.setDateCreation(new Date());
		return compteRepository.save(cp);
	}

	@Override
	public Compte getCompte(String code) {
		// TODO Auto-generated method stub
		return compteRepository.findOne(code);
	}
	
}
