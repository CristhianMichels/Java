public class Main {
    public static void main(String[] args) {
        //---Visitante---
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        System.out.println();

        //-----Aluno-----
        Aluno a1 = new Aluno();
        a1.setNome("Jurandir");
        a1.setIdade(15);
        a1.setSexo("M");
        a1.setMatricula(111111);
        a1.setCurso("Multimídia");
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        System.out.println();

        //----Bolsista----
        Bolsista b1 = new Bolsista();
        b1.setNome("Juliano");
        b1.setIdade(17);
        b1.setSexo("M");
        b1.setMatricula(222222);
        b1.setCurso("Administração");
        b1.setBolsa(50f);
        System.out.println(b1.toString());
        b1.pagarMensalidade();

        System.out.println();


    }
}
