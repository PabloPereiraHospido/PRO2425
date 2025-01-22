package UD5;

public class Teoria5 {
    public static void main(String[] args) {
        Persona pablo = new Alumno();
        pablo.setEdad(25);
        pablo.setNombre("Pablo");
        pablo.setApellido("Pereira");
        pablo.setDni(12345);
        pablo.setFechaNacimiento("1999-12-09");

        System.out.println(pablo.getEdad());
        System.out.println(pablo.getApellido());
        System.out.println(pablo.getDni());
        System.out.println(pablo.getFechaNacimiento());

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

       // Persona aurelia = new Profesor("Aurelia", "Ramirez");

        Persona aurelia2 = new Alumno();
        aurelia2.setNombre("Aurelia");
        aurelia2.setApellido("Ramirez");

       // Persona manolo = new Alumno("Manolo", "Perez", 35, 12345, "12345.Y", "1999_01-01", "12345abx", "27003", "manolo@gmail.com", 12345, "a", Sexo.HOMBRE);
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
       // Perro lola = (Perro) new Animal();
        leo.mueve();
        maya.mueve();
        ((Perro)maya).salta();
        }
    }

