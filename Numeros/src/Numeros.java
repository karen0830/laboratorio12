import javax.swing.JOptionPane;

class Numeros {
	int numer;//entero llamado nuummero
	int i, neg = 0, par = 0;//enteros
	
	public void entrada() {//metodo de entrada
		for (i = 0; i < 5; i++) {//ciclo empezando de 0 a 5
			numer = ingresarDatos("digite 1 numero");//ingresar numero con el metodo ingresar datos
			if(numer%2 == 0) {//condicional parasaber si es parr
				par++;//suma a la variable par
			}
			System.out.println(par);
			if(numer < 0) {//condiciona parasaber si hay negativos
				neg++;//suma a la varriable negativos
			}
		}
		JOptionPane.showMessageDialog(null, "El numero de numeros pares es : " + par + "\n" + 
				" y el numero de los numero negativos es: " + neg);
	}
	
	public static int ingresarDatos(String mensaje) {
		String cadena;
		int valor;
		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor = Integer.parseInt(cadena);
		return valor;
	}
	
}
