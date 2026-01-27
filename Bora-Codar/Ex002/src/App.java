public class App {
    public static void main(String[] args) throws Exception {
        
        //byte (8 bits) intervalo -128 a 127
        byte numeroByte = -123;

        //short (16 bits) intervalo -32.768 a 32.767
        short numeoShort = 32767;

        //int (32 bits) intervalo -2.147.483.648 a 2.147.483.647
        int numeroInt = 2000000000;

        //long (64 bits) intervalo: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.867
        long numeroLong = 30000000000L;

        //float (32bits) intervalo: 6 a 7 casas decimais
        float numeroFloat = 30.0000009f;

        //double (64 bits) intervalo: 15 casas decimais
        double numeroDouble = 300.54542423342454545;

        //char (16 bits) 'A' '@' '2' -> armazena um caractere
        char exampleChar = '@';

        //boolean (1 bit) true ou false
        boolean exampleBoolean = true;

        // String, int, double, boolean (mais vai usar)
        System.out.println(numeroLong);
    }
}
