package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,10);
           
            
            //// IMPORTANTE LEER
            //// IMPORTANTE LEER          :::            EL TERRENO A SACAR AREA DEBE SER GENERADO DESDE 
            //// IMPORTANTE LEER          :::          LAS POSICIONES 1 A 15 TANTO VERTICAL COMO HORIZONTALMENTE
            //// IMPORTANTE LEER          :::                           GRACIAS  :)                                                  //hola profe :p
            //// IMPORTANTE LEER
            
          
            
          int tablero[][] = 
          {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},   //1
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},   
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},   
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},   
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},                                        
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},   
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};  //17
            
            
            
            
        boolean fin = true;
       boolean fin2 = true;
       
        int arriba = 20;
         int izquierda = 0;
          int derecha = 20;
           int abajo = 0;
        
      
         System.out.println("generando diagrama y resultado...");  
         
     //este while busca el primer bloque    
         
while (fin) {                         
 if(estudiante.getStreet()%2 == 0){
          
           
            for (int i = 0; i < 15; i++) {
              
            
                
            if(i==0){
            if(estudiante.frontIsClear() == false){fin = false;break;}
            estudiante.turnLeft();
            estudiante.move();}
            
            if(i>=1 && i<=13){
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            if(estudiante.frontIsClear() == false){fin = false;break;}
            estudiante.turnLeft();
            estudiante.move();}
            
            if(i==14){
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            if(estudiante.frontIsClear() == false){fin = false;break;}
            estudiante.move();}
                                       }
 }              
              
              
            
            
if(estudiante.getStreet()%2 == 1){
          
           
            for (int i = 0; i < 15; i++) {
                
              
                  
            if(i==0){
           if(estudiante.frontIsClear() == false){fin = false;break;}
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();}
             
            if(i>=1 && i<=13){
            estudiante.turnLeft();
            if(estudiante.frontIsClear() == false){fin = false;break;}
            estudiante.turnLeft();
            estudiante.turnLeft();          
            estudiante.turnLeft();
            estudiante.move();}
          
            
            if(i==14){
            estudiante.turnLeft();         
            if(estudiante.frontIsClear() == false){fin = false;break;}
            estudiante.move();}
                                       }
 }                          
}
 

estudiante.putThing();
            
// fin de busqueda de bloque

//reccorido figura

   while(fin2)
   {
           if(estudiante.frontIsClear() == false){            
            
        
            
            if(estudiante.getDirection()==Direction.SOUTH){
            tablero[estudiante.getStreet()+1][estudiante.getAvenue()] = 1;
            }
            
             if(estudiante.getDirection()==Direction.NORTH){
            tablero[estudiante.getStreet()-1][estudiante.getAvenue()] = 1;
            }
            
             
             if(estudiante.getDirection()==Direction.WEST){
            tablero[estudiante.getStreet()][estudiante.getAvenue()-1] = 1;
            }
            
             if(estudiante.getDirection()==Direction.EAST){
            tablero[estudiante.getStreet()][estudiante.getAvenue()+1] = 1;
            }
             

            
             estudiante.turnLeft();
            
           } 
           
         if(estudiante.frontIsClear() == true){            
           estudiante.move();
           estudiante.turnLeft();
           estudiante.turnLeft();
           estudiante.turnLeft();
           } 
         
        
    
        
         
         
         
         
         ///limites
         if(estudiante.getStreet()<arriba){arriba = estudiante.getStreet();}
         
         if(estudiante.getStreet()>abajo){abajo = estudiante.getStreet();}
         
         if(estudiante.getAvenue()<derecha){derecha = estudiante.getAvenue();}
         
         if(estudiante.getAvenue()>izquierda){izquierda = estudiante.getAvenue();}
         ///fin limites
         
           
         if(estudiante.canPickThing()==true){estudiante.pickThing(); fin2 = false;}   //final
         
         
         
         
         
           

   } 
                   
  int horizontal = izquierda-derecha-1;
  int vertical = abajo-arriba-1;
  
   
   
   
   
   
   
 //diagrama de doses (2) :v

   for (int i = 0; i < 17; i++) {
                
                tablero[i][derecha] = 2 ;
                tablero[i][izquierda] = 2 ;
                tablero[arriba][i] = 2 ;
                tablero[abajo][i] = 2;            
                                }
   //fin diagrama de doses :v
   
   //diagrama de poner treces
   
            for (int l = 0; l < 120; l++) {
                
            
   
            for (int i = 0; i < horizontal; i++) {
                
                for (int j = 0; j < vertical; j++) {
                    
                    
                  if (tablero [arriba+1+j][derecha+1+i] == 0 &&(
                          
                          
                          tablero [arriba+1+j+1][derecha+1+i] == 2   ||
                          tablero [arriba+1+j-1][derecha+1+i] == 2   ||
                          tablero [arriba+1+j][derecha+1+i+1] == 2   ||
                          tablero [arriba+1+j][derecha+1+i-1] == 2   ||
                          tablero [arriba+1+j+1][derecha+1+i] == 3   ||
                          tablero [arriba+1+j-1][derecha+1+i] == 3   ||
                          tablero [arriba+1+j][derecha+1+i+1] == 3   ||
                          tablero [arriba+1+j][derecha+1+i-1] == 3   
                          
                          
                          ))
                  
                         { tablero [arriba+1+j][derecha+1+i] = 3;    }
                   
                   
                }
                
                
            }
                
            }
   
   
   //fin de poner treces
   
   //desconteo de huecos
   
   int hueco = 0;
     
    for (int i = 0; i < 17; i++) {
                
                for (int j = 0; j < 17; j++) {
                  
                   if (tablero[i][j] == 3){hueco++;}
                    
                    
                }           
                
           }
   
   
   
   
   
   
   
   
   
   
       
   ///impresion de diagrama 
   
            for (int i = 0; i < 17; i++) {
                
                for (int j = 0; j < 17; j++) {
                  
                    System.out.print(tablero[i][j]);
                    
                    
                }           
                System.out.println("");
           }
   
   ///fin diagrama 
            
            System.out.println("");
            System.out.print("El lote tiene ");
            System.out.println((horizontal*vertical-hueco+" metros cuadrados"));
            
         
   
// derecha arriba
            


//avenua = vertical  street==horizontal                                                        
           
                                                                                                                              
                                                                                                                               
    }
          
            
          
           
            
            
}
        
        


