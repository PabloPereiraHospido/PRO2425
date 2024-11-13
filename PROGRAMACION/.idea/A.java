  Scanner scanner3 = new Scanner(System.in);
    System.out.print("¿Cuántos números desea introducir? ");
    int cantidadNumeros = scanner3.nextInt();
    double suma3 = 0;

    for (int i = 1; i <= cantidadNumeros; i++) {
        System.out.print("Ingrese el número " + i + ": ");
        double numero = scanner3.nextDouble();
        suma3 += numero;
    }

    double media3 = suma3 / cantidadNumeros;

    System.out.println("La media de los " + cantidadNumeros + " números es: " + media3);