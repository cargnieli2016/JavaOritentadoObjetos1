package Heranca;

public class Main {
    public static void main(String[] args) {

        Professor jose = new Professor();
        jose.nome = "José";
        jose.idade = 53;
        jose.materia = "Português";

        System.out.println("==========Professor============");

        System.out.println("Professor: " + jose.nome);
        System.out.println("Materia: " + jose.materia);
        System.out.println("Idade: " + jose.idade);


        System.out.println("");
        System.out.println("==========Aluno===========");


        Aluno marcos = new Aluno();
        marcos.matricula = "ST550";
        marcos.nome = "Marcos";
        marcos.idade = 47;

        System.out.println("Aluno: " + marcos.nome);
        System.out.println("Matrícula: " + marcos.matricula);
        System.out.println("Idade: " + marcos.idade);

    }
}
