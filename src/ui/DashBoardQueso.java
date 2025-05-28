package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;

public class DashBoardQueso extends JFrame {

    private JTextField txtFieldCantidad;
    private final ButtonGroup buttonGroupTipoQueso = new ButtonGroup();
    private JTextField textFieldAltura;
    private JTextField textFieldRadio;

    public DashBoardQueso() {
    	getContentPane().setBackground(Color.ORANGE);
        setTitle("Gestión de Lotes de Queso");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //button-CrearLote
        JButton buttonCrearLote = new JButton("Crear Lote");
        buttonCrearLote.setBounds(331, 180, 93, 23);
        buttonCrearLote.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        getContentPane().setLayout(null);
        
        //rdbtn-Esférico
        JRadioButton rdbtnEsfrico = new JRadioButton("Esf\u00E9rico");
        rdbtnEsfrico.setBackground(Color.ORANGE);
        rdbtnEsfrico.setBounds(146, 139, 93, 23);
        buttonGroupTipoQueso.add(rdbtnEsfrico);
        getContentPane().add(rdbtnEsfrico);
        
        //rdbtn-Cilindro
        JRadioButton rdbtnCilindro = new JRadioButton("Cil\u00EDndrico");
        rdbtnCilindro.setBackground(Color.ORANGE);
        rdbtnCilindro.setBounds(236, 139, 93, 23);
        buttonGroupTipoQueso.add(rdbtnCilindro);
        getContentPane().add(rdbtnCilindro);
        
        //rdbtn-CilindroHueco
        JRadioButton rdbtnCilindroHueco = new JRadioButton("Cilindro Hueco");
        rdbtnCilindroHueco.setBackground(Color.ORANGE);
        rdbtnCilindroHueco.setBounds(326, 139, 98, 23);
        buttonGroupTipoQueso.add(rdbtnCilindroHueco);
        getContentPane().add(rdbtnCilindroHueco);
        
        //txtF-Cantidad
        txtFieldCantidad = new JTextField();
        txtFieldCantidad.setBounds(146, 230, 54, 20);
        txtFieldCantidad.setForeground(Color.BLACK);
        txtFieldCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtFieldCantidad);
        txtFieldCantidad.setColumns(10);
        
        //JLabel-InsertarCantidad
        JLabel lblInsertarCantidad = new JLabel("Insterte la cantidad:");
        lblInsertarCantidad.setBounds(41, 231, 104, 19);
        lblInsertarCantidad.setHorizontalAlignment(SwingConstants.CENTER);
        lblInsertarCantidad.setBackground(Color.ORANGE);
        getContentPane().add(lblInsertarCantidad);
        lblInsertarCantidad.setLabelFor(txtFieldCantidad);
        getContentPane().add(buttonCrearLote);
        
        //button-EliminarLote
        JButton buttonEliminarLote = new JButton("Elimina Lote");
        buttonEliminarLote.setBounds(331, 214, 93, 23);
        buttonEliminarLote.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        getContentPane().add(buttonEliminarLote);
        
        //JLabel-EscogerTipo
        JLabel labelEscogerTipo = new JLabel("Escoja el tipo de queso:");
        labelEscogerTipo.setBounds(25, 139, 120, 23);
        labelEscogerTipo.setHorizontalAlignment(SwingConstants.CENTER);
        labelEscogerTipo.setBackground(Color.ORANGE);
        getContentPane().add(labelEscogerTipo);
        
        //JList-Pedidos
        JList listPedidos = new JList();
        listPedidos.setBackground(Color.WHITE);
        listPedidos.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        listPedidos.setBounds(5, 11, 419, 117);
        getContentPane().add(listPedidos);
        
        //JLabel-Altura
        JLabel lblInsertatAltura = new JLabel("Insterte la altura del queso:");
        lblInsertatAltura.setHorizontalAlignment(SwingConstants.CENTER);
        lblInsertatAltura.setBackground(Color.ORANGE);
        lblInsertatAltura.setBounds(5, 169, 142, 20);
        getContentPane().add(lblInsertatAltura);
        
        //txtField-Altura
        textFieldAltura = new JTextField();
        textFieldAltura.setBackground(Color.WHITE);
        textFieldAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldAltura.setForeground(Color.BLACK);
        textFieldAltura.setColumns(10);
        textFieldAltura.setBounds(145, 169, 55, 20);
        getContentPane().add(textFieldAltura);
        
        //JLabel-InstertarRadio
        JLabel lblInstertarRadio = new JLabel("Insterte el radio del queso:");
        lblInstertarRadio.setHorizontalAlignment(SwingConstants.CENTER);
        lblInstertarRadio.setBackground(Color.ORANGE);
        lblInstertarRadio.setBounds(5, 200, 142, 20);
        getContentPane().add(lblInstertarRadio);
        
        //txtField-Radio
        textFieldRadio = new JTextField();
        textFieldRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldRadio.setForeground(Color.BLACK);
        textFieldRadio.setColumns(10);
        textFieldRadio.setBounds(145, 199, 55, 20);
        getContentPane().add(textFieldRadio);
        
        //JButton-AgregarPedido
        JButton btnAgregarPedido = new JButton("Agregar pedido");
        btnAgregarPedido.setBackground(Color.GRAY);
        btnAgregarPedido.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnAgregarPedido.setBounds(209, 180, 112, 23);
        getContentPane().add(btnAgregarPedido);
        
        //JButton-EliminarPedido
        JButton btnEliminarPedido = new JButton("Eliminar pedido");
        btnEliminarPedido.setBackground(Color.GRAY);
        btnEliminarPedido.setBounds(210, 214, 112, 23);
        getContentPane().add(btnEliminarPedido);
        System.out.println("Hola");
    }
    }

