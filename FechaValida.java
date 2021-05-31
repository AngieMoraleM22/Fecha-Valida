public class FechaValida
{
   //entradas
   int dia;
   char mes;
   int año;
   //salidas
   boolean diaValido;
   boolean mesValido;
   boolean añoValido;
   boolean añoDivisiblePor4;
   boolean añoDivisiblePor100;
   boolean añoDivisiblePor400;
   boolean añoBisiestoValido;
   boolean fechaValida;
   
   void algoritmo()
   {
       añoValido = (año > 0);
                   
       añoDivisiblePor4 = ((año%4)== 0);
       añoDivisiblePor100 = ((año%100)!= 0);
       añoDivisiblePor400 = ((año%400)== 0);
       
       mesValido = (mes == 'E') || (mes == 'F') || (mes == 'M') || (mes == 'A') || (mes == 'M') || (mes == 'J') ||
                   (mes == 'L') || (mes == 'G') || (mes == 'S') || (mes == 'O') || (mes == 'N') || (mes == 'D');   
                   
       diaValido = ((mes == 'E') && (dia > 0) && (dia <= 31)) || 
       
                   ((mes == 'F') && (dia > 0) && (dia <= 28)) ||  
                   (((mes == 'F') && (dia > 0) && (dia <= 29)) && ((añoDivisiblePor4 == true) && (añoDivisiblePor100== true)) ||
                   ((añoDivisiblePor4 == true) && (añoDivisiblePor100== false) && (añoDivisiblePor400 == true))) ||                                                
                                                        
                   ((mes == 'M') && (dia > 0) && (dia <= 31))|| 
                   ((mes == 'A') && (dia > 0) && (dia <= 30))|| 
                   ((mes == 'M') && (dia > 0) && (dia <= 31))|| 
                   ((mes == 'J') && (dia > 0) && (dia <= 30))||
                   ((mes == 'L') && (dia > 0) && (dia <= 31))|| 
                   ((mes == 'G') && (dia > 0) && (dia <= 31))|| 
                   ((mes == 'S') && (dia > 0) && (dia <= 30))|| 
                   ((mes == 'O') && (dia > 0) && (dia <= 31))|| 
                   ((mes == 'N') && (dia > 0) && (dia <= 30))|| 
                   ((mes == 'D')&& (dia > 0) && (dia <= 31)); 
                   
            
                            
       fechaValida = (mesValido == true) && (diaValido==true)  && (añoValido==true);

    }
}
