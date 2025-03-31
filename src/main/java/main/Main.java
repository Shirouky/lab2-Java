package main;

import gui.Tree;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        var textColor = new Color(255, 0, 0);
        var backgroundColor = new Color(89, 60, 42);

        UIManager.put("Tree.font", new Font("Calligrapher", Font.BOLD, 14));
        UIManager.put("Label.font", new Font("Calligrapher", Font.BOLD, 14));
        UIManager.put("Button.font", new Font("Calligrapher", Font.BOLD, 14));
        UIManager.put("Button.foreground", textColor);
        UIManager.put("Tree.foreground", textColor);

        UIManager.put("RadioButton.font", new Font("Calligrapher", Font.BOLD, 14));
        UIManager.put("RadioButton.foreground", textColor);
        UIManager.put("RadioButton.background", backgroundColor);
        UIManager.put("TextField.foreground", textColor);
        UIManager.put("TextField.background", backgroundColor);
        UIManager.put("TextField.font", new Font("Calligrapher", Font.BOLD, 14));

        UIManager.put("Button.background", backgroundColor);
        UIManager.put("Frame.background", backgroundColor);
        UIManager.put("Label.foreground", textColor);
        UIManager.put("DefaultMutableTreeNode.foreground", textColor);
        new Tree(new Controller());
    }
}