package com.example.praciticaexamne.Contacto;

public class contacto {
    public String getNombre() {
        return Nombre;
    }

    public int id;

    public int getId() {
        return id;
    }

    public contacto(String nombre, String telefeno, String parentesco,int ide) {
        Nombre = nombre;
        Telefeno = telefeno;
        Parentesco = parentesco;
        id = ide;
    }

    public String getTelefeno() {
        return Telefeno;
    }

    public String getParentesco() {
        return Parentesco;
    }

    @Override
    public String toString() {
        return Nombre+"-"+Telefeno+"-"+Parentesco;
    }

    public String Nombre;
    public String Telefeno;
    public String Parentesco;
}
