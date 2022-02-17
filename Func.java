import java.util.Arrays;
import java.util.HashMap;

public class Func{
  //01
  public void atvdd1(int n){
    int i,j,k;

    for(i=0;i<=n;i++){//loops de print
      for(j=n;j>i;j--){
        System.out.print(" ");
      }
      for(k=1;k<=i;k++){
        System.out.print("*");
      }
      System.out.println("");//quebra de linha
    }
  }

  //02
  public int atvdd2(String senha){
    int cont=4;int sobra=0;
    boolean min=false,mai=false,num=false,esp=false;
    int size = senha.length();
    String rule = "!@#$%^&*()-+";

    //procura das ocorrências nesesárias e decrementa do contador
    for(int i=0;i<senha.length();i++){
      char aux = senha.charAt(i);
      if(aux>='a' && aux<='z' && min==false){
          cont--;
          min = true;
      }
      if(aux>='A' && aux<='Z' && mai==false){
          cont--;
          mai = true;
      }
      if(aux>='0' && aux<='9' && num==false){
          cont--;
          num = true;
      }
      if(rule.indexOf(aux)>= 0 && esp==false ){
          cont--;
          esp = true;
      }
    }//retorno do numero que falta
    if(size+cont>=6){
      return cont;
    }else{
      sobra = size+cont;
      return cont + 6-sobra;
    }
  }

  //03
  public int atvdd3(String s){
        HashMap<String,Integer> map= new HashMap<>();
        int i,j,size = s.length();
        
        //avalia a string e vai contando os anagramas, de mesma posição no map
        for(i=0;i<size;i++){
            for(j=i;j<size;j++){
                char[] sub = s.substring(i,j+1).toCharArray();
                Arrays.sort(sub);
                //subdivide e ordena para análise
                String aux = new String(sub);
                if (map.containsKey(aux)) 
                    map.put(aux,map.get(aux)+1);
                else 
                    map.put(aux,1);
            }
        }
        int cont=0;
        for(String chave: map.keySet()){//retorno do valor de ocorrencias com base nos valores
            int v = map.get(chave);
            cont += (v*(v-1))/2;
        }
        return cont;
    }
    
}