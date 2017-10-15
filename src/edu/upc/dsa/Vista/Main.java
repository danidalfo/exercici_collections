package edu.upc.dsa.Vista;

import edu.upc.dsa.Controlador.Mundo;
import edu.upc.dsa.Modelo.Usuario;
import edu.upc.dsa.Modelo.Objeto;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        int operacion = 0;
        Mundo m = new Mundo();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            while (operacion != 64) {
                String op;
                System.out.println("Menu");
                System.out.println("1 crea un usuario");
                System.out.println("2 crea un objeto a un usuario dado");
                System.out.println("3 transfiere un objeto de un usuario a otro");
                System.out.println("4 recibe la informacion de un usuario");
                System.out.println("5 eliminar un usuario");
                System.out.println("6 mostrar objetos usuario");
                System.out.println("64 salir");
                op = reader.readLine();
                operacion = Integer.parseInt(op);

                if (operacion == 1) {
                    Usuario u;
                    String nombre;
                    String password;
                    String nivel;
                    String defensa;
                    String ataque;
                    String resistencia;
                    String prova;

                    System.out.println("escribe un nombre");
                    nombre = reader.readLine();

                    System.out.println("escribe un contraseña");
                    password = reader.readLine();

                    System.out.println("escribe un nivel");
                    nivel = reader.readLine();

                    System.out.println("escribe un defensa");
                    defensa = reader.readLine();

                    System.out.println("escribe un ataque");
                    ataque = reader.readLine();

                    resistencia = consulta("escribe la resistencia");

                    u = new Usuario(nombre, password, Integer.parseInt(nivel), Integer.parseInt(ataque), Integer.parseInt(defensa), Integer.parseInt(resistencia));
                    if (m.crearUsuario(u)) {
                        System.out.println("usuario creado correctamente");
                    } else {
                        System.out.println("error al crear el usuario");
                    }
                }

                if (operacion == 2) {
                    Objeto o;
                    String nombre;
                    String tipo;
                    String descripcion;
                    int valor;
                    int coste;
                    String usuario;

                    nombre = consulta("escribe el nombre");
                    descripcion = consulta("escribe la descripcion");
                    tipo = consulta("escribe el tipo");
                    valor = Integer.parseInt(consulta("escribe el valor"));
                    coste = Integer.parseInt(consulta("escribe el coste"));
                    usuario = consulta("escribe el nombre del usuario");
                    o = new Objeto(nombre, tipo, descripcion, valor, coste);

                    m.añadirObjetousuario(m.consultarUsuario(usuario), o);

                }

                if(operacion==3)
                {
                    String nombre1;
                    String nombre2;
                    String nombreObjeto;

                    nombre1 = consulta("escribe el nombre del primer usuario");
                    nombre2 = consulta("escribe el nombre del segundo usuario");
                    nombreObjeto = consulta("escribe el nombre del objeto");
                    m.transferirObjetoEntreUsuarios(m.consultarUsuario(nombre1),m.consultarUsuario(nombre2),m.consultarObjetousuario(m.consultarUsuario(nombre1),nombreObjeto));

                }
                if(operacion==4)
                {
                    String nombre1 = consulta("escribe el nombre del primer usuario");
                    Usuario us = m.consultarUsuario(nombre1);
                    System.out.println("ataque "+us.getAtaque());
                    System.out.println("defensa "+us.getDefensa());
                    System.out.println("nivel "+us.getNivel());
                    System.out.println("resistencia "+us.getPassword());
                    System.out.println("nombre "+us.getNombre());
                }

                if(operacion==6)
                {
                    String nombre1 = consulta("escribe el nombre del primer usuario");
                    Vector<Objeto> objectes = m.consultarUsuario(nombre1).getObjetosUsuario();
                    for(int i=0;i<objectes.size();i++) {
                        System.out.println("nombre " + objectes.get(i).getNombre());
                        System.out.println("descripcio " + objectes.get(i).getDescripcion());
                        System.out.println("tipo " + objectes.get(i).getTipo());
                        System.out.println("coste " + objectes.get(i).getCoste());
                        System.out.println("valor " + objectes.get(i).getValor());
                        System.out.println();
                    }

                }

                if(operacion==5)
                {
                    String nombre1 = consulta("escribe el nombre del primer usuario");
                    if(m.eliminarUsuario(nombre1))
                    {
                        System.out.println("usuario eliminado");
                    }
                    else
                    {
                        System.out.println("error");
                    }
                }
            }
        }
        catch (IOException e)
        {

        }
    }

    public static String consulta (String enunciado)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(enunciado);
            return reader.readLine();
        }
        catch (IOException e)
        {
            return "error";
        }
    }
}