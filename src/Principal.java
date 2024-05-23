public class Principal {
    public static void main(String[] args) {
        Vivienda vivienda1=new Vivienda(1234,"Richard");
        Departamento departamento1=new Departamento(456,"Diego",14);
        Casa casa1=new Casa(987,"Carla",10,4,"Comite del Pueblo");
        vivienda1.imprimir();
        departamento1.imprimirde();
        departamento1.anuncio();
        casa1.imprimircasa();
        casa1.mesaje();

    }
}
