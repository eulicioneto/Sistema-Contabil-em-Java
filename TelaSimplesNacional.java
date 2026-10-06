import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;

/*JLabel titulo = new JLabel("Cadastro Empresa Lucro Real");
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setBounds(580, 50, 450, 40);
        painel.add(titulo);*/

public class TelaSimplesNacional extends JPanel {

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
    private JTextField textFieldFaturamentoAnual;
    private JLabel labelFaturamentoAnual;
    private JTextField textFieldFaturamentoMensal;
    private JLabel labelFaturamentoMensal;
    private JTextField textFieldAliquotaEfetiva;
    private JLabel labelValorAliquotaEfetiva;
    private JTextField textFieldIndicadorDeExistenciaDeFuncionarios;
    private JLabel labelIndicadorDeExistenciaDeFuncionarios;
    private JTextField textFieldDataDeInicioDeAtividade;
    private JLabel labelDataDeInicioDeAtividade;
    private JTextField textFieldNumeroDeFuncionarios;
    private JLabel labelNumeroDeFuncionarios;
    private JButton cadastrar;
    private JButton voltar;

    public TelaSimplesNacional(JFrame frame) {

        
        super();

        this.setLayout(null);

        this.frame = frame;

        this.add(getLabelTitulo());

        this.add(getTextFieldCnpj());
        this.add(getLabelCnpj());

        this.add(getTextFieldRazaoSocial());
        this.add(getLabelRazaoSocial());

        this.add(getTextFieldNomeFantasia());
        this.add(getLabelNomeFantasia());

        this.add(getTextFieldMunicipio());
        this.add(getLabelMunicipio());

        this.add(getTextFieldEstado());
        this.add(getLabelEstado());

        this.add(getTextFieldAtividadePrincipal());
        this.add(getLabelAtividadePrincipal());

        this.add(getTextFieldFaturamentoAnual());
        this.add(getLabelFaturamentoAnual());

        this.add(getTextFieldFaturamentoMensal());
        this.add(getLabelFaturamentoMensal());

        this.add(getTextFieldAliquotaEfetiva());
        this.add(getLabelValorAliquotaEfetiva());

        this.add(getTextFieldIndicadorDeExistenciaDeFuncionarios());
        this.add(getLabelIndicadorDeExistenciaDeFuncionarios());

        this.add(getTextFieldDataDeInicioDeAtividade());
        this.add(getLabelDataDeInicioDeAtividade());

        this.add(getTextFieldNumeroDeFuncionarios());
        this.add(getLabelNumeroDeFuncionarios());
        this.add(getJButton());
        this.add(getJButtonVoltar());
    }

    public JLabel getLabelTitulo() {
    if (titulo == null) {
        titulo = new JLabel("Cadastro Empresa Simples Nacional");
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setBounds(120, 25, 500, 40);
    }

    return titulo;
}

    public JTextField getTextFieldCnpj() {
    if (textFieldCnpj == null) {
        textFieldCnpj = new JTextField();
        textFieldCnpj.setBounds(230, 90, 250, 25);
    }

    return textFieldCnpj;
}

public JLabel getLabelCnpj() {
    if (labelCnpj == null) {
        labelCnpj = new JLabel("CNPJ:");
        labelCnpj.setBounds(40, 90, 180, 25);
    }

    return labelCnpj;
}

    public JTextField getTextFieldRazaoSocial() {
        if (textFieldRazaoSocial == null) {
            textFieldRazaoSocial = new JTextField();
            textFieldRazaoSocial.setBounds(230, 125, 250, 25);
        }

        return textFieldRazaoSocial;
    }

    public JLabel getLabelRazaoSocial() {
        if (labelRazaoSocial == null) {
            labelRazaoSocial = new JLabel("Razão Social:");
            labelRazaoSocial.setBounds(40, 125, 180, 25);
        }

        return labelRazaoSocial;
    }

    public JTextField getTextFieldNomeFantasia() {
        if (textFieldNomeFantasia == null) {
            textFieldNomeFantasia = new JTextField();
            textFieldNomeFantasia.setBounds(230, 160, 250, 25);
        }

        return textFieldNomeFantasia;
    }

    public JLabel getLabelNomeFantasia() {
        if (labelNomeFantasia == null) {
            labelNomeFantasia = new JLabel("Nome Fantasia:");
            labelNomeFantasia.setBounds(40, 160, 180, 25);
        }

        return labelNomeFantasia;
    }

    // 
    public JTextField getTextFieldMunicipio() {
        if (textFieldMunicipio == null) {
            textFieldMunicipio = new JTextField();
            textFieldMunicipio.setBounds(230, 195, 250, 25);
        }

        return textFieldMunicipio;
    }

    public JLabel getLabelMunicipio() {
        if (labelMunicipio == null) {
            labelMunicipio = new JLabel("Município:");
            labelMunicipio.setBounds(40, 195, 180, 25);
        }

        return labelMunicipio;
    }

    
    public JTextField getTextFieldEstado() {
        if (textFieldEstado == null) {
            textFieldEstado = new JTextField();
            textFieldEstado.setBounds(230, 230, 250, 25);
        }

        return textFieldEstado;
    }

    public JLabel getLabelEstado() {
        if (labelEstado == null) {
            labelEstado = new JLabel("Estado:");
            labelEstado.setBounds(40, 230, 180, 25);
        }

        return labelEstado;
    }

    public JTextField getTextFieldAtividadePrincipal() {
        if (textFieldAtividadePrincipal == null) {
            textFieldAtividadePrincipal = new JTextField();
            textFieldAtividadePrincipal.setBounds(230, 265, 250, 25);
        }

        return textFieldAtividadePrincipal;
    }

    public JLabel getLabelAtividadePrincipal() {
        if (labelAtividadePrincipal == null) {
            labelAtividadePrincipal = new JLabel("Atividade Principal:");
            labelAtividadePrincipal.setBounds(40, 265, 180, 25);
        }

        return labelAtividadePrincipal;
    }

    public JTextField getTextFieldFaturamentoAnual() {
    if (textFieldFaturamentoAnual == null) {
        textFieldFaturamentoAnual = new JTextField();
        textFieldFaturamentoAnual.setBounds(230, 300, 250, 25);
    }

    return textFieldFaturamentoAnual;
}

public JLabel getLabelFaturamentoAnual() {
    if (labelFaturamentoAnual == null) {
        labelFaturamentoAnual = new JLabel("Faturamento Anual:");
        labelFaturamentoAnual.setBounds(40, 300, 180, 25);
    }

    return labelFaturamentoAnual;
}

    public JTextField getTextFieldFaturamentoMensal() {
    if (textFieldFaturamentoMensal == null) {
        textFieldFaturamentoMensal = new JTextField();
        textFieldFaturamentoMensal.setBounds(230, 335, 250, 25);
    }

    return textFieldFaturamentoMensal;
}

public JLabel getLabelFaturamentoMensal() {
    if (labelFaturamentoMensal == null) {
        labelFaturamentoMensal = new JLabel("Faturamento Mensal:");
        labelFaturamentoMensal.setBounds(40, 335, 180, 25);
    }

    return labelFaturamentoMensal;
}

    public JTextField getTextFieldAliquotaEfetiva() {
    if (textFieldAliquotaEfetiva == null) {
        textFieldAliquotaEfetiva = new JTextField();
        textFieldAliquotaEfetiva.setBounds(230, 370, 250, 25);
    }

    return textFieldAliquotaEfetiva;
}

public JLabel getLabelValorAliquotaEfetiva() {
    if (labelValorAliquotaEfetiva == null) {
        labelValorAliquotaEfetiva = new JLabel("Alíquota Efetiva:");
        labelValorAliquotaEfetiva.setBounds(40, 370, 180, 25);
    }

    return labelValorAliquotaEfetiva;
}

    public JTextField getTextFieldDataDeInicioDeAtividade() {
    if (textFieldDataDeInicioDeAtividade == null) {
        textFieldDataDeInicioDeAtividade = new JTextField();
        textFieldDataDeInicioDeAtividade.setBounds(230, 440, 250, 25);
    }

    return textFieldDataDeInicioDeAtividade;
}

public JLabel getLabelDataDeInicioDeAtividade() {
    if (labelDataDeInicioDeAtividade == null) {
        labelDataDeInicioDeAtividade =
                new JLabel("Início da Atividade:");

        labelDataDeInicioDeAtividade.setBounds(
                40, 440, 180, 25
        );
    }

    return labelDataDeInicioDeAtividade;
}
    
    public JTextField getTextFieldIndicadorDeExistenciaDeFuncionarios() {
    if (textFieldIndicadorDeExistenciaDeFuncionarios == null) {
        textFieldIndicadorDeExistenciaDeFuncionarios = new JTextField();
        textFieldIndicadorDeExistenciaDeFuncionarios.setBounds(230, 405, 250, 25);
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

    public JTextField getTextFieldNumeroDeFuncionarios() {
    if (textFieldNumeroDeFuncionarios == null) {
        textFieldNumeroDeFuncionarios = new JTextField();
        textFieldNumeroDeFuncionarios.setBounds(230, 475, 250, 25);
    }

    return textFieldNumeroDeFuncionarios;
}

public JLabel getLabelNumeroDeFuncionarios() {
    if (labelNumeroDeFuncionarios == null) {
        labelNumeroDeFuncionarios =
                new JLabel("Número de Funcionários:");

        labelNumeroDeFuncionarios.setBounds(
                40, 475, 180, 25
        );
    }

    return labelNumeroDeFuncionarios;
}

    public JButton getJButton() {
    if (cadastrar == null) {
        cadastrar = new JButton("Cadastrar");
        cadastrar.setBounds(230, 520, 120, 30);
    }

    return cadastrar;
}

    public JButton getJButtonVoltar() {
         if (voltar == null) { 
            voltar = new JButton("Voltar"); voltar.setBounds( 360, 520, 120, 30 ); 
            voltar.addActionListener(e -> { frame.setContentPane( new MenuInicial(frame) ); frame.revalidate(); frame.repaint(); }
        ); 
        }
          return voltar; 
        }

}