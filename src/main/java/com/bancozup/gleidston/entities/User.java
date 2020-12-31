package com.bancozup.gleidston.entities;

import java.io.Serializable;


public class User  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long codigo ;
	private String nome;
	private String email;
	private String cpf;
	private String nascimento;
	private String endereco;
	private String agencia;
	private String dataconta;



public User () {
	
}

public User(long codigo, String nome, String email, String cpf, String nascimento, String endereco, String agencia,
		String dataconta) {
	super();
	this.codigo = codigo;
	this.nome = nome;
	this.email = email;
	this.cpf = cpf;
	this.nascimento = nascimento;
	this.endereco = endereco;
	this.agencia = agencia;
	this.dataconta = dataconta;

}

public long getCodigo() {
	return codigo;
}

public void setCodigo(long codigo) {
	this.codigo = codigo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getNascimento() {
	return nascimento;
}

public void setNascimento(String nascimento) {
	this.nascimento = nascimento;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getAgencia() {
	return agencia;
}

public void setAgencia(String agencia) {
	this.agencia = agencia;
}

public String getDataconta() {
	return dataconta;
}

public void setDataconta(String dataconta) {
	this.dataconta = dataconta;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (codigo ^ (codigo >>> 32));
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (codigo != other.codigo)
		return false;
	return true;
}

}
