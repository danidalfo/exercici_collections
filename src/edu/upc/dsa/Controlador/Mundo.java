package edu.upc.dsa.Controlador;

import edu.upc.dsa.Modelo.Objeto;
import edu.upc.dsa.Modelo.Usuario;

import java.util.HashMap;
import java.util.Vector;

public class Mundo {
    HashMap<String, Usuario> listaUsuarios;

    Mundo() {
        listaUsuarios = new HashMap<String, Usuario>();
    }

    public Boolean crearUsuario(Usuario usuario) {
        Usuario a = listaUsuarios.get(Usuario.nombre);
        if (a == null) {
            listaUsuarios.put(Usuario.nombre, usuario);
            return true;
        } else return false;

    }

    public Boolean eliminarUsuario(String nombre) {
        Usuario a = listaUsuarios.get(nombre);
        if (a == null) {
            return false;
        } else {
            listaUsuarios.remove(nombre);
            return true;
        }
    }

    public Usuario consultarUsuario(String nombre) {
        return listaUsuarios.get(nombre);
    }

    public void añadirObjetousuario(Usuario u, Objeto o) {
        listaUsuarios.get(u).añadirObjeto(o);
    }
    public  Vector<Objeto> consultarObjetoDeUsuario(Usuario u)
    {
        return listaUsuarios.get(u).getObjetosUsuario();
    }
public Objeto consultarObjetousuario(Usuario u,String nombreObjeto)
{
    return listaUsuarios.get(u).buscaObjeto(nombreObjeto);
}
    public Boolean eliminarObjetoDeUsuario(Usuario u,String s)
    {
        Usuario a = consultarUsuario(u.getNombre());
        if(a == null)
            return false;
        return a.eliminarObjeto(s);
    }
    public void transferirObjetoEntreUsuarios(Usuario origen,Usuario destino,Objeto o) {
        Usuario a = consultarUsuario(origen.getNombre());
        Usuario b = consultarUsuario(destino.getNombre());
        if (a != null && b != null) {
            if (a.buscaObjetoIndex(o.nombre) != -1) {
                a.eliminarObjeto(o.nombre);
                b.añadirObjeto(o);
            }
        }
    }
}