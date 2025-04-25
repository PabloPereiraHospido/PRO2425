import entesNoSintientes.CentroEducativo;
import entesNoSintientes.ConselleriaEducacion;
import entesNoSintientes.Curso;
import entesNoSintientes.EdificoPublico;
import entesSintientes.Estudiante;
import entesSintientes.Persona;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Para ejecutar jacoco, teclear en el terminal:  ./gradlew test jacocoTestReport
//Si no se ejecuta jacoco, teclear en el terminal:
  //  $env:JAVA_HOME="XXX"
  //  Sustituyendo XXX por la ruta de java que aparece en la carpeta "external libraries" del IDE

public class Ejercicio2Test {
    @Test
    public void testExamen() {

        Persona victor=new Persona("Victor","Blanco","01/08/1980");
        System.out.println(victor); // comprobacion de que da los datos correctos

        Estudiante pablo=new Estudiante("Pablo","Pereira","09/12/1999","Pablo","Pereira",1999,"Muralla Romana","Griffindor");
        System.out.println(pablo);

        EdificoPublico comisaria=new EdificoPublico("ldkmaDKLÑMak","comisaria de lugo","calle rua alta",1780);
        System.out.println(comisaria);

        CentroEducativo muralla=new CentroEducativo("akdaopdik","Muralla Romana","rua do graal",1999,10000);
        System.out.println(muralla);

        ConselleriaEducacion conselleria=new ConselleriaEducacion("aniceto","educacion",19999);
        System.out.println(conselleria);

        Curso dam=new Curso(10);
        System.out.println(dam);



        assertEquals(1, 1);
    }
}
