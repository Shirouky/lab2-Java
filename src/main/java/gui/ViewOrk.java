package gui;

import factory.BasicStats;
import ork.Ork;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ViewOrk extends JFrame {
    public ViewOrk(Ork ork) {
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("src/ork.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));

        var backgroundColor = new Color(89, 60, 42);
        getContentPane().setBackground(backgroundColor);

        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);


        JLabel name = new JLabel();
        JLabel weapon = new JLabel();
        JLabel armor = new JLabel();
        JLabel banner = new JLabel();
        JLabel nameLabel = new JLabel("Name: ");
        JLabel weaponLabel = new JLabel("Weapon: ");
        JLabel armorLabel = new JLabel("Armor: ");
        JLabel bannerLabel = new JLabel("Banner: ");

        JLabel strengthLabel = new JLabel("Strength: ");
        JLabel agilityLabel = new JLabel("Agility: ");
        JLabel healthLabel = new JLabel("Health: ");
        JLabel intellectLabel = new JLabel("Intellect: ");
        JProgressBar strengthBar = new JProgressBar(BasicStats.STRENGTH.getMin(), BasicStats.STRENGTH.getMax());
        JProgressBar agilityBar = new JProgressBar(BasicStats.AGILITY.getMin(), BasicStats.AGILITY.getMax());
        JProgressBar healthBar = new JProgressBar(BasicStats.HEALTH.getMin(), BasicStats.HEALTH.getMax());
        JProgressBar intellectBar = new JProgressBar(BasicStats.INTELLECT.getMin(), BasicStats.INTELLECT.getMax());
        JButton exit = new JButton("Return");
        exit.addActionListener(new ExitEvent());

        strengthBar.setValue(ork.getStrength());
        agilityBar.setValue(ork.getAgility());
        healthBar.setValue(ork.getHealth());
        intellectBar.setValue(ork.getIntellect());

        name.setText(ork.getName());
        weapon.setText(ork.getWeapon().getName());
        armor.setText(ork.getArmor().getName());
        banner.setText(ork.getBanner().getName());

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(picLabel)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(nameLabel)
                                .addComponent(weaponLabel)
                                .addComponent(armorLabel)
                                .addComponent(bannerLabel)
                                .addComponent(strengthLabel)
                                .addComponent(agilityLabel)
                                .addComponent(healthLabel)
                                .addComponent(intellectLabel)
                                .addComponent(exit))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(name)
                                .addComponent(weapon)
                                .addComponent(armor)
                                .addComponent(banner)
                                .addComponent(strengthBar)
                                .addComponent(agilityBar)
                                .addComponent(healthBar)
                                .addComponent(intellectBar)));


        layout.setVerticalGroup(
                layout.createParallelGroup()
                        .addComponent(picLabel)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(nameLabel)
                                        .addComponent(name))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(weaponLabel)
                                        .addComponent(weapon))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(armorLabel)
                                        .addComponent(armor))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(bannerLabel)
                                        .addComponent(banner))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(strengthLabel)
                                        .addComponent(strengthBar))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(agilityLabel)
                                        .addComponent(agilityBar))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(healthLabel)
                                        .addComponent(healthBar))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(intellectLabel)
                                        .addComponent(intellectBar))
                                .addComponent(exit)));

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private class ExitEvent implements ActionListener {
        final ViewOrk gui = ViewOrk.this;

        @Override
        public void actionPerformed(ActionEvent e) {
            gui.dispose();
        }
    }
}
