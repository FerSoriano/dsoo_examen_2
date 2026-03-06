import model.*;
import persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InformacionGeneral infoInstitucion = new InformacionGeneral(
                1,
                1,
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

        infoInstitucion.agregarDepartamento(depto);

        Carrera sistemas = new Carrera(
                201,
                "Ingeniería en Sistemas",
                "Carrera de software",
                "Grado",
                "Pensum 2026"
        );
        depto.agregarPrograma(sistemas);

        Postgrado maestriaIA = new Postgrado(
                401,
                "Maestría en IA",
                "Especialización en redes neuronales",
                "Posgrado",
                "Ciencias computacionales",
                "Título de ingeniería"
        );
        depto.agregarPrograma(maestriaIA);

        Evento diaDelIngeniero = new Evento(
                50,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(2),
                "Exhibición de proyectos",
                "Dia del Ingeniero UNIVA"
        );
        depto.agregarEvento(diaDelIngeniero);

        Noticia noticiaUniva = new Noticia(
                1,
                LocalDateTime.now(),
                "Inauguración del nuevo laboratorio de innovación",
                "Nuevos espacios para ingeniería"
        );
        Imagen bannerLab = new Imagen(10, "Banner Laboratorio", "lab_path.jpg");

        noticiaUniva.agregarImagen(bannerLab);
        depto.agregarNoticia(noticiaUniva);

        Investigacion invData = new Investigacion(
                5,
                "Optimización de BigQuery",
                "Estudio sobre particionamiento de datos"
        );
        Material pdfEstudio = new Material(88, "https://docs.univa.mx/estudio", "Analisis_GCP.pdf");
        invData.agregarMaterial(pdfEstudio);
        depto.agregarInvestigacion(invData);

        Docente profesor1 = new Docente(
                10,
                "Titular",
                "Irving Mendoza",
                "i.mendoza@univa.mx",
                "pass",
                "Software",
                "CED123");

        Alumno alumno1 = new Alumno(1, "Activo", "Leonel Flores", "l.flores@univa.mx", "pass", "ING001");
        Alumno alumno2 = new Alumno(2, "Activo", "Fernando Soriano", "f.soriano@univa.mx", "pass", "ING002");

        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);

        Asignatura dsoo = new Asignatura(300, "DSOO", 8, profesor1, listaAlumnos);

        profesor1.asignarMateria(dsoo);
        sistemas.agregarAsignatura(dsoo);
        dsoo.setAlumnos(listaAlumnos);

        DocenteDAO docenteRepo = new DocenteDAO();
        docenteRepo.insertar(profesor1);

        AlumnoDAO alumnoRepo = new AlumnoDAO();
        alumnoRepo.insertar(alumno1);
        alumnoRepo.insertar(alumno2);

        int lines = infoInstitucion.getMision().length();
        System.out.println("=".repeat(lines / 2) + " " + infoInstitucion.getNombre() + " " + "=".repeat(lines / 2) );
        System.out.println("Misión:\n\t- " + infoInstitucion.getMision());
        System.out.println("-".repeat(lines + 6));
        System.out.println("Departamento: " + depto.getNombre());
        System.out.println("Coordinador: " + depto.getCoordinador().getNombre());
        System.out.println("Oferta Académica:");
        for (ProgramaAcademico pa : depto.obtenerOfertaAcademica()) {
            System.out.println("\t- " + pa.getNombre());
        }
        System.out.println("Asignatura: " + dsoo.getNombre() + " (Docente: " + dsoo.getDocente().getNombre() + ")");
        System.out.println("Alumnos inscritos: " + dsoo.getAlumnos().size());
        for (Alumno al : dsoo.getAlumnos()) {
            System.out.println("\t- " + al.getNombre());
        }
        System.out.println("Investigaciones activas:");
        System.out.println("\t- " + invData.getNombre() + " (Archivo: " + invData.getMateriales().get(0).getDocumento() + ")");
        System.out.println("Noticias recientes:");
        System.out.println("\t- " + noticiaUniva.getTitular() + " [Imagen: " + noticiaUniva.getImagenes().get(0).getTitulo() + "]");
        System.out.println("Evento hoy: " + diaDelIngeniero.getNombre());
    }
}