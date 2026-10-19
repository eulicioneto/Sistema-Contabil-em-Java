package model;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * www.gov.br foi consultado para cálculos de IRPJ, CSLL e Lucro Real.
 * EmpresaLucroReal
 */

public class EmpresaLucroReal {
    
    private String cnpj; 
    private String razaoSocial;
    private String nomeFantasia;
    private String municipio;
    private String estado;
    private String atividadePrincipal;
    private BigDecimal receitaBrutaAnual;
    private BigDecimal despesasDedutiveis;
    private BigDecimal lucroContabil;
    private BigDecimal lucroAjustado;
    private BigDecimal prejuizoFiscal;
    private BigDecimal aliquotaDoIRPJ;
    private BigDecimal aliquotaDaCSLL;
    private LocalDate dataDeInicioAtividade;

    public EmpresaLucroReal(){};

    public EmpresaLucroReal(String cnpj, String razaoSocial, String nomeFantasia, String municipio, String estado, String atividadePrincipal, BigDecimal receitaBrutaAnual, BigDecimal despesasDedutiveis, BigDecimal lucroContabil, BigDecimal lucroAjustado, BigDecimal prejuizoFiscal, BigDecimal aliquotaDoIRPJ, BigDecimal aliquotaDaCSLL, LocalDate dataDeInicioAtividade) {
        setCnpj(cnpj);
        setRazaoSocial(razaoSocial);
        setNomeFantasia(nomeFantasia);
        setMunicipio(municipio);
        setEstado(estado);
        setAtividadePrincipal(atividadePrincipal);
        setReceitaBrutaAnual(receitaBrutaAnual);
        setDespesasDedutiveis(despesasDedutiveis);
        setLucroContabil(lucroContabil);
        setLucroAjustado(lucroAjustado);
        setPrejuizoFiscal(prejuizoFiscal);
        setAliquotaDoIRPJ(aliquotaDoIRPJ);
        setAliquotaDaCSLL(aliquotaDaCSLL);
        setDataDeInicioAtividade(dataDeInicioAtividade);
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

    public BigDecimal getReceitaBrutaAnual() {
        return receitaBrutaAnual;
    }

    public BigDecimal getDespesasDedutiveis() {
        return despesasDedutiveis;
    }

    public BigDecimal getLucroContabil() {
        return lucroContabil;
    }

    public BigDecimal getLucroAjustado() {
        return lucroAjustado;
    }

    public BigDecimal getPrejuizoFiscal() {
        return prejuizoFiscal;
    }

    public BigDecimal getAliquotaDoIRPJ() {
        return aliquotaDoIRPJ;
    }

    public BigDecimal getAliquotaDaCSLL() {
        return aliquotaDaCSLL;
    }

    public LocalDate getDataDeInicioAtividade() {
        return dataDeInicioAtividade;
    }

    public void setCnpj(String cnpj) {
        if(cnpj != null && !cnpj.isEmpty()){
        this.cnpj = cnpj;
    }else{
        System.out.println("O CNPJ não pode ser nulo ou vazio.");
    }
}

    public void setRazaoSocial(String razaoSocial) {
        if(razaoSocial != null && !razaoSocial.isEmpty()){
            this.razaoSocial = razaoSocial;
        }else{
            System.out.println("A razão social não pode ser nula ou vazia.");
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

    public void setReceitaBrutaAnual(BigDecimal receitaBrutaAnual) {
        if(receitaBrutaAnual.compareTo(new BigDecimal("0")) >= 0){
            this.receitaBrutaAnual = receitaBrutaAnual;
        }else{
            System.out.println("A receita bruta anual não pode ser negativa.");
        }
    }

    public void setDespesasDedutiveis(BigDecimal despesasDedutiveis) {
        if(despesasDedutiveis.compareTo(new BigDecimal("0")) >= 0){
            this.despesasDedutiveis = despesasDedutiveis;
        }else{
            System.out.println("As despesas dedutíveis não podem ser negativas.");
        }
    }

    public void setLucroContabil(BigDecimal lucroContabil) {
        if(lucroContabil.compareTo(new BigDecimal("0")) > 0 || lucroContabil.compareTo(new BigDecimal("0")) < 0){//Duvida aqui. Nao pode ser ZERO?
            this.lucroContabil = lucroContabil;
        }else{
            System.out.println("O lucro contábil não pode ser zero.");
        }
    }

    //Esse metodo nao precisa de nenhuma validacao?
    public void setLucroAjustado(BigDecimal lucroAjustado) {
        if(lucroAjustado.compareTo(new BigDecimal("0")) >= 0){
            this.lucroAjustado = lucroAjustado;
        }else{
            System.out.println("O lucro ajustado não pode ser negativo.");
        }
    }

    public void setPrejuizoFiscal(BigDecimal prejuizoFiscal) {
        if(prejuizoFiscal.compareTo(new BigDecimal("0")) >= 0){
            this.prejuizoFiscal = prejuizoFiscal;
        }else{
            System.out.println("O prejuízo fiscal não pode ser negativo.");
        }
    }

    public void setAliquotaDoIRPJ(BigDecimal aliquotaDoIRPJ) {
        if(aliquotaDoIRPJ.compareTo(new BigDecimal("0")) >= 0){
            this.aliquotaDoIRPJ = aliquotaDoIRPJ;
        }else{
            System.out.println("A alíquota do IRPJ não pode ser negativa.");
        }
    }

    public void setAliquotaDaCSLL(BigDecimal aliquotaDaCSLL) {
        if(aliquotaDaCSLL.compareTo(new BigDecimal("0")) >= 0){
            this.aliquotaDaCSLL = aliquotaDaCSLL;
        }else{
            System.out.println("A alíquota da CSLL não pode ser negativa.");
        }
    }

    public void setDataDeInicioAtividade(LocalDate dataDeInicioAtividade) {
        this.dataDeInicioAtividade = dataDeInicioAtividade;
    }

    public BigDecimal calcularLucroReal() {

    if (this.lucroAjustado == null || this.prejuizoFiscal == null) {
        System.out.println("Lucro ajustado ou prejuízo fiscal não informado.");
        return BigDecimal.ZERO;
    }
    //Subtraindo o lucro ajustado com o prejuízo fiscal e atribuindo o resultado a um objeto BigDecimal chamado lucroReal
    BigDecimal lucroReal = this.lucroAjustado.subtract(this.prejuizoFiscal);

    //Verificando se o objeto Lucro Real possui valor negativo. Caso sim, o método retorna 0. Finalizando o método.
    if (lucroReal.compareTo(BigDecimal.ZERO) < 0) {
        return BigDecimal.ZERO;
    }

    return lucroReal;
}

    public BigDecimal calcularIRPJ() {

    BigDecimal lucroReal = calcularLucroReal();

    if (this.aliquotaDoIRPJ == null) {
        System.out.println("Alíquota do IRPJ não informada.");
        return BigDecimal.ZERO;
    }

    return lucroReal.multiply(this.aliquotaDoIRPJ);
}
    

    public BigDecimal calcularCSLL() {

    BigDecimal lucroReal = calcularLucroReal();

    if (this.aliquotaDaCSLL == null) {
        System.out.println("Alíquota da CSLL não informada.");
        return BigDecimal.ZERO;
    }

    return lucroReal.multiply(this.aliquotaDaCSLL);
}

    public void dadosDaEmpresa() {
         System.out.println("EmpresaLucroReal{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", municipio='" + municipio + '\'' +
                ", estado='" + estado + '\'' +
                ", atividadePrincipal='" + atividadePrincipal + '\'' +
                ", receitaBrutaAnual=" + receitaBrutaAnual +
                ", despesasDedutiveis=" + despesasDedutiveis +
                ", lucroContabil=" + lucroContabil +
                ", lucroAjustado=" + lucroAjustado +
                ", prejuizoFiscal=" + prejuizoFiscal +
                ", aliquotaDoIRPJ=" + aliquotaDoIRPJ +
                ", aliquotaDaCSLL=" + aliquotaDaCSLL +
                ", dataDeInicioAtividade=" + dataDeInicioAtividade +
                '}');
    }

}
