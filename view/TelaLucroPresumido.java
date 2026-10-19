package view;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaLucroPresumido extends JPanel {

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

    private JTextField textFieldReceitaBrutaTrimestral;
    private JLabel labelReceitaBrutaTrimestral;

    private JTextField textFieldPercentualPresuncao;
    private JLabel labelPercentualPresuncao;

    private JTextField textFieldAliquotaIrpj;
    private JLabel labelAliquotaIrpj;

    private JTextField textFieldAliquotaCsll;
    private JLabel labelAliquotaCsll;

    private JTextField textFieldValorDoPIS;
    private JLabel labelValorDoPIS;

    private JTextField textFieldValorDaCOFINS;
    private JLabel labelValorDaCOFINS;

    private JTextField textFieldDataInicio;
    private JLabel labelDataInicio;

    private JButton cadastrar;
    private JButton voltar;


    public TelaLucroPresumido(JFrame frame) {

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

        // Atividade Principal
        this.add(getLabelAtividadePrincipal());
        this.add(getTextFieldAtividadePrincipal());

        // Receita Bruta Anual
        this.add(getLabelReceitaBrutaAnual());
        this.add(getTextFieldReceitaBrutaAnual());

        // Receita Bruta Trimestral
        this.add(getLabelReceitaBrutaTrimestral());
        this.add(getTextFieldReceitaBrutaTrimestral());

        // Percentual de Presunção
        this.add(getLabelPercentualPresuncao());
        this.add(getTextFieldPercentualPresuncao());

        // Alíquota IRPJ
        this.add(getLabelAliquotaIrpj());
        this.add(getTextFieldAliquotaIrpj());

        // Alíquota CSLL
        this.add(getLabelAliquotaCsll());
        this.add(getTextFieldAliquotaCsll());

        // Valor do PIS
        this.add(getLabelValorDoPIS());
        this.add(getTextFieldValorDoPIS());

        // Valor da COFINS
        this.add(getLabelValorDaCOFINS());
        this.add(getTextFieldValorDaCOFINS());

        // Data de Início
        this.add(getLabelDataInicio());
        this.add(getTextFieldDataInicio());

        // Botão
        this.add(getJButtonCadastrar());
        this.add(getJButtonVoltar());
    }


    public JLabel getLabelTitulo() {

        if (titulo == null) {

            titulo = new JLabel("Cadastro Empresa Lucro Presumido");

            titulo.setFont(
                new Font("Arial", Font.BOLD, 28)
            );

            titulo.setBounds(
                95, 25, 500, 40
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


    public JTextField getTextFieldReceitaBrutaTrimestral() {

        if (textFieldReceitaBrutaTrimestral == null) {

            textFieldReceitaBrutaTrimestral = new JTextField();

            textFieldReceitaBrutaTrimestral.setBounds(
                230, 335, 250, 25
            );
        }

        return textFieldReceitaBrutaTrimestral;
    }


    public JLabel getLabelReceitaBrutaTrimestral() {

        if (labelReceitaBrutaTrimestral == null) {

            labelReceitaBrutaTrimestral =
                new JLabel("Receita Bruta Trimestral:");

            labelReceitaBrutaTrimestral.setBounds(
                40, 335, 180, 25
            );
        }

        return labelReceitaBrutaTrimestral;
    }


    public JTextField getTextFieldPercentualPresuncao() {

        if (textFieldPercentualPresuncao == null) {

            textFieldPercentualPresuncao = new JTextField();

            textFieldPercentualPresuncao.setBounds(
                230, 370, 250, 25
            );
        }

        return textFieldPercentualPresuncao;
    }


    public JLabel getLabelPercentualPresuncao() {

        if (labelPercentualPresuncao == null) {

            labelPercentualPresuncao =
                new JLabel("Percentual de Presunção:");

            labelPercentualPresuncao.setBounds(
                40, 370, 180, 25
            );
        }

        return labelPercentualPresuncao;
    }


    public JTextField getTextFieldAliquotaIrpj() {

        if (textFieldAliquotaIrpj == null) {

            textFieldAliquotaIrpj = new JTextField();

            textFieldAliquotaIrpj.setBounds(
                230, 405, 250, 25
            );
        }

        return textFieldAliquotaIrpj;
    }


    public JLabel getLabelAliquotaIrpj() {

        if (labelAliquotaIrpj == null) {

            labelAliquotaIrpj =
                new JLabel("Alíquota do IRPJ:");

            labelAliquotaIrpj.setBounds(
                40, 405, 180, 25
            );
        }

        return labelAliquotaIrpj;
    }


    public JTextField getTextFieldAliquotaCsll() {

        if (textFieldAliquotaCsll == null) {

            textFieldAliquotaCsll = new JTextField();

            textFieldAliquotaCsll.setBounds(
                230, 440, 250, 25
            );
        }

        return textFieldAliquotaCsll;
    }


    public JLabel getLabelAliquotaCsll() {

        if (labelAliquotaCsll == null) {

            labelAliquotaCsll =
                new JLabel("Alíquota da CSLL:");

            labelAliquotaCsll.setBounds(
                40, 440, 180, 25
            );
        }

        return labelAliquotaCsll;
    }


    public JTextField getTextFieldValorDoPIS() {

        if (textFieldValorDoPIS == null) {

            textFieldValorDoPIS = new JTextField();

            textFieldValorDoPIS.setBounds(
                230, 475, 250, 25
            );
        }

        return textFieldValorDoPIS;
    }


    public JLabel getLabelValorDoPIS() {

        if (labelValorDoPIS == null) {

            labelValorDoPIS =
                new JLabel("Valor do PIS:");

            labelValorDoPIS.setBounds(
                40, 475, 180, 25
            );
        }

        return labelValorDoPIS;
    }


    public JTextField getTextFieldValorDaCOFINS() {

        if (textFieldValorDaCOFINS == null) {

            textFieldValorDaCOFINS = new JTextField();

            textFieldValorDaCOFINS.setBounds(
                230, 510, 250, 25
            );
        }

        return textFieldValorDaCOFINS;
    }


    public JLabel getLabelValorDaCOFINS() {

        if (labelValorDaCOFINS == null) {

            labelValorDaCOFINS =
                new JLabel("Valor da COFINS:");

            labelValorDaCOFINS.setBounds(
                40, 510, 180, 25
            );
        }

        return labelValorDaCOFINS;
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


    public JButton getJButtonCadastrar() {

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

