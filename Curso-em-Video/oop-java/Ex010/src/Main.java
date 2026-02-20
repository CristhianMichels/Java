import Especies.aves.Arara;
import Especies.aves.Ave;
import Especies.mamiferos.Cachorro;
import Especies.mamiferos.Canguru;
import Especies.mamiferos.Mamifero;
import Especies.peixes.Peixe;
import Especies.peixes.PeixeDourado;
import Especies.repteis.Cobra;
import Especies.repteis.Reptil;
import Especies.repteis.Tartaruga;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Ave a = new Ave();
        Peixe p = new Peixe();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        PeixeDourado g = new PeixeDourado();
        Arara e = new Arara();

        c.locomover();
        c.emitirSom();
        k.locomover();
        k.emitirSom();


    }
}
