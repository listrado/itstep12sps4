package br.com.massaterapia.model;

import java.util.Date;

public class PessoaFisica extends Pessoa {
	
	private Date datNacimento;
	

	public Date getDatNacimento() {
		return datNacimento;
	}

	public void setDatNacimento(Date datNacimento) {
		this.datNacimento = datNacimento;
	}

}
