public class Vivienda {
   int numero;
   String propietrario;

   public  Vivienda(int numero,String propietrario)
   {
      this.numero=numero;
      this.propietrario=propietrario;
   }
   public void imprimir(){
      System.out.println("Numero: "+numero+" Propietario: "+propietrario);
   }
}

class Departamento extends Vivienda{
   int piso;

   public Departamento(int numero,String propietrario,int piso)
   {
      super(numero,propietrario);
      this.piso=piso;
   }
   public void imprimirde(){
      System.out.println("Numero: "+numero+" Propietario: "+propietrario+" Piso: "+piso);
   }
   public void anuncio(){
      System.out.println("Departamento Arrendado");
   }
}

class Casa extends Vivienda {
   int piso;
   int numero_habitaciones;
   String ubicacion;


   public Casa(int numero, String propietrario, int piso, int numero_habitaciones, String ubicacion) {
      super(numero, propietrario);
      this.piso = piso;
      this.numero_habitaciones = numero_habitaciones;
      this.ubicacion = ubicacion;

   }

   public void imprimircasa() {
      System.out.println("Numero: " + numero + " Propietario: " + propietrario + " Piso: " + piso +" Numero de Habitacion: "+numero_habitaciones+" Ubicacion: "+ubicacion);
   }

   public void mesaje() {
      System.out.println("Departamento Arrendado");
   }
}