package ed.pau;

/** Descripción de la clase
 * Esta clase sirve para poder realizar calculos matematicos
 * Gracias a esta clase podemos sumar dos variables, restar, multiplicar y dividir,
 	podemos llamarla desde la clase main y pasarle dos parametros para que haga el calculo
 @Author Pau Florencio
 @Version 2.5
 @Disponible 1.9, juny 2019
 */


public class Calculadora {

	/** SUMA
	 * Este metodo suma dos numeros
	 * @param a primer sumando
	 * @param b segundo sumando
	 * @return devuelve el resultado de la suma
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/** RESTA
	 * Este metodo resta dos numeros
	 * @param a primer numero a restar
	 * @param b segundo numero a resta
	 * @return devuelve el resultado de la resta
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/** MULTIPLICACIÓN
	 * Este metodo multiplica dos numeros
	 * @param a primer multiplicando
	 * @param b segundo multiplicador
	 * @return devuelve el resultado de la multiplicacion
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/** DIVIDIR
	 * Este metodo duivide dos numeros
	 * @param a primer dividendo
	 * @param b segundo divisor
	 * @return devuelve el resultado de la division
	 * @Exception Si dividimos entre 0, nos saldrá error
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

	/**
	 * Calculo para saber la multiplicación de 2 numeros.
	 * @param multiplicando
	 * @param numMax
	 * @return resultado de la multiplicación
	 */
	public int calculo1(int multiplicando , int numMax ){

		int num = 1;

		for ( int i = 0; i < numMax ; i++ ){
			num = num * multiplicando;
		}

		return num;

	}

	/**
	 * Saber si el resultado es igual a 0
	 * @param dividendo
	 * @return true o false
	 */
	public boolean calculo2(int dividendo ){

		boolean resultado;

		if ( dividendo % 2 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;

	}

	/**
	 * Hace calculos hasta que el numero sea mayor que 0
	 * @param num
	 * @return el resultado del calculo
	 */
	public String calculo3(int num){

		String resultString = "";
		int numeroRes = num;
		int sumando;

		while ( numeroRes > 0) {

			sumando = numeroRes % 2;

			resultString = sumando + resultString;

			numeroRes = numeroRes / 2;

		}
		return resultString;
	}
}
