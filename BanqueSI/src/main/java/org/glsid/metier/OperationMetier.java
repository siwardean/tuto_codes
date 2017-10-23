package org.glsid.metier;

public interface OperationMetier {
	public boolean verser(String code, double solde, Long codeEmp);
	public boolean retirer(String code, double solde, Long codeEmp);
	public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp);
}