public class prueba {
    public static void main(String[] args) {
        Juegos juegos1 =new Juegos("Ajedrez", "Estrategia");
        Local juegoLocal = new Local("LOL", "Acicion", 2024);
        Online online1=new Online("TFT", "Magia",2050,"Nuevo");
        juegos1.imprimir();
        juegoLocal.imprimir();
        online1.imprimir();
    }
}
