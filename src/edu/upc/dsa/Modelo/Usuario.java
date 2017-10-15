package edu.upc.dsa.Modelo;

import edu.upc.dsa.Modelo.Objeto;

import java.util.*;

public class Usuario {
    public static String nombre;
    public static String password;
    int nivel;
    int ataque;
    int defensa;
    int resistencia;
    Vector<Objeto> ObjetosUsuario;



    public Usuario(String nombre,String password,int nivel,int ataque,int defensa,int resistencia)
    {
        this.ataque = ataque;
        this.defensa = defensa;
        this.nivel = nivel;
        this.nombre = nombre;
        this.password = password;
        this.resistencia = resistencia;
        ObjetosUsuario = new Vector<Objeto>() {};
    }

    public static String getNombre()
    {
        return nombre;
    }

    public String getPassword()
    {
        return password;
    }

    public int getNivel()
    {
        return nivel;
    }

    public int getAtaque()
    {
        return ataque;
    }

    public int getDefensa()
    {
        return defensa;
    }

    public int getResistencia()
    {
        return  resistencia;
    }

   public void añadirObjeto(Objeto ob)
    {
        ObjetosUsuario.add(ob);
    }

    public Vector<Objeto> getObjetosUsuario()
    {
        return ObjetosUsuario;
    }

    public int buscaObjetoIndex(String nombre)
    {
        int rel = -1;
        for(int i =0;i<ObjetosUsuario.size();i++)
        {
            if(ObjetosUsuario.get(i).nombre==nombre)
            {
                return i;
            }

        }
        return rel;
    }

    public Objeto buscaObjeto(String nombre)
    {
        int i = buscaObjetoIndex(nombre);
        if(i!=-1)
            return ObjetosUsuario.get(i);
        return null;
    }

    public Boolean eliminarObjeto(String Nombre)
    {
        int i = buscaObjetoIndex(nombre);
        if(i!=-1) {
            ObjetosUsuario.remove(i);
            return true;
        }
        return false;
    }
}
