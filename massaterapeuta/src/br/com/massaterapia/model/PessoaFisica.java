package br.com.massaterapia.model;

import java.util.Date;

public class PessoaFisica extends Pessoa {
	
	private Date datNacimento;
	private String Cpf;
	

	public Date getDatNacimento() {
		return datNacimento;
	}

	public void setDatNacimento(Date datNacimento) {
		this.datNacimento = datNacimento;
	}

	public void setCpf(String Cpf) {
		this.Cpf = Cpf;
		
	}
	public String getCpf(String string) {
		return Cpf;
		
	}

}
