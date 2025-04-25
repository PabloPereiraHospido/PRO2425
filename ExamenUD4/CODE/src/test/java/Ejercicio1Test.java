import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Para ejecutar jacoco, teclear en el terminal:  ./gradlew test jacocoTestReport
//Si no se ejecuta jacoco, teclear en el terminal:
  //  $env:JAVA_HOME="XXX"
  //  Sustituyendo XXX por la ruta de java que aparece en la carpeta "external libraries" del IDE

public class Ejercicio1Test {
    @Test
    public void testExamen() {

        assertEquals(1, 1);
    }
}
