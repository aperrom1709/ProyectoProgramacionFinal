package Ui.panels;



import Ui.frames.FrameLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelModificar extends JPanel {
    JTextField idUser;
    JTextField  nombre;
    JTextField pass;
    JTextField pass2;
    JComboBox isadmin;
    private FrameLogin framepadre;

    JButton Consultar;
    JButton Modificar;
    JButton atras;

    private MouseListener listenerMouseAtras = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("atras pulsado");
            cargarpanelop();
        }
    };

    public PanelModificar(FrameLogin framepadre){
        this.framepadre=framepadre;
        this.setBackground((new Color(223, 220, 220)));
        this.setLayout(null);

        JLabel iduser=new JLabel("IdUsuario");
        iduser.setLocation(new Point(200,50));
        iduser.setSize(new Dimension(152,32));
        this.add(iduser);

        idUser=new JTextField("Introduzca su usuario");
        idUser.setLocation(new Point(260,50));
        idUser.setSize(new Dimension(152,32));
        this.add(idUser);

        Consultar=new JButton("Consultar");
        Consultar.setLocation(new Point(210,100));
        Consultar.setSize(new Dimension(152,32));
        Consultar.setBackground(new Color(0xEA8484));
        this.add(Consultar);


        JLabel idusuario =new JLabel("IdUsuario: ");
        idusuario.setLocation(new Point(200,150));
        idusuario.setSize(new Dimension(152,32));
        // usuario.setFont(new Font("Consolas", Font.BOLD, 22));
        this.add(idusuario);
        idUser = new JTextField("Introduzca su usuario: ");
        idUser.setLocation(new Point(260,150));
        idUser.setSize(new Dimension(152,32));
        this.add(idUser);

        JLabel nombres =new JLabel("Nombre: ");
        nombres.setLocation(new Point(200,200));
        nombres.setSize(new Dimension(152,32));
        this.add(nombres);
        nombre=new JTextField("introduce tu nombre: ");
        nombre.setLocation(new Point(260,200));
        nombre.setSize(new Dimension(152,32));
        this.add(nombre);

        JLabel passwd = new JLabel("Passwd: ");
        passwd.setLocation(new Point(200,250));
        passwd.setSize(new Dimension(152,32));
        this.add(passwd);

        pass = new JPasswordField();
        pass.setLocation(new Point(260,250));
        pass.setSize(new Dimension(152,32));
        this.add(pass);

        JLabel passwd2= new JLabel("Passwd2: ");
        passwd2.setLocation(new Point(200,300));
        passwd2.setSize(new Dimension(152,32));
        this.add(passwd2);

        pass2 =new JPasswordField();
        pass2.setLocation(new Point(260,300));
        pass2.setSize(new Dimension(152,32));
        this.add(pass2);

        JLabel Isadmin=new JLabel("IsAdmin: ");
        Isadmin.setLocation(new Point(200,350));
        Isadmin.setSize(new Dimension(152,32));
        this.add(Isadmin);

        isadmin=new JComboBox();
        isadmin.addItem("Si");
        isadmin.addItem("no");
        isadmin.setLocation(new Point(260,350));
        isadmin.setSize(new Dimension(152,32));
        this.add(isadmin);

        Modificar = new JButton("Modificar");
        Modificar.setLocation(new Point(220,400));
        Modificar.setSize(new Dimension(152,32));
        this.add(Modificar);
        atras=new JButton("atras");
        atras.setLocation(new Point(100,500));
        atras.setSize(new Dimension(152,32));
        atras.setBackground(new Color(0xEA8484));
        atras.addMouseListener(listenerMouseAtras);
        this.add(atras);

    }
    private void cargarpanelop(){
        //Eliminamos this Panellogin....
        framepadre.remove(this);
        //Añadimos un panel alta al frame
        PanelOpciones panelop=new PanelOpciones(framepadre);
        framepadre.add(panelop);

        //Ultimo
        framepadre.repaint();
        framepadre.revalidate();
    }


}
