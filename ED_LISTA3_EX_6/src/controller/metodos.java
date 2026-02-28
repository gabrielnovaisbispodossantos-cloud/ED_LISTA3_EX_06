package controller;

public class metodos {
 public metodos () {
	 super ();
 }
 public double fatorial(int n)
 {
  if(n == 1)
   return 1;

  return n * fatorial(n - 1);
 }

 public double somatoria(int n)
 {
  // Condição de parada:
  // Quando n = 1
  if(n == 1)
  {
   return 1;
  }

  // Relação de chamada:
  // termo atual + somatória anterior
  return (1.0 / fatorial(n)) + somatoria(n - 1);
 
 }
}
