package ud5;

/**
 * @author pabloPereira
 */

public class Teoria5 {
    public static void main(String[] args) {


        Persona maria;
        maria = new Profesor();
        Persona manuel = maria;
        maria.setEdad(30);
        System.out.println(maria.getEdad());
        System.out.println(manuel.getEdad());
        maria.setCuentaBancaria("1234abx");
        maria.setNombre("Maria");
        maria.setDni(123456);
        maria.setEdad(25);
        maria.setCuentaBancaria("1234bbv");
        maria.setApellido("Menendez");
        maria.setDireccionPostal("27003");
        maria.setEmail("Maria@gmail.com");
        //maria.sexo no deja ya que es private
        //maria.grupoSanguineo no deja al ser private
        //maria.telefono no deja al ser private


        Persona aurelia2 = new Alumno();
        aurelia2.setNombre("Aurelia");
        aurelia2.setApellido("Ramirez");


        Persona manolo2 = new Alumno();
        manolo2.setNombre("Manolo");
        manolo2.setApellido("Perez");
        manolo2.setEdad(35);
        manolo2.setDni(12345);
        manolo2.setFechaNacimiento("1999-01-01");
        manolo2.setCuentaBancaria("12345abx");
        manolo2.setDireccionPostal("27003");
        manolo2.setEmail("manolo@gmail.com");
        manolo2.setTelefono(12345);
        manolo2.setGrupoSanguineo("a");
        manolo2.setSexo(Sexo.HOMBRE);

        Persona hector = new Alumno();
        hector.setNombre("Hector");

        Profesor victor = new Profesor();
        victor.setNombre("Victor");

        Alumno Pablo = new Alumno();
        Pablo.setNombre("Pablo");

        Persona vladimir = new Alumno();
        vladimir.trabajar();

        Alumno aitor = new Alumno();
        aitor.trabajar();

        Profesor Victor2 = new Profesor();
        victor.trabajar();
        victor.setNombre("Victor");
        victor.setApellido("Blanco");
        System.out.println(victor.toString());
        System.out.println(aitor.toString());
        System.out.println(vladimir.toString());
        Animal leo = new Animal();
        Animal maya = new Perro();

        leo.mueve();
        maya.mueve();
        ((Perro) maya).salta();

        FiguraGeometrica[] figuras = new FiguraGeometrica[5];
        figuras[0] = new Rectangulo(5, 10);
        figuras[1] = new Rectangulo(10, 10);
        figuras[2] = new Rectangulo(15, 11);
        figuras[3] = new Circulo(10);
        figuras[4] = new Circulo(50);
        for (int i = 0; i < figuras.length; i++) {
            System.out.println(figuras[i].getArea());

        }
        int reparto = 0;
        try {
            reparto = repartir(100, 2);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            System.out.println(reparto);
        }

    }

    public static int repartir(int dinero, int personas) throws Exception {
        if (personas < 1) {
            throw (new Exception("No se puede dividir entre 0"));

        } else {

            return dinero / personas;
        }

    }
}

