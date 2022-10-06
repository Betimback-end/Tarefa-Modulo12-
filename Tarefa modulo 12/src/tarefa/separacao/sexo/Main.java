package tarefa.separacao.sexo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            // Scanner para ler valores digitados pelo usuario
            Scanner ler = new Scanner(System.in);

            // Declarado uma variavel para informar quando o sexo for diferente de "masculino" e "feminino"
            boolean sexoIncorreto = false;

            // Declarando o ArrayList de Homens e Mulheres
            List<String> listaH = new ArrayList<String>();
            List<String> listaM = new ArrayList<String>();
            List<String> listaGeral = new ArrayList<String>();

            // Entrando com os dados
            System.out.println("Quantos nomes deseja cadastrar ? ");
            int quantidade = ler.nextInt();
            // Limpando o Buffer para não haver problemas para leitura de valores inteiros
            ler.nextLine();

            // Demonstrando como se deve cadastrar os nomes
            System.out.println("============= EX: DE CADASTRO =============");
            System.out.println(" Joao Victor da Silva-M ");
            System.out.println("            OU ");
            System.out.println(" Maria Clara-F");
            System.out.println(" ========================= ");
            System.out.println("");

            // Usado o laço de repetição para entrar com os dados de acordo com o numero de nomes a serem cadastrados
            for (int i = 0; i < quantidade; i ++){
                int I = i + 1;
                System.out.println(" Digite o nome "  + I +" e o Sexo separado por " + " '-' ");
                String nome = ler.nextLine();
                listaGeral.add(nome);

                // Usando o método "Split " para separar o nome do sexo, atribuindo na variavel "nome"
                String[] sexo = nome.split("-");

                // Fazendo a comparação do sexo digitado com a string
                if(sexo[1].contains("M")){
                    listaH.add(sexo[0]);
                    sexoIncorreto = true;
                }if(sexo[1].contains("F")){
                    listaM.add(sexo[0]);
                    sexoIncorreto = true;
                }
                // Verificando se o sexo digitado estar correto
            }if (sexoIncorreto == false){
                System.out.println("SEXO INCORRETO, RAFACA O CADASTRO !!!");
            }else {
                // Informa os Arrays separadamente
                System.out.println(" =====ARRAY-MASCULINO=====");
                Collections.sort(listaH);
                // Realizando a ordenação dos nomes masculino
                System.out.println(listaH);
                System.out.println(" ========================= ");
                System.out.println(" =====ARRAY-FEMININO=====");
                System.out.println(listaM);
                // Realizando a ordenação dos nomes femininos
                Collections.sort(listaM);
                System.out.println(" ========================= ");
            }
            System.out.println(" ===== Lista Geral=====");
            // Realizando a ordenação de todos nomes
            Collections.sort(listaGeral);
            System.out.println(listaGeral);

        }
    }

