import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contenedor {

    private final List<Usuario> usuarios;
    private final List<Capacitacion> capacitaciones;

    public Contenedor() {
        usuarios = new ArrayList<>();
        capacitaciones = new ArrayList<>();
    }

    public void almacenarCliente(Cliente cliente) {
        usuarios.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) {
        usuarios.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo) {
        usuarios.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario(int rut) {
        Iterator<Usuario> iterator = usuarios.iterator();
        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();
            if (usuario.getRut() == rut) {
                iterator.remove();
                System.out.println("Usuario eliminado: " + rut);
            }
        }

    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

    }

    // en revision
    public void listarUsuariosPorTipo(String tipo) {
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Usuario) {
                if (tipo.equalsIgnoreCase("cliente") && usuario instanceof Cliente) {
                    System.out.println(usuario);
                } else if (tipo.equalsIgnoreCase("administrativo") && usuario instanceof Administrativo) {
                    System.out.println(usuario);
                } else if (tipo.equalsIgnoreCase("profesional") && usuario instanceof Profesional) {
                    System.out.println(usuario);
                }
            }
        }
    }


    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println(capacitacion);
        }

    }

}
