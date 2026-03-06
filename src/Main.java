import model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InformacionGeneral infoInstitucion = new InformacionGeneral(
                1,
                1, // 1 = privada
                "UNIVA",
                "Institución líder en formación técnica y científica.",
                "Formar líderes con sentido humano y excelencia académica.",
                "Rectoría -> Direcciones -> Departamentos",
                "Docencia, Investigación y Extensión Universitaria"
        );


        Usuario coord = new Usuario(
                1,
                TIPO_USUARIO.COORDINADOR,
                "Senior",
                "María Elena",
                "elena@univa.mx",
                "123");
        Departamento depto = new Departamento(
                101,
                "Ingenierías",
                "Área tecnológica",
                coord);

        Carrera sistemas = new Carrera(
                201,
                "Ingeniería en Sistemas",
                "Carrera de software",
                "Grado",
                "Pensum 2026"
        );
        depto.agregarPrograma(sistemas);

        Evento diaDelIngeniero = new Evento(
                50,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(2),
                "Exhibición de proyectos",
                "Dia del Ingeniero UNIVA"
        );
        depto.agregarEvento(diaDelIngeniero);

        Docente profesor1 = new Docente(
                10,
                "Titular",
                "Irving Mendoza",
                "i.mendoza@univa.mx",
                "pass",
                "Software",
                "CED123");

        Alumno alumno1 = new Alumno(
                001,
                "Activo",
                "Leonel Flores",
                "l.flores@univa.mx",
                "pass",
                "ING001"
        );

        Alumno alumno2 = new Alumno(
                002,
                "Activo",
                "Fernando Soriano",
                "f.soriano@univa.mx",
                "pass",
                "ING002"
        );

        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);

        Asignatura dsoo = new Asignatura(300, "DSOO", 8, profesor1, listaAlumnos);

        profesor1.asignarMateria(dsoo);
        sistemas.agregarAsignatura(dsoo);

        int lines = infoInstitucion.getMision().length();

        System.out.println("=".repeat(lines / 2) + " " + infoInstitucion.getNombre() + " " + "=".repeat(lines / 2) );
        System.out.println("Misión:\n\t- " + infoInstitucion.getMision());
        System.out.println("-".repeat(lines + 6));
        System.out.println("Departamento: " + depto.getNombre());
        System.out.println("Coordinador: " + depto.getCoordinador().getNombre());
        System.out.println("Programa: " + sistemas.getNombre());
        System.out.println("Asignatura: " + dsoo.getNombre() + " impartida por " + dsoo.getDocente().getNombre());
        System.out.println( "Alumnos: ");
        for (Alumno al : dsoo.getAlumnos()) {
            System.out.println("\t- " + al.getNombre());
        }
        System.out.println("Evento hoy: " + diaDelIngeniero.getNombre());
    }
}