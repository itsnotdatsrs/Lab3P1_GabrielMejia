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
        
        while (opcion>0 && opcion<4)
        switch (opcion){
            case 1 -> {
                //Comienzo de ejercicio 1
                int Inicial;
                int Diferencia;
                int Cantidad;
                int Sucesion;
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
                System.out.println("");
                System.out.println("Que numero desea ver mas adelante en la sucesion");
                Sucesion = scanner.nextInt();
                
                int Posicion = Actual + Diferencia * Sucesion;
                System.out.println(Posicion +"");
                
                break;
              }//Fin de Opcion 1
            
            case 2 -> { //Comienzo de Opcion 2
                System.out.println("elija su modo de pelea");
                System.out.println("1= a Muerte");
                System.out.println("2= por rondas");
                int opcion2 = scanner.nextInt();
                
                while(opcion2>0 && opcion2<2)
                switch (opcion2){ 
                        case 1:{//Case de Pelea a Muerte
                            System.out.println("Estadisticas de los pokemon");
                            System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                            System.out.println("Gyarados Vida:300 Ataque:50 Defensa: 10%");
                            System.out.println("Giratina Vida:300 Ataque:70 Defensa:25%");
                            System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                            System.out.println("");
                            System.out.println("1. Sylveon vs Dragonite");
                            System.out.println("2. Gyarados vs Giratina");
                            System.out.println("3. Dragonite vs Giratina");
                            System.out.println("4. Giratina vs Sylveon");
                            
                            int pelea = scanner.nextInt();
                            
                            switch(pelea){
                                case 1 ->  {//Case de Sylveon vs Dragonite
                                    int SylveonVida =280;
                                    int DragoniteVida =250;
                                    
                                    while (SylveonVida <0 && DragoniteVida<0){
                                    System.out.println("Ronda");
                                    System.out.println("Vida de Sylveon: "+SylveonVida);
                                    System.out.println("Vida de Dragonite: "+DragoniteVida);
                                    System.out.println("");
                                    System.out.println("Sylveon ha atacado!");
                                    System.out.println("Dragonite ha atacado!");
                                    System.out.println("");
                                    System.out.println("Vida de Sylveon: "+SylveonVida-75*0.15);
                                    System.out.println("Vida de Dragonite: " +DragoniteVida-80*0.2);
                                    System.out.println("");
                                    }
                                }//End de SylveonVDragonite
                                case 2 -> {
                            //Case de Gyarados vs Giratina
                            //Case de Gyarados vs Giratina
                                    
                                }//End de GyaradosVGiratina
                                case 3 -> {
                            //Case de Dragonite vs Giratina
                            //Case de Dragonite vs Giratina
                                    
                                } //End de DragoniteVGiratina
                                case 4 -> {
                            //Case de Giratina vs Sylveon
                            //Case de Giratina vs Sylveon
                                    
                                }//End de DragoniteVGiratina
                }
              } //Fin de Opcion 2
            
            case 3: { //Comienzo de Opcion 3
                
              } //Fin de Opcion 3
        }
                }
        }
    }
}