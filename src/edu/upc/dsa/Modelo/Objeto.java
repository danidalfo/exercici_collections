package edu.upc.dsa.Modelo;

public class Objeto {

    public String nombre;
    public String tipo;
    public String descripcion;
    public int valor;
    public int coste;
    }

    public Objeto(String nombre,String tipo,String descripcion,int valor,int coste)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.valor = valor;
        this.coste = coste;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getTipo()
    {
        return  tipo;
    }

    public  String getDescripcion()
    {
        return descripcion;
    }

    public  int getValor()
    {
        return valor;
    }

    public int getCoste()
    {
        return coste;
    }
}

