import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaEmpresaMEI extends JPanel {

    private JFrame frame;

    private JLabel titulo;

    private JTextField textFieldCnpj;
    private JLabel labelCnpj;

    private JTextField textFieldRazaoSocial;
    private JLabel labelRazaoSocial;

    private JTextField textFieldNomeFantasia;
    private JLabel labelNomeFantasia;

    private JTextField textFieldMunicipio;
    private JLabel labelMunicipio;

    private JTextField textFieldEstado;
    private JLabel labelEstado;

    private JTextField textFieldOcupacaoPrincipal;
    private JLabel labelOcupacaoPrincipal;

    private JTextField textFieldFaturamentoAnual;
    private JLabel labelFaturamentoAnual;

    private JTextField textFieldFaturamentoMensal;
    private JLabel labelFaturamentoMensal;

    private JTextField textFieldValorMensalDoDAS;
    private JLabel labelValorMensalDoDAS;

    private JTextField textFieldIndicadorDeExistenciaDeFuncionarios;
    private JLabel labelIndicadorDeExistenciaDeFuncionarios;

    private JTextField textFieldDataDeAbertura;
    private JLabel labelDataDeAbertura;

    private JButton cadastrar;
    private JButton voltar;

    public TelaEmpresaMEI(JFrame frame) {

        super();

        this.frame = frame;

        this.setLayout(null);

        // Título
        this.add(getLabelTitulo());

        // CNPJ
        this.add(getLabelCnpj());
        this.add(getTextFieldCnpj());

        // Razão Social
        this.add(getLabelRazaoSocial());
        this.add(getTextFieldRazaoSocial());

        // Nome Fantasia
        this.add(getLabelNomeFantasia());
        this.add(getTextFieldNomeFantasia());

        // Município
        this.add(getLabelMunicipio());
        this.add(getTextFieldMunicipio());

        // Estado
        this.add(getLabelEstado());
        this.add(getTextFieldEstado());

        // Ocupação Principal
        this.add(getLabelOcupacaoPrincipal());
        this.add(getTextFieldOcupacaoPrincipal());

        // Faturamento Anual
        this.add(getLabelFaturamentoAnual());
        this.add(getTextFieldFaturamentoAnual());

        // Faturamento Mensal
        this.add(getLabelFaturamentoMensal());
        this.add(getTextFieldFaturamentoMensal());

        // Valor Mensal do DAS
        this.add(getLabelValorMensalDoDAS());
        this.add(getTextFieldValorMensalDoDAS());

        // Indicador de Funcionários
        this.add(getLabelIndicadorDeExistenciaDeFuncionarios());
        this.add(getTextFieldIndicadorDeExistenciaDeFuncionarios());

        // Data de Abertura
        this.add(getLabelDataDeAbertura());
        this.add(getTextFieldDataDeAbertura());

        // Botão
        this.add(getJButton());
        this.add(getJButtonVoltar());
    }


    public JLabel getLabelTitulo() {

        if (titulo == null) {

            titulo = new JLabel("Cadastro Empresa MEI");

            titulo.setFont(
                new Font("Arial", Font.BOLD, 28)
            );

            titulo.setBounds(
                140, 25, 350, 40
            );
        }

        return titulo;
    }


    public JTextField getTextFieldCnpj() {

        if (textFieldCnpj == null) {

            textFieldCnpj = new JTextField();

            textFieldCnpj.setBounds(
                230, 90, 250, 25
            );
        }

        return textFieldCnpj;
    }


    public JLabel getLabelCnpj() {

        if (labelCnpj == null) {

            labelCnpj = new JLabel("CNPJ:");

            labelCnpj.setBounds(
                40, 90, 180, 25
            );
        }

        return labelCnpj;
    }


    public JTextField getTextFieldRazaoSocial() {

        if (textFieldRazaoSocial == null) {

            textFieldRazaoSocial = new JTextField();

            textFieldRazaoSocial.setBounds(
                230, 125, 250, 25
            );
        }

        return textFieldRazaoSocial;
    }


    public JLabel getLabelRazaoSocial() {

        if (labelRazaoSocial == null) {

            labelRazaoSocial = new JLabel("Razão Social:");

            labelRazaoSocial.setBounds(
                40, 125, 180, 25
            );
        }

        return labelRazaoSocial;
    }


    public JTextField getTextFieldNomeFantasia() {

        if (textFieldNomeFantasia == null) {

            textFieldNomeFantasia = new JTextField();

            textFieldNomeFantasia.setBounds(
                230, 160, 250, 25
            );
        }

        return textFieldNomeFantasia;
    }


    public JLabel getLabelNomeFantasia() {

        if (labelNomeFantasia == null) {

            labelNomeFantasia = new JLabel("Nome Fantasia:");

            labelNomeFantasia.setBounds(
                40, 160, 180, 25
            );
        }

        return labelNomeFantasia;
    }


    public JTextField getTextFieldMunicipio() {

        if (textFieldMunicipio == null) {

            textFieldMunicipio = new JTextField();

            textFieldMunicipio.setBounds(
                230, 195, 250, 25
            );
        }

        return textFieldMunicipio;
    }


    public JLabel getLabelMunicipio() {

        if (labelMunicipio == null) {

            labelMunicipio = new JLabel("Município:");

            labelMunicipio.setBounds(
                40, 195, 180, 25
            );
        }

        return labelMunicipio;
    }


    public JTextField getTextFieldEstado() {

        if (textFieldEstado == null) {

            textFieldEstado = new JTextField();

            textFieldEstado.setBounds(
                230, 230, 250, 25
            );
        }

        return textFieldEstado;
    }


    public JLabel getLabelEstado() {

        if (labelEstado == null) {

            labelEstado = new JLabel("Estado:");

            labelEstado.setBounds(
                40, 230, 180, 25
            );
        }

        return labelEstado;
    }


    public JTextField getTextFieldOcupacaoPrincipal() {

        if (textFieldOcupacaoPrincipal == null) {

            textFieldOcupacaoPrincipal = new JTextField();

            textFieldOcupacaoPrincipal.setBounds(
                230, 265, 250, 25
            );
        }

        return textFieldOcupacaoPrincipal;
    }


    public JLabel getLabelOcupacaoPrincipal() {

        if (labelOcupacaoPrincipal == null) {

            labelOcupacaoPrincipal =
                new JLabel("Ocupação Principal:");

            labelOcupacaoPrincipal.setBounds(
                40, 265, 180, 25
            );
        }

        return labelOcupacaoPrincipal;
    }


    public JTextField getTextFieldFaturamentoAnual() {

        if (textFieldFaturamentoAnual == null) {

            textFieldFaturamentoAnual = new JTextField();

            textFieldFaturamentoAnual.setBounds(
                230, 300, 250, 25
            );
        }

        return textFieldFaturamentoAnual;
    }


    public JLabel getLabelFaturamentoAnual() {

        if (labelFaturamentoAnual == null) {

            labelFaturamentoAnual =
                new JLabel("Faturamento Anual:");

            labelFaturamentoAnual.setBounds(
                40, 300, 180, 25
            );
        }

        return labelFaturamentoAnual;
    }


    public JTextField getTextFieldFaturamentoMensal() {

        if (textFieldFaturamentoMensal == null) {

            textFieldFaturamentoMensal = new JTextField();

            textFieldFaturamentoMensal.setBounds(
                230, 335, 250, 25
            );
        }

        return textFieldFaturamentoMensal;
    }


    public JLabel getLabelFaturamentoMensal() {

        if (labelFaturamentoMensal == null) {

            labelFaturamentoMensal =
                new JLabel("Faturamento Mensal:");

            labelFaturamentoMensal.setBounds(
                40, 335, 180, 25
            );
        }

        return labelFaturamentoMensal;
    }


    public JTextField getTextFieldValorMensalDoDAS() {

        if (textFieldValorMensalDoDAS == null) {

            textFieldValorMensalDoDAS = new JTextField();

            textFieldValorMensalDoDAS.setBounds(
                230, 370, 250, 25
            );
        }

        return textFieldValorMensalDoDAS;
    }


    public JLabel getLabelValorMensalDoDAS() {

        if (labelValorMensalDoDAS == null) {

            labelValorMensalDoDAS =
                new JLabel("Valor Mensal do DAS:");

            labelValorMensalDoDAS.setBounds(
                40, 370, 180, 25
            );
        }

        return labelValorMensalDoDAS;
    }


    public JTextField getTextFieldIndicadorDeExistenciaDeFuncionarios() {

        if (textFieldIndicadorDeExistenciaDeFuncionarios == null) {

            textFieldIndicadorDeExistenciaDeFuncionarios =
                new JTextField();

            textFieldIndicadorDeExistenciaDeFuncionarios.setBounds(
                230, 405, 250, 25
            );
        }

        return textFieldIndicadorDeExistenciaDeFuncionarios;
    }


    public JLabel getLabelIndicadorDeExistenciaDeFuncionarios() {

        if (labelIndicadorDeExistenciaDeFuncionarios == null) {

            labelIndicadorDeExistenciaDeFuncionarios =
                new JLabel("Possui Funcionários?");

            labelIndicadorDeExistenciaDeFuncionarios.setBounds(
                40, 405, 180, 25
            );
        }

        return labelIndicadorDeExistenciaDeFuncionarios;
    }


    public JTextField getTextFieldDataDeAbertura() {

        if (textFieldDataDeAbertura == null) {

            textFieldDataDeAbertura = new JTextField();

            textFieldDataDeAbertura.setBounds(
                230, 440, 250, 25
            );
        }

        return textFieldDataDeAbertura;
    }


    public JLabel getLabelDataDeAbertura() {

        if (labelDataDeAbertura == null) {

            labelDataDeAbertura =
                new JLabel("Data de Abertura:");

            labelDataDeAbertura.setBounds(
                40, 440, 180, 25
            );
        }

        return labelDataDeAbertura;
    }


    public JButton getJButton() {

        if (cadastrar == null) {

            cadastrar = new JButton("Cadastrar");

            cadastrar.setBounds(
                230, 480, 120, 30
            );
        }

        return cadastrar;
    }

    public JButton getJButtonVoltar() {
         if (voltar == null) { 
            voltar = new JButton("Voltar"); voltar.setBounds( 360, 480, 120, 30 ); 
            voltar.addActionListener(e -> { frame.setContentPane( new MenuInicial(frame) ); frame.revalidate(); frame.repaint(); }
        ); 
        }
          return voltar; 
        }

}

