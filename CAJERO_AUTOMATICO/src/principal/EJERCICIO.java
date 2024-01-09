package principal;

import java.util.Scanner;

public class EJERCICIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] usuarios = new String [3];
		usuarios[0]= "Carlos";
		usuarios[1]= "Sara";
		usuarios[2]= "Eva";
		String [] contraseñas = new String [3];
		contraseñas[0]= "Verano2001";
		contraseñas[1]= "Verano2002";
		contraseñas[2]= "Verano2003";
Scanner sc = new Scanner (System.in);

		System.out.print("USUARIO: ");
String usuario= sc.nextLine();
while (!usuario.equals(usuarios[0]) && !usuario.equals(usuarios[1]) && !usuario.equals(usuarios[2])){
	 System.out.println("Este usuario no existe en en este cajero, pruebe otra vez ");
	 usuario= sc.nextLine();
}
 
     System.out.print("CONTRASEÑA: ");
String contraseña = sc.nextLine();
while (!contraseña.equals(contraseñas[0]) && !contraseña.equals(contraseñas[1]) && !contraseña.equals(contraseñas[2])){
	 System.out.println("contraseña erronea, intentelo otra vez");
	 contraseña= sc.nextLine();
}



int operacion =0;
int dineroR =0;
int dineroC=0;
int dineroD=0;
System.out.println();
System.out.println("1. retirar dinero");
System.out.println("2. depositar dinero");
System.out.println("3. consultar saldo");
System.out.println("4. Cerrar cuenta");



while (usuario.equals(usuarios[0])) {
	System.out.println();
	System.out.print("desea OPERAR(opcion 1,2,3) o CERRAR CUENTA(4): ");
	operacion = sc.nextInt();
	dineroC = 1234000; 
	if (operacion==1) {
		System.out.print("Ingrese el dinero a retirar: ");
		 dineroR= sc.nextInt();
		 System.out.println("dinero retirado con exito");
	}else if (operacion ==2) {
		System.out.print("Ingrese dinero a depositar: ");
		dineroD = sc.nextInt();
		System.out.println("Dinero depositado con exito");
	}else if (operacion == 3) {
		System.out.println("El dinero que tienes en tu cuenta es de: "+dineroC+" euros");
	}else if (operacion ==4) {
		break;
	}else {
		System.out.println("Numero invalido, por favro indica si quieres operar o salir: ");
	}
} 
while (usuario.equals(usuarios[1])) {
	System.out.println();
	System.out.print("desea OPERAR(opcion 1,2,3) o CERRAR CUENTA(4): ");
	operacion = sc.nextInt();
	dineroC = 4000; 
	if (operacion==1) {
		System.out.print("Ingrese el dinero a retirar: ");
		 dineroR= sc.nextInt();
		 System.out.println("dinero retirado con exito");
	}else if (operacion ==2) {
		System.out.print("Ingrese dinero a depositar: ");
		dineroD = sc.nextInt();
		System.out.println("Dinero depositado con exito");
	}else if (operacion == 3) {
		System.out.println("El dinero que tienes en tu cuenta es de: "+dineroC+" euros");
	}else if (operacion ==4) {
		break;
	}
} 
while (usuario.equals(usuarios[2])) {
	System.out.println();
	System.out.print("desea OPERAR(opcion 1,2,3) o CERRAR CUENTA(4): ");
	operacion = sc.nextInt();
	dineroC = 34000; 
	if (operacion==1) {
		System.out.print("Ingrese el dinero a retirar: ");
		 dineroR= sc.nextInt();
		 System.out.println("dinero retirado con exito");
	}else if (operacion ==2) {
		System.out.print("Ingrese dinero a depositar: ");
		dineroD = sc.nextInt();
		System.out.println("Dinero depositado con exito");
	}else if (operacion == 3) {
		System.out.println("El dinero que tienes en tu cuenta es de: "+dineroC+" euros");
	}else if (operacion ==4) {
		break;
	}
}

	}

}
