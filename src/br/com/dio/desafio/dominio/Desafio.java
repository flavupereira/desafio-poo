package br.com.dio.desafio.dominio;

public class Desafio extends Curso {

private int cargaHoraria;
private  Instutor instrutor;

	public Desafio(Instutor instrutor) {
		super(instrutor);
		
	}

	public Desafio () {
		
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	public void DesafioCodigo() {
		System.out.println("Desafio Logica");
	}

	public void DesafioProjeto() {
		System.out.println("Desafio de Projeto");
		
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso{" + "titulo='" + getTitulo() + '\'' + ", descricao='" + getDescricao() + '\'' + ", cargaHoraria="
				+ cargaHoraria + '}';
	}

}
