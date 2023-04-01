import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
    static ArrayList<Double> listaNotas,listaNotasFinales;
    static ArrayList<String> listaEstudiantes;
    
	static int cantGanan=0;
	static int cantPierden=0;
	static int cantPuedenRecuperar=0;
	static int cantPierdenSinRecuperar=0;

	static double promedioNotasFinales=0;
	
	public static void Procesos1(double n1, double n2, double n3, String nombre) {
		listaNotas= new ArrayList<Double>();
		listaEstudiantes= new ArrayList<String>();
		listaNotasFinales= new ArrayList<Double>();
		iniciar(n1,n2,n3,nombre);
	}

	public static void iniciar(double n1, double n2, double n3, String nombre) {
		ingresarDatos(n1,n2,n3,nombre);
		imprimirListas();
		calcularDatos();
		imprimirResultados();
		imprimirEstudianteNota();
	}

	private static void imprimirEstudianteNota() {
		for (int i = 0; i < listaEstudiantes.size(); i++) {
			System.out.println(listaEstudiantes.get(i)+": "+listaNotasFinales.get(i));
			System.out.println("///////////////////////////////");
		}
	}

	private static void imprimirResultados() {
		System.out.println("Cantidad total de estudiantes: "+listaEstudiantes.size());
		System.out.println("Cantidad total de notas ingresadas: "+listaNotas.size());
		System.out.println("Cantidad estudiantes que ganan: "+cantGanan);
		System.out.println("Cantidad estudiantes que pierden: "+cantPierden);
		System.out.println("Cantidad estudiantes que pueden recuperar: "+cantPuedenRecuperar);
		System.out.println("Cantidad estudiantes que pierden sin recuperar: "+cantPierdenSinRecuperar);
		System.out.println("Promedio Notas Finales: "+promedioNotasFinales);
	}

	private static void ingresarDatos(double n1, double n2, double n3, String nombre) {
		listaEstudiantes.add(nombre);
		listaNotas.add(n1);
		listaNotas.add(n2);
		listaNotas.add(n3);
	}

	private static void calcularDatos() {
		double suma = 0;
		double prom = 0;
		
		for (int i = 0; i < listaNotas.size(); i+=3) {
			for (int j = i; j < (i+3); j++) {
				suma+=listaNotas.get(j);
			}
			System.out.println("");
			prom=suma/3;
			listaNotasFinales.add(prom);
			suma=0;
		}
		System.out.println(listaNotasFinales);
		
		for (int i = 0; i < listaNotasFinales.size(); i++) {
			if(listaNotasFinales.get(i)>=3.5) {
				cantGanan++;
			}else {
				cantPierden++;
				if(listaNotasFinales.get(i)>=2) {
					cantPuedenRecuperar++;
				}else {
					cantPierdenSinRecuperar++;
				}
			}
			
		}
		int sum = 0;
		for (int i = 0; i < listaNotasFinales.size(); i++) {
			sum+=listaNotasFinales.get(i);
		}
		promedioNotasFinales=sum/listaNotasFinales.size();
	}

	private static void imprimirListas() {
		System.out.println(listaEstudiantes);
		System.out.println(listaNotas);
	}	
}
