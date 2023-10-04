public class Recursividad {
  /*
  * Se llama recursividad (o recursión) a un proceso mediante el que una
  * función se llama a sí misma de forma repetida, hasta que se satisface alguna determinada CONDICIÓN.
  *
  * Las claves para construir un proceso de recursividad son:
    Cada llamada recurrente se debería definir sobre un problema de
    menor complejidad (algo más fácil de resolver).

    Ha de existir al menos un CASO BASE para evitar que la recurrencia sea
    infinita.
  * */
  public static void main(String[] args) {

    System.out.println(factorial(3));

  }
  public static int factorial(int n){
    int result;
    if(n == 0){
      return 1;
    }
    result = n *  factorial(n-1);
    return result;
  }

  public static int suma(int n){
    //3
    int res;
    if (n==1){
      return 1;
    }
    res = n + suma(n-1); //.... 3 + 3 = 6
    // suma(2) --> 3
    // res = 2 + 1 ...
    // return res 3
    return res;
  }

  public static String invertir(String cadena){
    if(cadena.equals("")){
      return cadena;
    }
    return invertir(cadena.substring(cadena.length() - 1));
  }
}
