import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        EmpresaSimplesNacional empresaSimplesNacional = new EmpresaSimplesNacional(
                "12.345.678/0001-90",
                "Empresa Simples Nacional LTDA",
                "Empresa Simples",
                "São Paulo",
                "SP",
                "Comércio de Produtos Eletrônicos",
                new BigDecimal("1000000.00"),
                new BigDecimal("200000.00"),
                new BigDecimal("0.15"),
                LocalDate.of(2020, 1, 1),
                5);

        EmpresaLucroReal empresaLucroReal = new EmpresaLucroReal(
                "12.345.678/0001-90",
                "Empresa Lucro Real LTDA",
                "Empresa Lucro Real",
                "São Paulo",
                "SP",
                "Comércio de Produtos Eletrônicos",
                new BigDecimal("1000000.00"),
                new BigDecimal("200000.00"),
                new BigDecimal("800000.00"),
                new BigDecimal("750000.00"),
                new BigDecimal("0.00"),
                new BigDecimal("0.15"),
                new BigDecimal("0.09"),
                LocalDate.of(2020, 1, 1));

        EmpresaLucroPresumido empresaLucroPresumido = new EmpresaLucroPresumido(
                "12.345.678/0001-90",
                "Empresa Lucro Presumido LTDA",
                "Empresa Lucro Presumido",
                "São Paulo",
                "SP",
                "Comércio de Produtos Eletrônicos",
                new BigDecimal("1000000.00"),
                new BigDecimal("250000.00"),
                new BigDecimal("0.08"),
                new BigDecimal("0.15"),
                new BigDecimal("0.09"),
                new BigDecimal("0.00"),
                new BigDecimal("0.00"),
                LocalDate.of(2020, 1, 1));

        EmpresaMEI empresaMEI = new EmpresaMEI(
                "12.345.678/0001-90",
                "Empresa MEI LTDA",
                "Empresa MEI",
                "São Paulo",
                "SP",
                "Comércio de Produtos Eletrônicos",
                new BigDecimal("60000.00"),
                new BigDecimal("5000.00"),
                new BigDecimal("75.00"),
                false,
                LocalDate.of(2020, 1, 1));

        empresaSimplesNacional.dadosDaEmpresa();
        System.out.println("\n");
        empresaLucroReal.dadosDaEmpresa();
        System.out.println("\n");
        empresaLucroPresumido.dadosDaEmpresa();
        System.out.println("\n");
        empresaMEI.dadosDaEmpresa();

        // Empresa Simples Nacional - Testes
        BigDecimal tributoMensal = empresaSimplesNacional.calculoTributoMensal();
        System.out.println("O valor do tributo mensal da empresa Simples Nacional é: " + tributoMensal);
        empresaSimplesNacional.verificacaoDeEnquadramento(empresaSimplesNacional.getFaturamentoAnual());

        // Empresa MEI - Testes
        empresaMEI.verificacaoDeEnquadramento();
        empresaMEI.setValorMensalDoDAS(new BigDecimal("80.00"));

        // Empresa Lucro Presumido - Testes
        BigDecimal basePresumida = empresaLucroPresumido.calcularBasePresumida();
        System.out.println("A base presumida da empresa Lucro Presumido é: " + basePresumida);
        BigDecimal valorCSLL = empresaLucroPresumido.calcularTributosTrimestraisCSLL();
        System.out.println("O valor do tributo trimestral da CSLL da empresa Lucro Presumido é: " + valorCSLL);
        BigDecimal valorIRPJ = empresaLucroPresumido.calcularTributosTrimestraisIRPJ();
        System.out.println("O valor do tributo trimestral do IRPJ da empresa Lucro Presumido é: " + valorIRPJ);

        // Empresa Lucro Real - Testes
        BigDecimal lucroReal = empresaLucroReal.calcularLucroReal();
        System.out.println("O lucro real da empresa Lucro Real é: " + lucroReal);
        BigDecimal valorIRPJLucroReal = empresaLucroReal.calcularIRPJ();
        System.out.println("O valor do tributo do IRPJ da empresa Lucro Real é: " + valorIRPJLucroReal);
        BigDecimal valorCSLLLucroReal = empresaLucroReal.calcularCSLL();
        System.out.println("O valor do tributo da CSLL da empresa Lucro Real é: " + valorCSLLLucroReal);

        // TESTANDO VALIDAÇÕES NAS 4 CLASSES DE EMPRESAS

        // Empresa Simples Nacional
        empresaSimplesNacional.setCnpj("12.345.678/0001-90");
        empresaSimplesNacional.setRazaoSocial("Empresa Simples Nacional LTDA");
        empresaSimplesNacional.setFaturamentoMensal(new BigDecimal("-1000.00"));
        empresaSimplesNacional.setFaturamentoAnual(new BigDecimal("-50000.00"));
        empresaSimplesNacional.setAliquotaEfetiva(new BigDecimal("-0.10"));
        empresaSimplesNacional.setNumeroDeFuncionarios(-5);
        
        // Empresa MEI
        empresaMEI.setCnpj("12.345.678/0001-90");
        empresaMEI.setRazaoSocial("Empresa MEI LTDA");
        empresaMEI.setFaturamentoMensal(new BigDecimal("-1000.00"));
        empresaMEI.setFaturamentoAnual(new BigDecimal("-50000.00"));
        empresaMEI.setValorMensalDoDAS(new BigDecimal("-75.00"));

        //Empresa de Lucro Presumido
        empresaLucroPresumido.setCnpj("12.345.678/0001-90");
        empresaLucroPresumido.setRazaoSocial("Empresa Lucro Presumido LTDA");
        empresaLucroPresumido.setReceitaBrutaAnual(new BigDecimal("-50000.00"));
        empresaLucroPresumido.setReceitaBrutaTrimestral(new BigDecimal("-10000.00"));
        empresaLucroPresumido.setPercentualDePresuncao(new BigDecimal("-0.08"));
        empresaLucroPresumido.setAliquotaDoIRPJ(new BigDecimal("-0.15"));
        empresaLucroPresumido.setAliquotaDaCSLL(new BigDecimal("-0.09"));
        empresaLucroPresumido.setValorDoPIS(new BigDecimal("-0.00"));
        empresaLucroPresumido.setValorDaCOFINS(new BigDecimal("-0.00"));

        //Empresa de Lucro Real
        empresaLucroReal.setCnpj("12.345.678/0001-90");
        empresaLucroReal.setRazaoSocial("Empresa Lucro Real LTDA");
        empresaLucroReal.setReceitaBrutaAnual(new BigDecimal("-50000.00"));
        empresaLucroReal.setDespesasDedutiveis(new BigDecimal("-25000.00"));
        empresaLucroReal.setLucroAjustado(new BigDecimal("-25000.00"));
        empresaLucroReal.setPrejuizoFiscal(new BigDecimal("-5000.00"));
        empresaLucroReal.setAliquotaDoIRPJ(new BigDecimal("-0.15"));
        empresaLucroReal.setAliquotaDaCSLL(new BigDecimal("-0.09"));
        empresaLucroReal.setLucroAjustado(new BigDecimal("-25000.00"));
    }
}
