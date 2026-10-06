
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuInicial extends JPanel {

    private JLabel titulo;

    private JMenuBar menuBar;

    private JMenu menuCadastros;
    private JMenu menuSistema;

    private JMenuItem itemMEI;
    private JMenuItem itemSimplesNacional;
    private JMenuItem itemLucroPresumido;
    private JMenuItem itemLucroReal;

    private JMenuItem itemTelaInicial;
    private JMenuItem itemSair;


    public MenuInicial(JFrame frame) {

        super();

        this.setLayout(null);

        // Título
        this.add(getLabelTitulo());

        // Menu
        configurarMenu(frame);
    }


    public JLabel getLabelTitulo() {

        if (titulo == null) {

            titulo = new JLabel("Sistema de Contabilidade");

            titulo.setFont(
                new Font("Arial", Font.BOLD, 28)
            );

            titulo.setBounds( 130, 150, 400, 40);
        }

        return titulo;
    }


    private void configurarMenu(JFrame frame) {

        menuBar = new JMenuBar();

        

        menuCadastros = new JMenu("Cadastros");

        itemMEI = new JMenuItem("Empresa MEI");
        itemSimplesNacional =
            new JMenuItem("Simples Nacional");

        itemLucroPresumido =
            new JMenuItem("Lucro Presumido");

        itemLucroReal =
            new JMenuItem("Lucro Real");


        menuCadastros.add(itemMEI);
        menuCadastros.add(itemSimplesNacional);
        menuCadastros.add(itemLucroPresumido);
        menuCadastros.add(itemLucroReal);


        

        menuSistema = new JMenu("Sistema");

        itemTelaInicial =
            new JMenuItem("Tela Inicial");

        itemSair =
            new JMenuItem("Sair");


        menuSistema.add(itemTelaInicial);
        menuSistema.addSeparator();
        menuSistema.add(itemSair);


        

        menuBar.add(menuCadastros);
        menuBar.add(menuSistema);

        frame.setJMenuBar(menuBar);


        

        itemMEI.addActionListener(e -> {

            frame.setContentPane(
                new TelaEmpresaMEI(frame) // Tlvz nao precisa passar o frame como parametro
            );

            frame.revalidate();
            frame.repaint();
        });


        itemSimplesNacional.addActionListener(e -> {

            frame.setContentPane(
                new TelaSimplesNacional(frame)
            );

            frame.revalidate();
            frame.repaint();
        });


        itemLucroPresumido.addActionListener(e -> {

            frame.setContentPane(
                new TelaLucroPresumido(frame)
            );

            frame.revalidate();
            frame.repaint();
        });


        itemLucroReal.addActionListener(e -> {

            frame.setContentPane(
                new TelaLucroReal(frame)
            );

            frame.revalidate();
            frame.repaint();
        });


        itemTelaInicial.addActionListener(e -> {

            frame.setContentPane(
                new MenuInicial(frame)
            );

            frame.revalidate();
            frame.repaint();
        });


        itemSair.addActionListener(e -> {

            System.exit(0);
        });
    }


    public static void main(String[] args) {

        JFrame frame =
            new JFrame("Sistema de Contabilidade");

        frame.setSize(550, 550);

        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        frame.setLocationRelativeTo(null);

        frame.setContentPane(
            new MenuInicial(frame)
        );

        frame.setVisible(true);
    }
}
