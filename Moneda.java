public class Moneda {
	public static void main (String[] args){
		final double EUROS_A_DOLARES = 1.16;
		final double DOLARES_A_EUROS = 0.86;
		
		double monedaACambiar1 = 7.5;
		double monedaACambiar2 = 117.5;
		double monedaACambiar3 = 677.4;
		
		/*double dolares1 = monedaACambiar1 * EUROS_A_DOLARES;
		double dolares2 = monedaACambiar2 * EUROS_A_DOLARES;
		double dolares3 = monedaACambiar3 * EUROS_A_DOLARES;
		double euros1 = monedaACambiar1 * DOLARES_A_EUROS;
		double euros2 = monedaACambiar2 * DOLARES_A_EUROS;
		double euros3 = monedaACambiar3 * DOLARES_A_EUROS;*/
		
		
		System.out.println (monedaACambiar1 + "$: " + euros1 + "E");
		System.out.println (monedaACambiar1 + "E: " + dolares1 + "$");
	}
	
	public static void convertirEurosADolares (double euros){
		
		double dolares = euros * DOLARES_A_EUROS;
		System.out.println (euros + "E: " + dolares + "$");
		
	}
}
