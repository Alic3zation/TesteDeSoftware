import java.util.Scanner;
public class boolean{
     public static void main(String[] args) {
        String genero = "M" , idade="18", genero , idade,Nome;
          System.out.printf("informe seu nome: ");
                Scanner Nome = new Scanner(System.in);
                   Nome = Nome.next(); 
                      System.out.printf("Informe seu Sexo: ");
                       Scanner gen = new Scanner(System.in);
                              genero = gen.next();
                                      System.out.printf("Informe sua idade: ");
                                          Scanner Idade = new Scanner(System.in);
                                            idade = Idade.next();
                                          if ((genero.equals(genero)) && (idade.equals(idade))) {
                                        System.out.printf(Nome+" True");
                                                   } else {
                                                    System.out.printf(Nome + " False");

                                                                         }
                         }
}