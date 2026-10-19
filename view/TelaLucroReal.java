package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaLucroReal extends JPanel {

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

    private JTextField textFieldAtividadePrincipal;
    private JLabel labelAtividadePrincipal;

    private JTextField textFieldReceitaBrutaAnual;
    private JLabel labelReceitaBrutaAnual;

    private JTextField textFieldDespesasDedutiveis;
    private JLabel labelDespesasDedutiveis;

    private JTextField textFieldLucroContabil;
    private JLabel labelLucroContabil;

    private JTextField textFieldLucroAjustado;
    private JLabel labelLucroAjustado;

    private JTextField textFieldPrejuizoFiscal;
    private JLabel labelPrejuizoFiscal;

    private JTextField textFieldAliquotaIrpj;
    private JLabel labelAliquotaIrpj;

    private JTextField textFieldAliquotaCsll;
    private JLabel labelAliquotaCsll;

    private JTextField textFieldDataInicio;
    private JLabel labelDataInicio;

    private JButton cadastrar;
    private JButton voltar;


    public TelaLucroReal(JFrame frame) {

        super();

        this.setLayout(null);

        this.frame = frame;

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

        // Atividade Principal
        this.add(getLabelAtividadePrincipal());
        this.add(getTextFieldAtividadePrincipal());

        // Receita Bruta Anual
        this.add(getLabelReceitaBrutaAnual());
        this.add(getTextFieldReceitaBrutaAnual());

        // Despesas Dedutíveis
        this.add(getLabelDespesasDedutiveis());
        this.add(getTextFieldDespesasDedutiveis());

        // Lucro Contábil
        this.add(getLabelLucroContabil());
        this.add(getTextFieldLucroContabil());

        // Lucro Ajustado
        this.add(getLabelLucroAjustado());
        this.add(getTextFieldLucroAjustado());

        // Prejuízo Fiscal
        this.add(getLabelPrejuizoFiscal());
        this.add(getTextFieldPrejuizoFiscal());

        // Alíquota IRPJ
        this.add(getLabelAliquotaIrpj());
        this.add(getTextFieldAliquotaIrpj());

        // Alíquota CSLL
        this.add(getLabelAliquotaCsll());
        this.add(getTextFieldAliquotaCsll());

        // Data de Início
        this.add(getLabelDataInicio());
        this.add(getTextFieldDataInicio());

        // Botão
        this.add(getJButton());
        this.add(getJButtonVoltar());
    }


    public JLabel getLabelTitulo() {

        if (titulo == null) {

            titulo = new JLabel("Cadastro Empresa Lucro Real");

            titulo.setFont(
                new Font("Arial", Font.BOLD, 28)
            );

            titulo.setBounds(
                120, 25, 450, 40
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


    public JTextField getTextFieldAtividadePrincipal() {

        if (textFieldAtividadePrincipal == null) {

            textFieldAtividadePrincipal = new JTextField();

            textFieldAtividadePrincipal.setBounds(
                230, 265, 250, 25
            );
        }

        return textFieldAtividadePrincipal;
    }


    public JLabel getLabelAtividadePrincipal() {

        if (labelAtividadePrincipal == null) {

            labelAtividadePrincipal =
                new JLabel("Atividade Principal:");

            labelAtividadePrincipal.setBounds(
                40, 265, 180, 25
            );
        }

        return labelAtividadePrincipal;
    }


    public JTextField getTextFieldReceitaBrutaAnual() {

        if (textFieldReceitaBrutaAnual == null) {

            textFieldReceitaBrutaAnual = new JTextField();

            textFieldReceitaBrutaAnual.setBounds(
                230, 300, 250, 25
            );
        }

        return textFieldReceitaBrutaAnual;
    }


    public JLabel getLabelReceitaBrutaAnual() {

        if (labelReceitaBrutaAnual == null) {

            labelReceitaBrutaAnual =
                new JLabel("Receita Bruta Anual:");

            labelReceitaBrutaAnual.setBounds(
                40, 300, 180, 25
            );
        }

        return labelReceitaBrutaAnual;
    }


    public JTextField getTextFieldDespesasDedutiveis() {

        if (textFieldDespesasDedutiveis == null) {

            textFieldDespesasDedutiveis = new JTextField();

            textFieldDespesasDedutiveis.setBounds(
                230, 335, 250, 25
            );
        }

        return textFieldDespesasDedutiveis;
    }


    public JLabel getLabelDespesasDedutiveis() {

        if (labelDespesasDedutiveis == null) {

            labelDespesasDedutiveis =
                new JLabel("Despesas Dedutíveis:");

            labelDespesasDedutiveis.setBounds(
                40, 335, 180, 25
            );
        }

        return labelDespesasDedutiveis;
    }


    public JTextField getTextFieldLucroContabil() {

        if (textFieldLucroContabil == null) {

            textFieldLucroContabil = new JTextField();

            textFieldLucroContabil.setBounds(
                230, 370, 250, 25
            );
        }

        return textFieldLucroContabil;
    }


    public JLabel getLabelLucroContabil() {

        if (labelLucroContabil == null) {

            labelLucroContabil =
                new JLabel("Lucro Contábil:");

            labelLucroContabil.setBounds(
                40, 370, 180, 25
            );
        }

        return labelLucroContabil;
    }


    public JTextField getTextFieldLucroAjustado() {

        if (textFieldLucroAjustado == null) {

            textFieldLucroAjustado = new JTextField();

            textFieldLucroAjustado.setBounds(
                230, 405, 250, 25
            );
        }

        return textFieldLucroAjustado;
    }


    public JLabel getLabelLucroAjustado() {

        if (labelLucroAjustado == null) {

            labelLucroAjustado =
                new JLabel("Lucro Ajustado:");

            labelLucroAjustado.setBounds(
                40, 405, 180, 25
            );
        }

        return labelLucroAjustado;
    }


    public JTextField getTextFieldPrejuizoFiscal() {

        if (textFieldPrejuizoFiscal == null) {

            textFieldPrejuizoFiscal = new JTextField();

            textFieldPrejuizoFiscal.setBounds(
                230, 440, 250, 25
            );
        }

        return textFieldPrejuizoFiscal;
    }


    public JLabel getLabelPrejuizoFiscal() {

        if (labelPrejuizoFiscal == null) {

            labelPrejuizoFiscal =
                new JLabel("Prejuízo Fiscal:");

            labelPrejuizoFiscal.setBounds(
                40, 440, 180, 25
            );
        }

        return labelPrejuizoFiscal;
    }


    public JTextField getTextFieldAliquotaIrpj() {

        if (textFieldAliquotaIrpj == null) {

            textFieldAliquotaIrpj = new JTextField();

            textFieldAliquotaIrpj.setBounds(
                230, 475, 250, 25
            );
        }

        return textFieldAliquotaIrpj;
    }


    public JLabel getLabelAliquotaIrpj() {

        if (labelAliquotaIrpj == null) {

            labelAliquotaIrpj =
                new JLabel("Alíquota IRPJ:");

            labelAliquotaIrpj.setBounds(
                40, 475, 180, 25
            );
        }

        return labelAliquotaIrpj;
    }


    public JTextField getTextFieldAliquotaCsll() {

        if (textFieldAliquotaCsll == null) {

            textFieldAliquotaCsll = new JTextField();

            textFieldAliquotaCsll.setBounds(
                230, 510, 250, 25
            );
        }

        return textFieldAliquotaCsll;
    }


    public JLabel getLabelAliquotaCsll() {

        if (labelAliquotaCsll == null) {

            labelAliquotaCsll =
                new JLabel("Alíquota CSLL:");

            labelAliquotaCsll.setBounds(
                40, 510, 180, 25
            );
        }

        return labelAliquotaCsll;
    }


    public JTextField getTextFieldDataInicio() {

        if (textFieldDataInicio == null) {

            textFieldDataInicio = new JTextField();

            textFieldDataInicio.setBounds(
                230, 545, 250, 25
            );
        }

        return textFieldDataInicio;
    }


    public JLabel getLabelDataInicio() {

        if (labelDataInicio == null) {

            labelDataInicio =
                new JLabel("Data de Início:");

            labelDataInicio.setBounds(
                40, 545, 180, 25
            );
        }

        return labelDataInicio;
    }


    public JButton getJButton() {

        if (cadastrar == null) {

            cadastrar = new JButton("Cadastrar");

            cadastrar.setBounds(
                230, 585, 120, 30
            );
        }

        return cadastrar;
    }


    public JButton getJButtonVoltar() {
         if (voltar == null) { 
            voltar = new JButton("Voltar"); voltar.setBounds( 360, 585, 120, 30 ); 
        }
          return voltar; 
        }

}
