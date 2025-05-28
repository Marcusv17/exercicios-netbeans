/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkbox;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author MARCUS
 */
public class CheckBox {

   public static void main(String[] args) {
   
      
        
        JFrame frame = new JFrame("Cadastro de Pessoas");
        //Isso cria a janela principal com o título: Cadastro de Pessoas
        //JFrame é o componente Swing que representa uma janela
      
        frame.setSize(600, 400);
//Define o tamanho da janela: 600 pixels de largura e 400 de altura
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Define o que acontece quando o usuário clicar no “X” da janela
//EXIT_ON_CLOSE faz com que o  programa se encerre

        frame.setLayout(null);
//Desativa os gerenciadores de layout automáticos
//(x, y, largura, altura) para colocar os componentes

        // JTextField - Nome
        JLabel nomeLabel = new JLabel("Nome:");
//Isso cria um rótulo de texto (label) com o texto “Nome: ”

        nomeLabel.setBounds(20, 20, 50, 25);
//Define a posição e o tamanho do rótulo nomeLabel
//x = 20, y = 20: posição inicial
//Largura = 50, Altura = 25: Tamanho do rótulo
        JTextField nomeField = new JTextField();
//Local onde o usuário pode digitar seu nome.
        nomeField.setBounds(80, 20, 200, 25);
//Posiciona o campo de texto do nome
//x = 80 (ao lado do rótulo), y = 20 (mesmo alinhamento vertical)
//Largura = 200, Altura = 25: tamanho do campo
        frame.add(nomeLabel);
        frame.add(nomeField);
//(frame), tornando-os visíveis na interface

        //JTextArea - Observações
        
        JLabel obsLabel = new JLabel("Observações:");
        obsLabel.setBounds(20, 60, 100, 25);
        JTextArea obsArea = new JTextArea();
        JScrollPane obsScroll = new JScrollPane(obsArea);
        obsScroll.setBounds(120, 60, 200, 60);
        frame.add(obsLabel);
        frame.add(obsScroll);

        //JCheckBox Ativo
        
        JCheckBox ativoBox = new JCheckBox("Ativo");
        ativoBox.setBounds(80, 130, 100, 25);
        frame.add(ativoBox);

        //Botão para adicionar à tabela
        
        JButton adicionarBtn = new JButton("Adicionar");
        adicionarBtn.setBounds(200, 130, 120, 30);
        frame.add(adicionarBtn);

        //JTable - Tabela de dados
        
        String[] colunas = { "Nome", "Observações", "Ativo?" };
        DefaultTableModel tableModel = new DefaultTableModel(colunas, 0);
        JTable table = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setBounds(20, 180, 540, 150);
        frame.add(tableScroll);

        //Ação do botão
        
        adicionarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String observacoes = obsArea.getText();
                boolean ativo = ativoBox.isSelected();

                // Adicionar na tabela
                
                tableModel.addRow(new Object[] { nome, observacoes, ativo ? "Sim" : "Não" });

                // Limpa todos os campos
                
                nomeField.setText("");
                obsArea.setText("");
                ativoBox.setSelected(false);
            }
        });

        //Exibe a janela
        frame.setVisible(true);
    }
}