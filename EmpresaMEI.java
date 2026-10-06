import java.math.BigDecimal;
import java.time.LocalDate;
/**
 * O Limite Anual e valor referência do DAS mensal foi analisado no Site simplifique.conmatic.com.br
 * 
 * 
 */

public class EmpresaMEI{

    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String municipio;
    private String estado;
    private String ocupacaoPrincipal;
    private BigDecimal faturamentoAnual;
    private BigDecimal faturamentoMensal;
    private BigDecimal valorMensalDoDAS;
    private boolean indicadorDeExistenciaDeFuncionarios;
    private LocalDate dataDeAbertura;

    public EmpresaMEI(){}

    public EmpresaMEI(String cnpj, String razaoSocial, String nomeFantasia, String municipio, String estado, String ocupacaoPrincipal, BigDecimal faturamentoAnual, BigDecimal faturamentoMensal, BigDecimal valorMensalDoDAS, boolean indicadorDeExistenciaDeFuncionarios, LocalDate dataDeAbertura) {
        setCnpj(cnpj);
        setRazaoSocial(razaoSocial);
        setNomeFantasia(nomeFantasia);
        setMunicipio(municipio);
        setEstado(estado);
        setOcupacaoPrincipal(ocupacaoPrincipal);
        setFaturamentoAnual(faturamentoAnual);
        setFaturamentoMensal(faturamentoMensal);
        setValorMensalDoDAS(valorMensalDoDAS);
        setIndicadorDeExistenciaDeFuncionarios(indicadorDeExistenciaDeFuncionarios);
        setDataDeAbertura(dataDeAbertura);
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

    public String getOcupacaoPrincipal() {
        return ocupacaoPrincipal;
    }

    public BigDecimal getFaturamentoAnual() {
        return faturamentoAnual;
    }

    public BigDecimal getFaturamentoMensal(){
        return faturamentoMensal;
    }

    public BigDecimal getValorMensalDoDAS() {
        return valorMensalDoDAS;
    }

    public boolean getIndicadorDeExistenciaDeFuncionarios() {
        return indicadorDeExistenciaDeFuncionarios;
    }

    public LocalDate getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setCnpj(String cnpj) {
        if(cnpj != null && !cnpj.isEmpty()){
        this.cnpj = cnpj;
        }else{
            System.out.println("CNPJ não pode ser vazio ou nulo!");
        }
    }

    public void setRazaoSocial(String razaoSocial) {
        if(razaoSocial != null && !razaoSocial.isEmpty()){
        this.razaoSocial = razaoSocial;
        }else{
            System.out.println("Razão Social não pode ser vazio ou nulo!");
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

    public void setOcupacaoPrincipal(String ocupacaoPrincipal) {
        this.ocupacaoPrincipal = ocupacaoPrincipal;
    }

    public void setFaturamentoAnual(BigDecimal faturamentoAnual) {
        if(faturamentoAnual.compareTo(new BigDecimal("0")) >= 0){
            this.faturamentoAnual = faturamentoAnual;
        }else{
            System.out.println("Faturamento não pode ser negativo!");
        }
    }

    public void setFaturamentoMensal(BigDecimal faturamentoMensal) {
        if(faturamentoMensal.compareTo(new BigDecimal("0")) >= 0){
            this.faturamentoMensal = faturamentoMensal;
        }else{
            System.out.println("Faturamento não pode ser negativo!");
        }
    }

    public void setValorMensalDoDAS(BigDecimal valorMensalDoDAS) {
        if(valorMensalDoDAS.compareTo(new BigDecimal("0")) >= 0){
            this.valorMensalDoDAS = valorMensalDoDAS;
        }else{
            System.out.println("Valor do DAS não pode ser negativo.");
        }
    }

    public void setIndicadorDeExistenciaDeFuncionarios(boolean indicadorDeExistenciaDeFuncionarios) {
        this.indicadorDeExistenciaDeFuncionarios = indicadorDeExistenciaDeFuncionarios;
    }

    public void setDataDeAbertura(LocalDate dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public void verificacaoDeEnquadramento(){

        if(this.faturamentoAnual.compareTo(new BigDecimal("81000")) <= 0){
            System.out.println("A Empresa está dentro do Limite Anual do MEI.");
        }else{
            System.out.println("A Empresa excedeu o limite anual do MEI.");
        }

    }

    public void dadosDaEmpresa() {
         System.out.println("EmpresaMEI{" +
                 "cnpj='" + cnpj + '\'' +
                 ", razaoSocial='" + razaoSocial + '\'' +
                 ", nomeFantasia='" + nomeFantasia + '\'' +
                 ", municipio='" + municipio + '\'' +
                 ", estado='" + estado + '\'' +
                 ", ocupacaoPrincipal='" + ocupacaoPrincipal + '\'' +
                 ", faturamentoAnual=" + faturamentoAnual +
                 ", faturamentoMensal=" + faturamentoMensal +
                 ", valorMensalDoDAS=" + valorMensalDoDAS +
                 ", indicadorDeExistenciaDeFuncionarios=" + indicadorDeExistenciaDeFuncionarios +
                 ", dataDeAbertura='" + dataDeAbertura + '\'' +
                 '}');
     }
   }
    
