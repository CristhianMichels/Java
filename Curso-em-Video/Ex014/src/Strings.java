public class Strings {
    public static void main(String[] args) {
        String nome1 = "Cristhian";
        String nome2 = "Cristhian";
        String nome3 = new String("Cristhian");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
}
