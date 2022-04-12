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
	
}
