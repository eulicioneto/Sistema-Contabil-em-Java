package controller;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import view.TelaEmpresaMEI;
import view.TelaLucroPresumido;
import view.TelaLucroReal;
import view.TelaSimplesNacional;
public class ControllerFrame implements ActionListener{
    
    Frame frame;

    TelaLucroPresumido telaLucroPresumido;
    TelaLucroReal telaLucroReal;
    TelaSimplesNacional telaSimplesNacional;
    TelaEmpresaMEI telaEmpresaMEI;

    ControllerLucroPresumido controllerLucroPresumido;
    ControllerLucroReal controllerLucroReal;
    ControllerSimplesNacional controllerSimplesNacional;
    ControllerMEI controllerEmpresaMEI;

    public ControllerFrame() {
        this.frame = new Frame();
        addEvents();
    }

    private void addEvents() {
        frame.getItemLucroPresumido().addActionListener(this);
        frame.getItemLucroReal().addActionListener(this);
        frame.getItemSimplesNacional().addActionListener(this);
        frame.getItemMEI().addActionListener(this);
        frame.getItemSaida().addActionListener(this);
        frame.getItemTelaInicial().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
    
    if(e.getSource() == frame.getItemLucroPresumido()){
        setTelaLucroPresumido();
    } else if(e.getSource() == frame.getItemLucroReal()){
        setTelaLucroReal();
    } else if(e.getSource() == frame.getItemSimplesNacional()){
        setTelaSimplesNacional();
    } else if(e.getSource() == frame.getItemMEI()){
        setTelaEmpresaMEI();
    } else if(e.getSource() == frame.getItemTelaInicial()){
        setTelaInicial();
    } else if(e.getSource() == frame.getItemSaida()){
         System.exit(0);
    }


    }

    private void setTelaLucroPresumido() {
        if(telaLucroPresumido == null){
            telaLucroPresumido = new TelaLucroPresumido(frame);
        }
        if(controllerLucroPresumido == null){
            controllerLucroPresumido = new ControllerLucroPresumido(telaLucroPresumido);
        }
        frame.setContentPane(telaLucroPresumido);
        frame.revalidate();
        frame.repaint();
    }

    private void setTelaLucroReal() {
        if(telaLucroReal == null){
            telaLucroReal = new TelaLucroReal(frame);
        }
        if(controllerLucroReal == null){
            controllerLucroReal = new ControllerLucroReal(telaLucroReal);
        }
        frame.setContentPane(telaLucroReal);
        frame.revalidate();
        frame.repaint();
    }

    private void setTelaSimplesNacional() {
        if(telaSimplesNacional == null){
            telaSimplesNacional = new TelaSimplesNacional(frame);
        }
        if(controllerSimplesNacional == null){
            controllerSimplesNacional = new ControllerSimplesNacional(telaSimplesNacional);
        }
        frame.setContentPane(telaSimplesNacional);
        frame.revalidate();
        frame.repaint();
    }

    private void setTelaEmpresaMEI() {
        if(telaEmpresaMEI == null){
            telaEmpresaMEI = new TelaEmpresaMEI(frame);
        }
        if(controllerEmpresaMEI == null){
            controllerEmpresaMEI = new ControllerEmpresaMEI(telaEmpresaMEI);
        }
        frame.setContentPane(telaEmpresaMEI);
        frame.revalidate();
        frame.repaint();
    }

    private void setTelaInicial() { //Acho que da pra ajustar aqui

        if(frame.getMenuInicial() == null){
            frame.setMenuInicial(new view.MenuInicial(frame));
        }

        frame.setContentPane(frame.getMenuInicial());
        frame.revalidate();
        frame.repaint();
    }

    private void setTelaSaida() {
        System.exit(0); //Precisa disso?
    }

    /*public static void main(String[] args) {
		new ControladorFrame();
	}*/


}
