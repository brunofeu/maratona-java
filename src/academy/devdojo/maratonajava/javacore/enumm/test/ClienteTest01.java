package academy.devdojo.maratonajava.javacore.enumm.test;

import academy.devdojo.maratonajava.javacore.enumm.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.enumm.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
