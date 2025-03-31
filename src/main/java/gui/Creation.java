package gui;

import main.Controller;
import main.OrkType;
import ork.Tribe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.*;

public class Creation extends JFrame {
    private final Tree tree;
    private final ButtonGroup tribes = new ButtonGroup();
    private final ButtonGroup types = new ButtonGroup();
    private final Controller controller;
    private final JTextField name = new JTextField();

    public Creation(Tree tree, Controller controller) {
        this.tree = tree;
        this.controller = controller;

        float t = 30;
        JLabel label = new JLabel("Creation of Ork");
        label.setFont(label.getFont().deriveFont(t));
        add(label);

        JLabel nameLabel = new JLabel("Name");
        add(nameLabel);
        add(name);

        GridLayout layout = new GridLayout(4, 3);
        setLayout(layout);

        for (Tribe tribe : Tribe.values()) {
            JRadioButton radioButton = new JRadioButton(tribe.toString());
            radioButton.setActionCommand(tribe.toString());
            add(radioButton);
            radioButton.setSelected(true);

            this.tribes.add(radioButton);
        }

        for (OrkType type : OrkType.values()) {
            JRadioButton radioButton = new JRadioButton(type.toString());
            radioButton.setActionCommand(type.toString());
            add(radioButton);
            radioButton.setSelected(true);

            this.types.add(radioButton);
        }
        JButton createButton = new JButton("Create");
        add(createButton);
        createButton.addActionListener(new CreateEvent());
        var backgroundColor = new Color(89, 60, 42);
        getContentPane().setBackground(backgroundColor);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    private class CreateEvent implements ActionListener {
        final Creation gui = Creation.this;

        @Override
        public void actionPerformed(ActionEvent e) {
            Tribe tribe = null;
            OrkType type = null;

            Enumeration<AbstractButton> tr = tribes.getElements();
            while (tr.hasMoreElements()) {
                var tribeButton = tr.nextElement();
                if (tribeButton.isSelected()) {
                    tribe = Tribe.valueOf(tribeButton.getActionCommand());
                }
            }

            Enumeration<AbstractButton> ty = types.getElements();
            while (ty.hasMoreElements()) {
                var tribeButton = ty.nextElement();
                if (tribeButton.isSelected()) {
                    type = OrkType.valueOf(tribeButton.getActionCommand());
                }
            }

            tree.update(controller.createBuilderFactory(name.getText(), tribe, type));
            gui.dispose();
        }
    }
}
