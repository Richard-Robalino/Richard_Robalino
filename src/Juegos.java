public class Juegos {
    String nombre;
    String tipo;

    public  Juegos(String nombre,String tipo)
    {
        this.nombre=nombre;
        this.tipo=tipo;
    }
    public void imprimir(){
        System.out.println("El nombre: "+nombre+" Tipo: "+tipo);
    }
}

class Local extends Juegos {
    int anio;

    public Local(String nombre, String tipo, int anio) {
        super(nombre, tipo);
        this.anio = anio;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Año: " + anio);
    }
}

class Online extends Juegos {
    int anio;
    String estado;

    public Online(String nombre, String tipo, int anio ,String estado) {
        super(nombre, tipo);
        this.anio = anio;
        this.estado=estado;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Año: " + anio + " Estado: "+estado);
    }
}








