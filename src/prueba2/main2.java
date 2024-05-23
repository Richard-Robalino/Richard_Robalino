package prueba2;

public class main2 {
    int edad;
    String nombre;
    String apellido;
    int anio;
    public main2(int edad,String nombre,String apellido,int anio)
    {
        this.edad=edad;
        this.nombre=nombre;
        this.apellido=apellido;
        this.anio=anio;
    }
    public void imprimir(){
        System.out.println("El nombre: "+nombre+" Apellido: "+apellido+edad+anio);
    }
}
