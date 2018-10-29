/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class Main {

    public static void main(String[] args) {

        Human a = new Human();
        a.setNama("Firman Ardhiansyah");
        a.walk(a.getNama());
        a.breath(a.getNama());
        a.eat(a.getNama());
    }

}
