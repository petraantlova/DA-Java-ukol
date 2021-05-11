package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    Turtle zofka;

    public void main(String[] args) {
        zofka = new Turtle();

        nakresliZmrzlinu();
        nakresliSnehulaka();
        nakresliMasinku();

    }

    public void nakresliZmrzlinu() {
        zofka.setLocation(185, 120);
        Color barvaKornoutku = new Color(255, 236, 139);
        zofka.setPenColor(barvaKornoutku);
        nakresliRovnoramennyTrojuhelnik();

        zofka.setLocation(200, 100);
        Color barvaKopecku = new Color(255, 62, 150);
        zofka.setPenColor(barvaKopecku);
        nakresliKruh(1);
    }

    public void nakresliKruh(double polomer) {
        zofka.turnLeft(1);
        for (int i = 0; i < 360; i++) {
            zofka.move(polomer);
            zofka.turnLeft(1);
        }
    }

    public void nakresliRovnoramennyTrojuhelnik() {
        zofka.turnLeft(93);
        zofka.move(80);
        zofka.turnLeft(109.0);
        zofka.move(125);
        zofka.turnLeft(141.0);
        zofka.move(125);
    }

    public void nakresliSnehulaka() {
        Color barvaSnehulaka = new Color(0, 245, 255);
        zofka.setPenColor(barvaSnehulaka);
        zofka.setLocation(385, 170);
        nakresliKruh(0.7);
        zofka.setLocation(400, 270);
        nakresliKruh(1);
        zofka.setLocation(425, 415);
        nakresliKruh(1.5);
        zofka.setLocation(280, 270);
        nakresliKruh(0.4);
        zofka.setLocation(450, 270);
        nakresliKruh(0.4);
    }

    public void nakresliMasinku() {
        zofka.turnLeft(11);
        nakresliObdelnik();
        zofka.turnRight(90);
        nakresliObdelnik();
        zofka.turnRight(90);
        Color barvaKol = new Color(0, 0, 0);
        zofka.setPenColor(barvaKol);
        nakresliKruh(1);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(60);
        zofka.penDown();
        nakresliKruh(0.5);
        zofka.penUp();
        zofka.move(80);
        zofka.penDown();
        nakresliKruh(0.5);
        zofka.penUp();
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.penDown();
        nakresliJinyRovnoramennyTrojuhelnik();
    }

    public void nakresliObdelnik() {
        Color barvaVlaku = new Color(0, 0, 255);
        zofka.setPenColor(barvaVlaku);
        zofka.setLocation(800, 415);
        zofka.move(115);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(115);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnLeft(90);
    }

    public void nakresliJinyRovnoramennyTrojuhelnik() {
        Color barvaTrojuhelniku = new Color(254, 0, 0);
        zofka.setPenColor(barvaTrojuhelniku);
        zofka.turnRight(91);
        zofka.move(100);
        zofka.turnRight(135.0);
        zofka.move(140);
        zofka.turnRight(135.0);
        zofka.move(100);
    }
}
