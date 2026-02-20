public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        //p1
        p1.setNome("Pedro");
        p1.setSexo("M");
        System.out.println(p1.toString());


        //p2
        p2.setNome("Maria");
        p2.setIdade(23);
        p2.setCurso("Informática");
        System.out.println(p2.toString());


        //p3
        p3.setNome("Cláudio");
        p3.setSalario(2500.50);
        System.out.println(p3.toString());


        //p4
        p4.setNome("Fabiana");
        p4.setSexo("F");
        p4.setSetor("Estoque");
        System.out.println(p4.toString());
    }
}
