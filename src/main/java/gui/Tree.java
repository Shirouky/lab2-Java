package gui;

import main.Controller;
import ork.Ork;
import ork.Tribe;

import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Tree extends JFrame {
    JButton createButton = new JButton("Create Ork");
    ArrayList<DefaultMutableTreeNode> nodes;
    private final Controller controller;
    private final HashMap<String, ArrayList<Ork>> orks = new HashMap<>();

    public Tree(Controller controller) {
        var textColor = new Color(255, 0, 0);
        var backgroundColor = new Color(89, 60, 42);
        getContentPane().setBackground(Color.RED);
        this.controller = controller;

        for (Tribe tribe : Tribe.values()) {
            this.orks.put(tribe.toString(), new ArrayList<>());
        }

        TreeModel model = createTreeModel();

        JTree tree = new JTree(model);
        tree.addTreeSelectionListener(new SelectionListener());

        TreeSelectionModel selModel = new DefaultTreeSelectionModel();
        selModel.setSelectionMode(TreeSelectionModel.DISCONTIGUOUS_TREE_SELECTION);

        tree.getSelectionModel().
                setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        JPanel contents = new JPanel(new GridLayout(1, 3));
        contents.add(new JScrollPane(tree));
        contents.setBackground(backgroundColor);
        tree.setBackground(backgroundColor);
        tree.setForeground(textColor);

        setSize(500, 300);
        add(contents);
        add(createButton, BorderLayout.NORTH);
        createButton.setSize(40, 20);
        createButton.addActionListener(new CreateEvent());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    private TreeModel createTreeModel() {
        var model = new DefaultMutableTreeNode("Army");

        nodes = new ArrayList<>();
        for (String tribe : this.orks.keySet()) {
            var node = new DefaultMutableTreeNode(tribe, true);
            for (Ork ork : this.orks.get(tribe)) {
                node.add(new DefaultMutableTreeNode(ork.getName(), false));
            }
            nodes.add(node);
            model.add(node);
        }
        return new DefaultTreeModel(model);
    }

    public void update(Ork ork) {
        orks.get(ork.getTribe()).add(ork);

        for (DefaultMutableTreeNode node : this.nodes) {
            if (Objects.equals(node.toString(), ork.getTribe())) {
                node.add(new DefaultMutableTreeNode(ork.getName(), false));
            }
        }
    }

    class SelectionListener implements TreeSelectionListener {
        public void valueChanged(TreeSelectionEvent e) {
            if (e.getPath().getPathCount() == 3) {
                for (Ork ork : orks.get(e.getPath().getPathComponent(1).toString())) {
                    if (Objects.equals(ork.getName(), e.getPath().getPathComponent(2).toString())) {
                        new ViewOrk(ork);
                    }
                }
            }
        }
    }

    private class CreateEvent implements ActionListener {
        final Tree tree = Tree.this;

        @Override
        public void actionPerformed(ActionEvent e) {
            tree.setVisible(true);
            new Creation(tree, controller);
        }
    }
}