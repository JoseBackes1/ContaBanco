package classes;

import java.math.BigDecimal;

public class ContaTerminal {
    private String name;
    private Integer account;
    private String agency;
    private BigDecimal saldo;

    public ContaTerminal(String name, Integer account, String agency, BigDecimal saldo) {
        this.name = name;
        this.account = account;
        this.agency = agency;
        this.saldo = saldo;
    }

    public ContaTerminal() {
        this.name = "";
        this.account = 0;
        this.agency = "";
        this.saldo = BigDecimal.ZERO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String agencyPrefix = this.agency.substring(0, this.agency.length() - 1);
        String agencySufix = this.agency.substring(this.agency.length() - 1);
        return "Olá," +  this.name +
                ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " +
                 agencyPrefix + "-" + agencySufix+
                ", conta " +
                this.account +
                " e seu saldo " +
                this.saldo +
                " já está disponível para saque";
    }
}
