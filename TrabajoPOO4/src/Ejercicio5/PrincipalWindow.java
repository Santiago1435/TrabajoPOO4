package Ejercicio5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PrincipalWindow extends JFrame implements ActionListener {
    private PersonList list;
    private Container container;
    private JLabel nameLabel, surnameLabel, phoneLabel, addressLabel;
    private JTextField nameField, surnameField, phoneField, addressField;
    private JButton addBtn, removeBtn, clearListBtn;
    private JList nameList;
    private DefaultListModel model;
    private JScrollPane listScrollPane;

    public PrincipalWindow() {
        list = new PersonList();
        initialize();
        setTitle("Personas");
        setSize(270, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void initialize() {
        container = getContentPane();
        container.setLayout(null);

        nameLabel = new JLabel();
        nameLabel.setText("Nombre:");
        nameLabel.setBounds(20, 20, 135, 23);
        nameField = new JTextField();
        nameField.setBounds(105, 20, 135, 23);

        surnameLabel = new JLabel();
        surnameLabel.setText("Apellido:");
        surnameLabel.setBounds(20, 50, 135, 23);
        surnameField = new JTextField();
        surnameField.setBounds(105, 50, 135, 23);

        phoneLabel = new JLabel();
        phoneLabel.setText("Telefono:");
        phoneLabel.setBounds(20, 80, 135, 23);
        phoneField = new JTextField();
        phoneField.setBounds(105, 80, 135, 23);

        addressLabel = new JLabel();
        addressLabel.setText("Direccion:");
        addressLabel.setBounds(20, 110, 135, 23);
        addressField = new JTextField();
        addressField.setBounds(105, 110, 135, 23);

        addBtn = new JButton();
        addBtn.setText("Agregar");
        addBtn.setBounds(105, 150, 80, 23);
        addBtn.addActionListener(this);

        removeBtn = new JButton();
        removeBtn.setText("Eliminar");
        removeBtn.setBounds(20, 280, 80, 23);
        removeBtn.addActionListener(this);

        clearListBtn = new JButton();
        clearListBtn.setText("Eliminar Todos");
        clearListBtn.setBounds(120, 280, 120, 23);
        clearListBtn.addActionListener(this);

        nameList = new JList();
        nameList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        model = new DefaultListModel();

        listScrollPane = new JScrollPane();
        listScrollPane.setBounds(20, 190, 220, 80);
        listScrollPane.setViewportView(nameList);

        container.add(nameLabel);
        container.add(nameField);
        container.add(surnameLabel);
        container.add(surnameField);
        container.add(phoneLabel);
        container.add(phoneField);
        container.add(addressLabel);
        container.add(addressField);
        container.add(addBtn);
        container.add(removeBtn);
        container.add(clearListBtn);
        container.add(listScrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == addBtn) {
            addPerson();
        }
        if (event.getSource() == removeBtn) {
            removeName(nameList.getSelectedIndex());
        }
        if (event.getSource() == clearListBtn) {
            clearList();
        }
    }

    private void addPerson() {
        Person p = new Person(nameField.getText(), surnameField.getText(), phoneField.getText(), addressField.getText());
        list.addPerson(p);
        String item = nameField.getText() + "-" + surnameField.getText() + "-" + phoneField.getText() + "-" + addressField.getText();
        model.addElement(item);
        nameList.setModel(model);
        nameField.setText("");
        surnameField.setText("");
        phoneField.setText("");
        addressField.setText("");
    }

    private void removeName(int index) {
        if (index >= 0) {
            model.removeElementAt(index);
            list.removePerson(index);
        } else {
            JOptionPane.showMessageDialog(null, "Deberias seleccionar solo uno", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearList() {
        list.clearList();
        model.clear();


    }
}
