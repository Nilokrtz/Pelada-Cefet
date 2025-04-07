package com.estudo_poo.entities;
public class Estatistica {
    private int passes;
    private int escanteio;
    private int chutes;
    private int cartoesamarelo;
    private int cartoesvermelho;
    private int faltas;
    private int posse;
    private String gols;

public Estatistica(int passes, int escanteio, int chutes, int cartoesamarelo, int cartoesvermelho, int faltas, int posse, String gols){
    this.passes=passes;
    this.escanteio=escanteio;
    this.chutes=chutes;
    this.cartoesamarelo=cartoesamarelo;
    this.cartoesvermelho=cartoesvermelho;
    this.faltas=faltas;
    this.posse=posse;
    this.gols=gols;
}
public int setPasses(){
    return passes;
}
public void getPasses(int passes){
    this.passes=passes;
}
public int setEscanteio(){
    return escanteio;
}
public void getEscanteio(int escanteio){
    this.escanteio=escanteio;
}
public int setChutes(){
    return chutes;
}
public void getChutes(int chutes){
    this.chutes=chutes;
}
public int setCartoesamarelo(){
    return cartoesamarelo;
}
public void getCartoesmarelos(int cartoesamarelo){
    this.cartoesamarelo=cartoesamarelo;
}
public int setCartoesvermelho(){
    return cartoesvermelho;
}
public void getCartoesvermelho(int cartoesvermelho){
    this.cartoesvermelho=cartoesvermelho;
}
public int setFaltas(){
    return faltas;
}
public void getFaltas(int faltas){
    this.faltas=faltas;
}
public int setPosse(){
    return posse;
}
public void getPosse(int posse){
    this.posse=posse;
}
public String setGols(){
    return gols;
}
public void getGols(String gols){
    this.gols=gols;
}
}