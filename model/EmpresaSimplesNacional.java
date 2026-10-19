package model;
import java.math.BigDecimal;
import java.time.LocalDate;

public class EmpresaSimplesNacional{

    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String municipio;
    private String estado;
    private String atividadePrincipal;
    private BigDecimal faturamentoAnual;
    private BigDecimal faturamentoMensal;
    private BigDecimal aliquotaEfetiva;
    private LocalDate dataDeInicioAtividade;
    private int numeroDeFuncionarios;

    public EmpresaSimplesNacional(){};

    public EmpresaSimplesNacional(String cnpj, String razaoSocial, String nomeFantasia, String municipio, String estado, String atividadePrincipal, BigDecimal faturamentoAnual, BigDecimal faturamentoMensal, BigDecimal aliquotaEfetiva, LocalDate dataDeInicioAtividade, int numeroDeFuncionarios) {
       setCnpj(cnpj);
       setRazaoSocial(razaoSocial);
       setNomeFantasia(nomeFantasia);
       setMunicipio(municipio);
       setEstado(estado);
       setAtividadePrincipal(atividadePrincipal);
       setFaturamentoAnual(faturamentoAnual);
       setFaturamentoMensal(faturamentoMensal);
       setAliquotaEfetiva(aliquotaEfetiva);
       setDataDeInicioAtividade(dataDeInicioAtividade);
       setNumeroDeFuncionarios(numeroDeFuncionarios);
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getEstado() {
        return estado;
    }

    public String getAtividadePrincipal() {
        return atividadePrincipal;
    }

    public BigDecimal getFaturamentoAnual() {
        return faturamentoAnual;
    }

    public BigDecimal getFaturamentoMensal() {
        return faturamentoMensal;
    }

    public BigDecimal getAliquotaEfetiva() {
        return aliquotaEfetiva;
    }

    
    public LocalDate getDataDeInicioAtividade() {
        return dataDeInicioAtividade;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setCnpj(String cnpj) {
        if(cnpj != null && !cnpj.isEmpty()) {
            this.cnpj = cnpj;
        } else {
            System.out.println("CNPJ não pode ser nulo ou vazio.");
        }
    }

    public void setRazaoSocial(String razaoSocial) {
        if(razaoSocial != null && !razaoSocial.isEmpty()) {
            this.razaoSocial = razaoSocial;
        } else {
            System.out.println("Razão social não pode ser nula ou vazia.");
        }
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setAtividadePrincipal(String atividadePrincipal) {
        this.atividadePrincipal = atividadePrincipal;
    }

    public void setFaturamentoAnual(BigDecimal faturamentoAnual) {
        if(faturamentoAnual.compareTo(new BigDecimal("0")) >= 0){
            this.faturamentoAnual = faturamentoAnual;
        } else {
            System.out.println("Faturamento anual não pode ser negativo.");
        }
    }

    public void setFaturamentoMensal(BigDecimal faturamentoMensal) {
        if(faturamentoMensal.compareTo(new BigDecimal("0")) >= 0){ /*O Método compareTo
            serve para comparar objetos do tipo BigDecimal. Nesse caso, foi usado para comparar o faturamento mensal com 0. */
            this.faturamentoMensal = faturamentoMensal;
        } else {
            System.out.println("Faturamento mensal não pode ser negativo.");
        }
    }

    public void setAliquotaEfetiva(BigDecimal aliquotaEfetiva) {
        if(aliquotaEfetiva.compareTo(new BigDecimal("0")) >= 0){
            this.aliquotaEfetiva = aliquotaEfetiva;
        } else {
            System.out.println("Alíquota efetiva não pode ser negativa.");
        }
    }

    public void setDataDeInicioAtividade(LocalDate dataDeInicioAtividade) {
        this.dataDeInicioAtividade = dataDeInicioAtividade;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        if(numeroDeFuncionarios >= 0){
            this.numeroDeFuncionarios = numeroDeFuncionarios;
        } else {
            System.out.println("Número de funcionários não pode ser negativo.");
        }
        }

    public BigDecimal calculoTributoMensal(){
        //Consulta do cálcuo feita no site agilize.com.br no dia 06/09/26
        BigDecimal tributoMensal = this.getAliquotaEfetiva().multiply(this.getFaturamentoMensal());
        return tributoMensal;
    }

    public void dadosDaEmpresa() {
                 System.out.println("EmpresaSimplesNacional{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", municipio='" + municipio + '\'' +
                ", estado='" + estado + '\'' +
                ", atividadePrincipal='" + atividadePrincipal + '\'' +
                ", faturamentoAnual=" + faturamentoAnual +
                ", faturamentoMensal=" + faturamentoMensal +
                ", aliquotaEfetiva=" + aliquotaEfetiva +
                ", dataDeInicioAtividade=" + dataDeInicioAtividade +
                ", numeroDeFuncionarios=" + numeroDeFuncionarios +
                '}');
    }

    public void verificacaoDeEnquadramento(BigDecimal faturamentoAnual){

        if(faturamentoAnual.compareTo(new BigDecimal("4800000")) <= 0){ /* Consulta do Limite da
            Simples Nacional foi no Site keevo.com.br e contaazul.com no dia 05/09/26 */
            System.out.println("A Empresa está dentro do Limite.");
        }else{
            System.out.println("O Limite foi excedido.");
        }

    }

}