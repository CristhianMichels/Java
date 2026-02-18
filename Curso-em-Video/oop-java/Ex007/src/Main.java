public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Jurandir", 64, "M");
        p[1] = new Pessoa("Creusa", 19, "F");

        l[0] = new Livro("Aprendendo Java", "José da silva", 300, p[0]);
        l[1] = new Livro("Aprendendo JavaScript", "Da silva José", 600, p[1]);
        l[2] = new Livro("Java aprendeu Script", "Silva da José", 999, p[0]);

        l[0].abrir();
        l[0].folhar(5);
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
}
