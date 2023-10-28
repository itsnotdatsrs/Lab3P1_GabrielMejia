/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_gabrielernesto;

import java.util.Scanner;

public class LAB3P1_GabrielErnesto {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
        System.out.println("Menu Principal");
        System.out.println("1= Ejercicio 1");
        System.out.println("2= Ejercicio 2");
        System.out.println("3= Ejercicio 3");
        System.out.println("Ingrese uno de las opciones");
        int opcion;
        opcion = scanner.nextInt();
        
        switch (opcion){
            case 1 -> {
                //Comienzo de ejercicio 1
                int Inicial;
                int Diferencia;
                int Cantidad;
                System.out.println("Numero Inicial:");
                Inicial = scanner.nextInt();
                System.out.println("Diferencia:");
                Diferencia = scanner.nextInt();
                System.out.println("Cantidad de numeros:");
                Cantidad = scanner.nextInt();
                
                int Actual = Inicial;
                
                for(int i = 0; i < Cantidad; i++){
                    System.out.print(Actual +"");
                    if(i < Cantidad - 1){
                        System.out.print(", ");
                    }
                    Actual += Diferencia;
                } 
                System.out.print("Posicion en sucesion: ");
                int posicion = scanner.nextInt();

                if (posicion > 0 && posicion <= Cantidad) {
                    int NumeroEnPosicion = Inicial + (posicion - 1) * Diferencia;
                    System.out.println("El numero en la sucesion " + posicion + " es: " + NumeroEnPosicion);
                } else {
                    System.out.println("La posicion no es valida");
                }
              }//Fin de Opcion 1
            
            case 2 -> { //Comienzo de Opcion 2
                System.out.println("elija su modo de pelea");
                System.out.println("1= a Muerte");
                System.out.println("2= por rondas");
                int opcion2 = scanner.nextInt();
                
                switch (opcion2){ 
                        case 1 -> {//Case de Pelea a Muerte
                            System.out.println("Estadisticas de los pokemon");
                            System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                                    int SylveonVida = 280;
                                    int SylveonAtaque = 80;
                                    double SylveonDefensa = 0.15;
                            System.out.println("Gyarados Vida:300 Ataque:50 Defensa: 10%");
                                    int GyaradosVida = 300;
                                    int GyaradosAtaque = 80;
                                    double GyaradosDefensa = 0.15;
                            System.out.println("Giratina Vida:300 Ataque:70 Defensa:25%");
                                    int GiratinaVida = 300;
                                    int GiratinaAtaque = 70;
                                    double GiratinaDefensa = 0.25;
                            System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                                    int DragoniteVida = 250;
                                    int DragoniteAtaque = 75;
                                    double DragoniteDefensa = 0.20;
                            System.out.println("");
                            System.out.println("1. Sylveon vs Dragonite");
                            System.out.println("2. Gyarados vs Giratina");
                            System.out.println("3. Dragonite vs Giratina");
                            System.out.println("4. Giratina vs Sylveon");
                            
                            int pelea = scanner.nextInt();
                            
                            switch(pelea){
                                case 1 ->  {//Case de Sylveon vs Dragonite
                                    int round = 1;
                                    while (SylveonVida > 0 && DragoniteVida > 0) {
                                        System.out.println("Round " + round);
                                        
                                        System.out.println("Vida de Pokemon 1: "+SylveonVida);
                                        System.out.println("Vida de Pokemon 2: "+DragoniteVida);
                                        int damage1Dealt = (int) (SylveonAtaque * (1 - DragoniteDefensa));
                                        DragoniteVida -= damage1Dealt;
                                        int damage2Dealt = (int) (DragoniteAtaque * (1 - SylveonDefensa));
                                        SylveonVida -= damage2Dealt;
                                        System.out.println("");
                                        System.out.println("Pokemon 1 ha atacado! ");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        System.out.println("");
                                        System.out.println("Vida de Pokemon 1: "+SylveonVida);
                                        System.out.println("Vida de Pokemon 2: "+DragoniteVida);
                                        System.out.println("");

                                        round++;
                                    }

                                    if (SylveonVida <= 0) {
                                        System.out.println("Dragonite gana! Sylveon llego a cero.");
                                    } else {
                                        System.out.println("Sylveon gana! Dragonite llego a 0.");
                                    }
                                    break;
                                }//End de SylveonVDragonite
                                case 2 -> {
                            //Case de Gyarados vs Giratina
                            int round = 1;
                                    while (GyaradosVida > 0 && GiratinaVida > 0) {
                                        System.out.println("Round " + round);
                                        
                                        System.out.println("Vida de Pokemon 1: "+GyaradosVida);
                                        System.out.println("Vida de Pokemon 2: "+GiratinaVida);
                                        int damage1Dealt = (int) (GiratinaAtaque * (1 - GyaradosDefensa));
                                        GyaradosVida -= damage1Dealt;
                                        int damage2Dealt = (int) (GyaradosAtaque * (1 - GiratinaDefensa));
                                        GiratinaVida -= damage2Dealt;
                                        System.out.println("");
                                        System.out.println("Pokemon 1 ha atacado! ");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        System.out.println("");
                                        System.out.println("Vida de Pokemon 1: "+GiratinaVida);
                                        System.out.println("Vida de Pokemon 2: "+GyaradosVida);
                                        System.out.println("");

                                        round++;
                                    }

                                    if (GyaradosVida <= 0) {
                                        System.out.println("Gyarados gana! Giratina llego a cero.");
                                    } else {
                                        System.out.println("Giratina gana! Gyarados llego a 0.");
                                    }
                                    break;
                                    
                                }//End de GyaradosVGiratina
                                case 3 -> {
                            //Case de Dragonite vs Giratina
                                    int round = 1;
                                    while (DragoniteVida > 0 && GiratinaVida > 0) {
                                        System.out.println("Round " + round);
                                        
                                        System.out.println("Vida de Pokemon 1: "+DragoniteVida);
                                        System.out.println("Vida de Pokemon 2: "+GiratinaVida);
                                        int damage1Dealt = (int) (GiratinaAtaque * (1 - DragoniteDefensa));
                                        DragoniteVida -= damage1Dealt;
                                        int damage2Dealt = (int) (DragoniteAtaque * (1 - GiratinaDefensa));
                                        GiratinaVida -= damage2Dealt;
                                        System.out.println("");
                                        System.out.println("Pokemon 1 ha atacado! ");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        System.out.println("");
                                        System.out.println("Vida de Pokemon 1: "+GiratinaVida);
                                        System.out.println("Vida de Pokemon 2: "+DragoniteVida);
                                        System.out.println("");

                                        round++;
                                    }

                                    if (GyaradosVida <= 0) {
                                        System.out.println("Dragonite gana! Giratina llego a cero.");
                                    } else {
                                        System.out.println("Giratina gana! Dragonite llego a 0.");
                                    }
                                    break;
                                } //End de DragoniteVGiratina
                                case 4 -> {
                            //Case de Giratina vs Sylveon
                                    int round = 1;
                                    while (GiratinaVida > 0 && SylveonVida > 0) {
                                        System.out.println("Round " + round);
                                        
                                        System.out.println("Vida de Pokemon 1: "+GiratinaVida);
                                        System.out.println("Vida de Pokemon 2: "+SylveonVida);
                                        int damage1Dealt = (int) (SylveonAtaque * (1 - GiratinaDefensa));
                                        GiratinaVida -= damage1Dealt;
                                        int damage2Dealt = (int) (GiratinaAtaque * (1 - SylveonDefensa));
                                        SylveonVida -= damage2Dealt;
                                        System.out.println("");
                                        System.out.println("Pokemon 1 ha atacado! ");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        System.out.println("");
                                        System.out.println("Vida de Pokemon 1: "+SylveonVida);
                                        System.out.println("Vida de Pokemon 2: "+GiratinaVida);
                                        System.out.println("");

                                        round++;
                                    }

                                    if (GyaradosVida <= 0) {
                                        System.out.println("Giratina gana! Sylveon llego a cero.");
                                    } else {
                                        System.out.println("Sylveon gana! Giratina llego a 0.");
                                    }
                                    break;
                                }//End de SylveonVGiratina
                            }
                        }
                        case 2 -> {
                            System.out.println("Estadisticas de los pokemon");
                            System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                                    int SylveonVida = 280;
                                    int SylveonAtaque = 80;
                                    double SylveonDefensa = 0.15;
                            System.out.println("Gyarados Vida:300 Ataque:50 Defensa: 10%");
                                    int GyaradosVida = 300;
                                    int GyaradosAtaque = 80;
                                    double GyaradosDefensa = 0.15;
                            System.out.println("Giratina Vida:300 Ataque:70 Defensa:25%");
                                    int GiratinaVida = 300;
                                    int GiratinaAtaque = 70;
                                    double GiratinaDefensa = 0.25;
                            System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                                    int DragoniteVida = 250;
                                    int DragoniteAtaque = 75;
                                    double DragoniteDefensa = 0.20;
                            System.out.println("");
                            System.out.println("1. Sylveon vs Dragonite");
                            System.out.println("2. Gyarados vs Giratina");
                            System.out.println("3. Dragonite vs Giratina");
                            System.out.println("4. Giratina vs Sylveon");
                            
                            int pelea = scanner.nextInt();
                            
                            switch(pelea){
                                case 1 ->  {//Case de Sylveon vs Dragonite
                                    int round = 1;
                                    while (SylveonVida > 0 && DragoniteVida > 0) {
                                        System.out.println("Round " + round);
                                        
                                        System.out.println("Vida de Pokemon 1: "+SylveonVida);
                                        System.out.println("Vida de Pokemon 2: "+DragoniteVida);
                                        int damage1Dealt = (int) (SylveonAtaque * (1 - DragoniteDefensa));
                                        DragoniteVida -= damage1Dealt;
                                        int damage2Dealt = (int) (DragoniteAtaque * (1 - SylveonDefensa));
                                        SylveonVida -= damage2Dealt;
                                        System.out.println("");
                                        System.out.println("Pokemon 1 ha atacado! ");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        System.out.println("");
                                        System.out.println("Vida de Pokemon 1: "+SylveonVida);
                                        System.out.println("Vida de Pokemon 2: "+DragoniteVida);
                                        System.out.println("");

                                        round++;
                                    }

                                    if (SylveonVida <= 0) {
                                        System.out.println("Dragonite gana! Sylveon llego a cero.");
                                    } else {
                                        System.out.println("Sylveon gana! Dragonite llego a 0.");
                                    }
                                    break;
                                }//End de SylveonVDragonite
                                case 2 -> {
                            //Case de Gyarados vs Giratina
                            int round = 1;
                                    while (GyaradosVida > 0 && GiratinaVida > 0) {
                                        System.out.println("Round " + round);
                                        
                                        System.out.println("Vida de Pokemon 1: "+GyaradosVida);
                                        System.out.println("Vida de Pokemon 2: "+GiratinaVida);
                                        int damage1Dealt = (int) (GiratinaAtaque * (1 - GyaradosDefensa));
                                        GyaradosVida -= damage1Dealt;
                                        int damage2Dealt = (int) (GyaradosAtaque * (1 - GiratinaDefensa));
                                        GiratinaVida -= damage2Dealt;
                                        System.out.println("");
                                        System.out.println("Pokemon 1 ha atacado! ");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        System.out.println("");
                                        System.out.println("Vida de Pokemon 1: "+GiratinaVida);
                                        System.out.println("Vida de Pokemon 2: "+GyaradosVida);
                                        System.out.println("");

                                        round++;
                                    }

                                    if (GyaradosVida <= 0) {
                                        System.out.println("Gyarados gana! Giratina llego a cero.");
                                    } else {
                                        System.out.println("Giratina gana! Gyarados llego a 0.");
                                    }
                                    break;
                                    
                                }//End de GyaradosVGiratina
                                case 3 -> {
                            //Case de Dragonite vs Giratina
                                    int round = 1;
                                    while (DragoniteVida > 0 && GiratinaVida > 0) {
                                        System.out.println("Round " + round);
                                        
                                        System.out.println("Vida de Pokemon 1: "+DragoniteVida);
                                        System.out.println("Vida de Pokemon 2: "+GiratinaVida);
                                        int damage1Dealt = (int) (GiratinaAtaque * (1 - DragoniteDefensa));
                                        DragoniteVida -= damage1Dealt;
                                        int damage2Dealt = (int) (DragoniteAtaque * (1 - GiratinaDefensa));
                                        GiratinaVida -= damage2Dealt;
                                        System.out.println("");
                                        System.out.println("Pokemon 1 ha atacado! ");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        System.out.println("");
                                        System.out.println("Vida de Pokemon 1: "+GiratinaVida);
                                        System.out.println("Vida de Pokemon 2: "+DragoniteVida);
                                        System.out.println("");

                                        round++;
                                    }

                                    if (GyaradosVida <= 0) {
                                        System.out.println("Dragonite gana! Giratina llego a cero.");
                                    } else {
                                        System.out.println("Giratina gana! Dragonite llego a 0.");
                                    }
                                    break;
                                } //End de DragoniteVGiratina
                                case 4 -> {
                            //Case de Giratina vs Sylveon
                                    int round = 1;
                                    while (GiratinaVida > 0 && SylveonVida > 0) {
                                        System.out.println("Round " + round);
                                        
                                        System.out.println("Vida de Pokemon 1: "+GiratinaVida);
                                        System.out.println("Vida de Pokemon 2: "+SylveonVida);
                                        int damage1Dealt = (int) (SylveonAtaque * (1 - GiratinaDefensa));
                                        GiratinaVida -= damage1Dealt;
                                        int damage2Dealt = (int) (GiratinaAtaque * (1 - SylveonDefensa));
                                        SylveonVida -= damage2Dealt;
                                        System.out.println("");
                                        System.out.println("Pokemon 1 ha atacado! ");
                                        System.out.println("Pokemon 2 ha atacado!");
                                        System.out.println("");
                                        System.out.println("Vida de Pokemon 1: "+SylveonVida);
                                        System.out.println("Vida de Pokemon 2: "+GiratinaVida);
                                        System.out.println("");

                                        round++;
                                    }

                                    if (GyaradosVida <= 0) {
                                        System.out.println("Giratina gana! Sylveon llego a cero.");
                                    } else {
                                        System.out.println("Sylveon gana! Giratina llego a 0.");
                                    }
                                    break;
                                }//End de SylveonVGiratina
                            }
                }
                }
              } //Fin de Opcion 2
            case 3 -> { //Comienzo de Opcion 3
                int num = 0;
                while (true) {
                    System.out.print("numero impar y mayor a 7: ");
                    num = scanner.nextInt();
                    if (num % 2 == 1 && num > 7) {
                        break;
                    } else {
                        System.out.println("numero debe ser impar y mayor a 7");
                    }
                }
                for (int i = 1; i <= num; i++) {
                    for (int j = 1; j <= num; j++) {
                        if (i == 1 || i == num || j == 1 || j == num) {
                            System.out.print("* ");
                        } else if (i == j || i + j == num + 1) {
                            System.out.print("> ");
                        } else if (j == num / 2 + 1) {
                            System.out.print("| ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
              }
          }//Fin de Opcion 3
       }//Fin de MEnu
    }//Fin de Main
}//Fin