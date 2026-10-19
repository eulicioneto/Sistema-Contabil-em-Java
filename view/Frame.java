package view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
public class Frame extends JFrame {

    private JMenuBar menuBar;
    private JMenu menuCadastrar;
    private JMenu menuSistema;
    private JMenuItem itemMEI;
    private JMenuItem itemLucroPresumido;
    private JMenuItem itemLucroReal;
    private JMenuItem itemSimplesNacional;
    private JMenuItem itemTelaInicial;
    private JMenuItem itemSair;

    public Frame() {

        super();

        this.setTitle("Sistema de Contabilidade");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        setJMenuBar(getMenuBar());
        
    }

    public JMenuBar getMenuBar() { //Pq ta dando erro aq merda?
        if (menuBar == null) {
            menuBar = new JMenuBar();
            menuBar.add(getMenuCadastrar());
            menuBar.add(getMenuSistema());
        }
        return menuBar;
    }

    public JMenu getMenuCadastrar(){
        if(menuCadastrar == null){
            menuCadastrar = new JMenu("Cadastrar");
            menuCadastrar.add(getItemMEI());
            menuCadastrar.add(getItemSimplesNacional());
            menuCadastrar.add(getItemLucroPresumido());
            menuCadastrar.add(getItemLucroReal());
        }
        return menuCadastrar;
    }

    private JMenuItem getItemLucroReal() {
        if(itemLucroReal == null){
            itemLucroReal = new JMenuItem("Empresa Lucro Real");
        }
        return itemLucroReal;
    }

    private JMenuItem getItemLucroPresumido() {
        if(itemLucroPresumido == null){
            itemLucroPresumido = new JMenuItem("Empresa Lucro Presumido");
        }
        return itemLucroPresumido;
    }

    public JMenu getMenuSistema(){
        if(menuSistema == null){
            menuSistema = new JMenu("Sistema");
            menuSistema.add(getItemTelaInicial());
            menuSistema.add(getItemSair());
        }
        return menuSistema;
    }

    private JMenuItem getItemTelaInicial() {
        if(itemTelaInicial == null){
            itemTelaInicial = new JMenuItem("Tela Inicial");
        }
        return itemTelaInicial;
    }

    private JMenuItem getItemSair() {
        if(itemSair == null){
            itemSair = new JMenuItem("Sair");
        }
        return itemSair;
    }

    private JMenuItem getItemMEI() {
        if(itemMEI == null){
            itemMEI = new JMenuItem("Empresa MEI");
        }
        return itemMEI;
    }

    private JMenuItem getItemSimplesNacional() {
        if(itemSimplesNacional == null){
            itemSimplesNacional = new JMenuItem("Empresa Simples Nacional");
        }
        return itemSimplesNacional;
    }
    
}
