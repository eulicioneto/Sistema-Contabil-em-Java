package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import view.TelaLucroPresumido;

public class ControllerLucroPresumido implements ActionListener {
    TelaLucroPresumido telaLucroPresumido;

    public ControllerLucroPresumido(TelaLucroPresumido telaLucroPresumido) {
        this.telaLucroPresumido = telaLucroPresumido;
        addEvents();
    }

    public void addEvents() {
        telaLucroPresumido.getJButtonVoltar().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
		if (e.getSource() == telaLucroPresumido.getButtonCadastrar()) {
			cadastrarEmpresa();
		}
	}

    private void cadastrarEmpresa() {
        String nome = telaLucroPresumido.getTextFieldNomeFantasia().getText();
        String cnpj = telaLucroPresumido.getTextFieldCnpj().getText();
        String dataInicio = telaLucroPresumido.getTextFieldDataInicio().getText();
        String razaoSocial = telaLucroPresumido.getTextFieldRazaoSocial().getText();
        double receitaBrutaAnual = Double.parseDouble(telaLucroPresumido.getTextFieldReceitaBrutaAnual().getText());
        String municipio = telaLucroPresumido.getTextFieldMunicipio().getText();
        String estado = telaLucroPresumido.getTextFieldEstado().getText();
        String atividadePrincipal = telaLucroPresumido.getTextFieldAtividadePrincipal().getText();
        double receitaBrutaTrimestral = Double.parseDouble(telaLucroPresumido.getTextFieldReceitaBrutaTrimestral().getText());
        double percentualPresuncao = Double.parseDouble(telaLucroPresumido.getTextFieldPercentualPresuncao().getText());
        double aliquotaIRPJ = Double.parseDouble(telaLucroPresumido.getTextFieldAliquotaIrpj().getText());
        double aliquotaCSLL = Double.parseDouble(telaLucroPresumido.getTextFieldAliquotaCsll().getText());  
        double valorPIS = Double.parseDouble(telaLucroPresumido.getTextFieldValorDoPIS().getText());
        double valorCOFINS = Double.parseDouble(telaLucroPresumido.getTextFieldValorDaCOFINS().getText());

        EmpresaLucroPresumido empresa = new EmpresaLucroPresumido(cnpj, razaoSocial, nome, municipio, estado, atividadePrincipal, receitaBrutaAnual, receitaBrutaTrimestral, percentualPresuncao, aliquotaIRPJ, aliquotaCSLL, valorPIS, valorCOFINS, null);

        JOptionPane.showMessageDialog(telaLucroPresumido, "Empresa cadastrada com sucesso!");
    }

}
