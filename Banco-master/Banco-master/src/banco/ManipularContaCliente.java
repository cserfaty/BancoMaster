package banco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManipularContaCliente extends JFrame{
    private JTextField cpfField;
    private JTextField valorField;
    private JTextArea saldoArea;

    public ManipularContaCliente() {
        setTitle("Manipular Conta do Cliente");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel cpfLabel = new JLabel("CPF do Cliente:");
        cpfField = new JTextField();
        panel.add(cpfLabel);
        panel.add(cpfField);

        JButton saqueButton = new JButton("Saque");
        saqueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfField.getText();
                // Encontrar o cliente com o CPF informado
                Cliente cliente = Sistema.hashClientes.get(cpf);
                if (cliente != null) {
                    // Lógica para efetuar o saque na conta do cliente
                    // Exemplo: cliente.getConta().sacar(valor);
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(saqueButton);

        JButton depositoButton = new JButton("Depósito");
        depositoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfField.getText();
                // Encontrar o cliente com o CPF informado
                Cliente cliente = Sistema.hashClientes.get(cpf);
                if (cliente != null) {
                    // Lógica para efetuar o depósito na conta do cliente
                    // Exemplo: cliente.getConta().depositar(valor);
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(depositoButton);

        JButton verSaldoButton = new JButton("Ver Saldo");
        verSaldoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfField.getText();
                // Encontrar o cliente com o CPF informado
                Cliente cliente = Sistema.hashClientes.get(cpf);
                if (cliente != null) {
                    // Exibir o saldo da conta do cliente
                    saldoArea.setText("Saldo: " + cliente.getConta().getSaldo());
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(verSaldoButton);

        JButton remuneraButton = new JButton("Remunera");
        remuneraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfField.getText();
                // Encontrar o cliente com o CPF informado
                Cliente cliente = Sistema.hashClientes.get(cpf);
                if (cliente != null) {
                    // Lógica para aplicar a remuneração na conta do cliente
                    // Exemplo: cliente.getConta().remunera();
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(remuneraButton);

        saldoArea = new JTextArea();
        panel.add(new JLabel("Saldo:"));
        panel.add(saldoArea);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ManipularContaCliente();
            }
        });
    }
}