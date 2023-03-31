/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author golden
 */
public class Vista extends JPanel {
private Image imagen;

public Vista(Image imagen) {
this.imagen = imagen;
}

public void paintComponent(Graphics g) {
super.paintComponent(g);
g.drawImage(imagen, 0, 0, this);
}
}
