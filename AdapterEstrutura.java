/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.adapterestrutura;

/**
 *
 * @author rafaelamoreira
 */
public class AdapterEstrutura {

    public static void main(String[] args) {
        Service service = new Service();
        Client adapter = new Adapter(service);

        String data = "Dado enviado pelo cliente";
        adapter.request(data);
    }
}
