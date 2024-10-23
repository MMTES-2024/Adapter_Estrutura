/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.adapterestrutura;

/**
 *
 * @author rafaelamoreira
 */
public class Adapter implements Client {

    private Service service;

    public Adapter(Service adaptee) {
        this.service = adaptee;
    }

    @Override
    public void request(String data) {
        service.specificRequest(data);
    }

}
