package com.example.ladeliciacurier.model;

import java.sql.Date;
import java.sql.Time;

public class Pedido {
    private int id_pedido;
    private int id_users;
    private String user_nom;
    private String user_dir;
    private int user_tel;
    private String des_pedido;
    private int can_pedido ;
    private Double pre_pedido;
    private String hora_entrega;
    private int estado;
    private String medio_pago;

    public Pedido(int id_pedido, int id_users, String user_nom, String user_dir, int user_tel, String des_pedido, int can_pedido, Double pre_pedido, String hora_entrega, int estado, String medio_pago) {
        this.id_pedido = id_pedido;
        this.id_users = id_users;
        this.user_nom = user_nom;
        this.user_dir = user_dir;
        this.user_tel = user_tel;
        this.des_pedido = des_pedido;
        this.can_pedido = can_pedido;
        this.pre_pedido = pre_pedido;
        this.hora_entrega = hora_entrega;
        this.estado = estado;
        this.medio_pago = medio_pago;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_users() {
        return id_users;
    }

    public void setId_users(int id_users) {
        this.id_users = id_users;
    }

    public String getUser_nom() {
        return user_nom;
    }

    public void setUser_nom(String user_nom) {
        this.user_nom = user_nom;
    }

    public String getUser_dir() {
        return user_dir;
    }

    public void setUser_dir(String user_dir) {
        this.user_dir = user_dir;
    }

    public int getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(int user_tel) {
        this.user_tel = user_tel;
    }

    public String getDes_pedido() {
        return des_pedido;
    }

    public void setDes_pedido(String des_pedido) {
        this.des_pedido = des_pedido;
    }

    public int getCan_pedido() {
        return can_pedido;
    }

    public void setCan_pedido(int can_pedido) {
        this.can_pedido = can_pedido;
    }

    public Double getPre_pedido() {
        return pre_pedido;
    }

    public void setPre_pedido(Double pre_pedido) {
        this.pre_pedido = pre_pedido;
    }

    public String getHora_entrega() {
        return hora_entrega;
    }

    public void setHora_entrega(String hora_entrega) {
        this.hora_entrega = hora_entrega;
    }
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(String medio_pago) {
        this.medio_pago = medio_pago;
    }
}
