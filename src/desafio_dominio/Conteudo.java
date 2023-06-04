package desafio_dominio;

public abstract class Conteudo { // abstract para que ela nao possa ser criada e sim servir suas filhas curso e mentoria
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
  
    public abstract double calcularXP();
    
    public String getTitulo(){
        return titulo;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
