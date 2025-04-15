package com.estudo_poo.entities;
import com.estudo_poo.enums.TipoContato;

public class Contato {

    private TipoContato tipo;
    private String contato;

    public Contato(TipoContato tipo, String contato) {
        this.tipo = tipo;
        this.contato = contato;
    }

    public TipoContato getTipo() {
        return tipo;
    }

    public void setTipo(TipoContato tipo) {
        this.tipo = tipo;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
		sb.append("----------------------------[ CONTATOS DO FUNCIONÁRIO ]-----------------------------\n");
		sb.append(tipo + ": " + contato + "\n");
		sb.append("------------------------------------------------------------\n");
		
        return sb.toString();
    }

}
