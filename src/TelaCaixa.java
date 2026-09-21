package Telass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TelaCaixa extends JFrame {

    private JLabel lblSaldo;
    private JTextField txtDescricao;
    private JComboBox<String> cbTipo;
    private JLabel lblData;
    private JButton btnSalvar;

    public TelaCaixa() {
        setTitle("PizzaGest - Controle de Caixa");
        setSize(400, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblTitulo = new JLabel("Controle de caixa");
        lblTitulo.setBounds(140, 15, 150, 20);
        add(lblTitulo);

        lblSaldo = new JLabel("Saldo atual: R$ 0.00");
        lblSaldo.setBounds(120, 50, 200, 20);
        add(lblSaldo);

        JLabel lblDesc = new JLabel("Descricao");
        lblDesc.setBounds(40, 85, 100, 20);
        add(lblDesc);

        txtDescricao = new JTextField();
        txtDescricao.setBounds(40, 110, 300, 25);
        add(txtDescricao);

        JLabel lblMov = new JLabel("Tipo de movimentacao");
        lblMov.setBounds(40, 145, 150, 20);
        add(lblMov);

        String[] tipos = {"Entrada", "Saida"};
        cbTipo = new JComboBox<>(tipos);
        cbTipo.setBounds(40, 170, 300, 25);
        add(cbTipo);

        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy");
        lblData = new JLabel("Data: " + hoje.format(formato));
        lblData.setBounds(40, 210, 150, 20);
        add(lblData);

        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(150, 240, 90, 30);
        add(btnSalvar);

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Movimentacao salva com sucesso!");
            }
        });
    }
}