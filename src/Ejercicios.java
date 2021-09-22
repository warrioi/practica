public class Ejercicios {
    public static String invertirPalabra (String palabra, int longitud){
        if(longitud==0)
        {
            return palabra.charAt (longitud)+"";
        }
        else
        {
            return palabra.charAt (longitud) + (invertirPalabra(palabra, longitud-1));
        }
    }

}
