import java.util.Scanner;

class Main {
 
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    Func fc = new Func();
    String s;
    int n,op;
    System.out.print("Questão: ");
    op = ent.nextInt();

    switch (op) {
      case 1:
        //questão 01
        System.out.print("Valor: ");
        n = ent.nextInt();
        fc.atvdd1(n);
        break;
      case 2:
        //questão 02
        System.out.print("Senha: ");
        s = ent.next();
        System.out.println(fc.atvdd2(s));
        break;
      case 3:
        //questão 3
        System.out.print("String: ");
        s = ent.next();
        System.out.println(fc.atvdd3(s));
        break;
      default:
        System.out.println("Invalido");
    } 
  } 
}
