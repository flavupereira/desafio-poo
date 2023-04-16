package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;
    private Instutor instrutor;
    
    
    public Curso(Instutor instrutor) {
    	this.instrutor = instrutor; 
    }
    
    public Curso() {
    	
    }
    
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

  


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
