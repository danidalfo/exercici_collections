package edu.upc.dsa.Modelo;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public class Usuario {
    String nombre;
    String password;
    int nivel;
    int ataque;
    int defensa;
    int resistencia;
    SortedSet<Objeto> ObjetosUsuario;
}

    public Usuario(String nombre,String password,int nivel,int ataque,int defensa,int resistencia)
    {
        this.ataque = ataque;
        this.defensa = defensa;
        this.nivel = nivel;
        this.nombre = nombre;
        this.password = password;
        this.resistencia = resistencia;
        ObjetosUsuario = new SortedSet<Objeto>() {
            @Override
            public Comparator<? super Objeto> comparator() {
                return null;
            }

            @Override
            public SortedSet<Objeto> subSet(Objeto objeto, Objeto e1) {
                return null;
            }

            @Override
            public SortedSet<Objeto> headSet(Objeto objeto) {
                return null;
            }

            @Override
            public SortedSet<Objeto> tailSet(Objeto objeto) {
                return null;
            }

            @Override
            public Objeto first() {
                return null;
            }

            @Override
            public Objeto last() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Objeto> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Objeto objeto) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Objeto> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }

    String getNombre()
    {
        return nombre;
    }

    String getPassword()
    {
        return password;
    }

    int getNivel()
    {
        return nivel;
    }

    int getAtaque()
    {
        return ataque;
    }

    int getDefensa()
    {
        return defensa;
    }

    int getResistencia()
    {
        return  resistencia;
    }

    void añadirObjeto(Objeto ob)
    {
        ObjetosUsuario.add(ob);
    }

    SortedSet<Objeto> getObjetosUsuario()
    {
        return ObjetosUsuario;
    }
