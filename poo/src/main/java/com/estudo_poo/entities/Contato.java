package com.estudo_poo.entities;

public class Contato {
    
    private String tipoContato;
    
    private String contato;
    
    public Contato(String tipoContato, String contato) {
        this.tipoContato = tipoContato;
        this.contato = contato;
    }
    
    
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
    public String getTipoContato() {
        return tipoContato;
    }
    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }
    
    
}
