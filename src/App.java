import java.time.LocalDate;

import desafio_dominio.Bootcamp;
import desafio_dominio.Curso;
import desafio_dominio.Dev;
import desafio_dominio.Mentoria;

public class App {
    public static void main(String[] args)  {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao do curso java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("descricao do curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWictor = new Dev();
        devWictor.setNome("Wictor Rafael");
        devWictor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Wictor: " + devWictor.getConteudosInscritos());
        devWictor.progredir();
        System.out.println("Conteudos inscritos de Wictor: " + devWictor.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Wictor: " + devWictor.getConteudosConcluidos());
        System.out.println("XP : " + devWictor.calcularTotalXP());

        System.out.println("----------");

        Dev devRaissa = new Dev();
        devRaissa.setNome("Raissa Alves");
        devRaissa.inscreverBootcamp(bootcamp);
        devRaissa.progredir();
        devRaissa.progredir();
        devRaissa.progredir();
        System.out.println("Conteudos inscritos de Raissa: " + devRaissa.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Raissa: " + devRaissa.getConteudosConcluidos());
        System.out.println("XP : " + devRaissa.calcularTotalXP());




    }
}
