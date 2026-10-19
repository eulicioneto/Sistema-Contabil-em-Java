package model;
    import java.math.BigDecimal;
    import java.time.LocalDate;

    /**
     * Contabilidade.com -> Percentual de Presunção do Lucro Presumido: 8% para comércio, 32% para serviços e 8% para indústria.
     * 
     * EmpresaLucroPresumido
     */

    public class EmpresaLucroPresumido {

        private String cnpj;
        private String razaoSocial;
        private String nomeFantasia;
        private String municipio;
        private String estado;
        private String atividadePrincipal;
        private BigDecimal receitaBrutaAnual;
        private BigDecimal receitaBrutaTrimestral;
        private BigDecimal percentualDePresuncao;
        private BigDecimal aliquotaDoIRPJ;
        private BigDecimal aliquotaDaCSLL;
        private BigDecimal valorDoPIS;
        private BigDecimal valorDaCOFINS;
        private LocalDate dataDeInicioAtividade;

        public EmpresaLucroPresumido(){};

        public EmpresaLucroPresumido(String cnpj, String razaoSocial, String nomeFantasia, String municipio, String estado, String atividadePrincipal, BigDecimal receitaBrutaAnual, BigDecimal receitaBrutaTrimestral, BigDecimal percentualDePresuncao, BigDecimal aliquotaDoIRPJ, BigDecimal aliquotaDaCSLL, BigDecimal valorDoPIS, BigDecimal valorDaCOFINS, LocalDate dataDeInicioAtividade) {
            setCnpj(cnpj);
            setRazaoSocial(razaoSocial);
            setNomeFantasia(nomeFantasia);
            setMunicipio(municipio);
            setEstado(estado);
            setAtividadePrincipal(atividadePrincipal);
            setReceitaBrutaAnual(receitaBrutaAnual);
            setReceitaBrutaTrimestral(receitaBrutaTrimestral);
            setPercentualDePresuncao(percentualDePresuncao);
            setAliquotaDoIRPJ(aliquotaDoIRPJ);
            setAliquotaDaCSLL(aliquotaDaCSLL);
            setValorDoPIS(valorDoPIS);
            setValorDaCOFINS(valorDaCOFINS);
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

        public BigDecimal getReceitaBrutaTrimestral() {
            return receitaBrutaTrimestral;
        }

        public BigDecimal getPercentualDePresuncao() {
            return percentualDePresuncao;
        }

        public BigDecimal getAliquotaDoIRPJ() {
            return aliquotaDoIRPJ;
        }

        public BigDecimal getAliquotaDaCSLL() {
            return aliquotaDaCSLL;
        }

        public BigDecimal getValorDoPIS() {
            return valorDoPIS;
        }

        public BigDecimal getValorDaCOFINS() {
            return valorDaCOFINS;
        }

        public LocalDate getDataDeInicioAtividade() {
            return dataDeInicioAtividade;
        }

        public void setCnpj(String cnpj) {
            if(cnpj != null && !cnpj.isEmpty()) {
                this.cnpj = cnpj;
            }else{
                System.out.println("CNPJ inválido. O valor não pode ser nulo ou vazio.");
            }
        }

        public void setRazaoSocial(String razaoSocial) {
            if(razaoSocial != null && !razaoSocial.isEmpty()) {
                this.razaoSocial = razaoSocial;
            }else{
                System.out.println("Razão Social inválida. O valor não pode ser nulo ou vazio.");
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
            if(receitaBrutaAnual.compareTo(new BigDecimal("0")) >= 0) {
                this.receitaBrutaAnual = receitaBrutaAnual;
            } else {
                System.out.println("Receita Bruta Anual não pode ser negativa.");
            }
        }

        public void setReceitaBrutaTrimestral(BigDecimal receitaBrutaTrimestral) {
            if(receitaBrutaTrimestral.compareTo(new BigDecimal("0")) >= 0) {
                this.receitaBrutaTrimestral = receitaBrutaTrimestral;
            } else {
                System.out.println("Receita Bruta Trimestral não pode ser negativa.");
            }
        }

        public void setPercentualDePresuncao(BigDecimal percentualDePresuncao) {
            if(percentualDePresuncao.compareTo(new BigDecimal("0")) >= 0 && percentualDePresuncao.compareTo(new BigDecimal("100")) <= 0) {
                this.percentualDePresuncao = percentualDePresuncao;
            } else {
                System.out.println("Percentual de Presunção não pode ser negativo ou maior que 100.");
            }
        }

        public void setAliquotaDoIRPJ(BigDecimal aliquotaDoIRPJ) {
            if(aliquotaDoIRPJ.compareTo(new BigDecimal("0")) >= 0) {
                this.aliquotaDoIRPJ = aliquotaDoIRPJ;
            } else {
                System.out.println("Alíquota do IRPJ não pode ser negativa.");
            }
        }

        public void setAliquotaDaCSLL(BigDecimal aliquotaDaCSLL) {
            if(aliquotaDaCSLL.compareTo(new BigDecimal("0")) >= 0) {
                this.aliquotaDaCSLL = aliquotaDaCSLL;
            } else {
                System.out.println("Alíquota da CSLL não pode ser negativa.");
            }
        }

        public void setValorDoPIS(BigDecimal valorDoPIS) {
            if(valorDoPIS.compareTo(new BigDecimal("0")) >= 0) {
                this.valorDoPIS = valorDoPIS;
            } else {
                System.out.println("Valor do PIS não pode ser negativo.");
            }
        }

        public void setValorDaCOFINS(BigDecimal valorDaCOFINS) {
            if(valorDaCOFINS.compareTo(new BigDecimal("0")) >= 0) {
                this.valorDaCOFINS = valorDaCOFINS;
            } else {
                System.out.println("Valor da COFINS não pode ser negativo.");
            }
        }

        public void setDataDeInicioAtividade(LocalDate dataDeInicioAtividade) {
            this.dataDeInicioAtividade = dataDeInicioAtividade;
        }

        public void dadosDaEmpresa() {
            System.out.println("EmpresaLucroPresumido{" +
                    "cnpj='" + cnpj + '\'' +
                    ", razaoSocial='" + razaoSocial + '\'' +
                    ", nomeFantasia='" + nomeFantasia + '\'' +
                    ", municipio='" + municipio + '\'' +
                    ", estado='" + estado + '\'' +
                    ", atividadePrincipal='" + atividadePrincipal + '\'' +
                    ", receitaBrutaAnual=" + receitaBrutaAnual +
                    ", receitaBrutaTrimestral=" + receitaBrutaTrimestral +
                    ", percentualDePresuncao=" + percentualDePresuncao +
                    ", aliquotaDoIRPJ=" + aliquotaDoIRPJ +
                    ", aliquotaDaCSLL=" + aliquotaDaCSLL +
                    ", valorDoPIS=" + valorDoPIS +
                    ", valorDaCOFINS=" + valorDaCOFINS +
                    ", dataDeInicioAtividade='" + dataDeInicioAtividade + '\'' +
                    '}');
        }

        public BigDecimal calcularBasePresumida() {
            if (this.receitaBrutaTrimestral == null ||
            this.percentualDePresuncao == null) {

            System.out.println(
                "Receita Bruta Trimestral ou Percentual de Presunção não foram definidos."
            );

            return BigDecimal.ZERO;
        }

        return this.receitaBrutaTrimestral
                .multiply(this.percentualDePresuncao);
        }

        public BigDecimal calcularTributosTrimestraisCSLL() {
            BigDecimal basePresumida = calcularBasePresumida();
            BigDecimal valorCSLL = basePresumida.multiply(this.aliquotaDaCSLL);
            return valorCSLL;
        }

        public BigDecimal calcularTributosTrimestraisIRPJ() {
            BigDecimal basePresumida = calcularBasePresumida();
            BigDecimal valorIRPJ = basePresumida.multiply(this.aliquotaDoIRPJ);
            return valorIRPJ;
        }

    }
