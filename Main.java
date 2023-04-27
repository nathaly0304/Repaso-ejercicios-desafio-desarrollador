import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		String hash = "c48736a64d9772d7d3278581fcb5e48d";
		List<Integer> arreglo = Arrays.asList(10, 20, 30, 40, 50, 4);
		List<Integer> tmp = new ArrayList<>(); 
		List<Integer> tmp_1 = new ArrayList<>();
		List<String> lista_cadenas = new ArrayList<>();
		List<String> tmp_2 = new ArrayList<>(); 
		List<Integer> cuadrados = new ArrayList<>(); 

		determinaS(hash,tmp);
		Integer num = tmp.get(0);
		eliminaS(arreglo,tmp_1,num);
		conversorArregloCadena(lista_cadenas,tmp_1);
		eliminaCaracterS(lista_cadenas,tmp_2,num);
		ordenarArreglo(tmp_2);
		cuadrados=cuadrados(tmp_2);
		System.out.println(arreglo+" -> "+ tmp_2);  
		
		System.out.println("{\"array\":"+tmp_2+" -> "+cuadrados);

	}

	public static void determinaS(String codigoHash, List<Integer> listaVacia) {
		
		String[] codigo_hash =  codigoHash.split("");
		for(int i = 0; i < codigo_hash.length; i++){
			if(Character.isDigit(codigo_hash[i].charAt(0))){
				int valor = Integer.parseInt(codigo_hash[i]);
				listaVacia.add(valor);
			}
		}
	}

	public static void eliminaS(List<Integer> arreglo, List<Integer> listaVacia, int numero) {
		for(int i = 0; i < arreglo.size(); i++){
			if(arreglo.get(i) != numero){
				listaVacia.add(arreglo.get(i));
			}
		}
	}

	public static void conversorArregloCadena(List<String> arregloCadena, List<Integer> listaEntero) {
		for (int i = 0; i < listaEntero.size(); i++) {
			arregloCadena.add(String.valueOf(listaEntero.get(i)));
		}        
	}  

	public static void eliminaCaracterS(List<String> arregloCadena, List<String> cadenaVacia, int numero) {
		for(int i = 0; i < arregloCadena.size(); i++){
			String cadena_1 = arregloCadena.get(i);
			cadena_1 = cadena_1.replace(String.valueOf(numero), "");
			cadenaVacia.add(cadena_1);
		}      
	}

	public static void ordenarArreglo(List<String> numeros) {
		for (int i = 0; i < numeros.size() - 1; i++) {
			int indiceMinimo = i;
			for (int j = i + 1; j < numeros.size(); j++) {
				if (Integer.parseInt(numeros.get(j)) > Integer.parseInt(numeros.get(indiceMinimo))) {
					indiceMinimo = j;
				}
			}
			String temp = numeros.get(i);
			numeros.set(i, numeros.get(indiceMinimo));
			numeros.set(indiceMinimo, temp);
		}
	}
	public static List<Integer> cuadrados(List<String> tmp_2){
		List<Integer> cuadrados = new ArrayList<>();
		for (int i = 0; i < tmp_2.size(); i++) {
			int num = Integer.parseInt(tmp_2.get(i));
			int cuadrado = num * num;
			cuadrados.add(cuadrado);
		}
		return cuadrados;

	}
}
