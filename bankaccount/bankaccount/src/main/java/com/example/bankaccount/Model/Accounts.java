package com.example.bankaccount.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "accounts")
public class Accounts {

    @Column(name = "customer_id")
    private int customerId;
    @Id
    private long accountNumber;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "branch_address")
    private String branchAdress;
    @Column(name = "create_dt")
    private LocalDate createDt;

    public Accounts() {
    }

    public Accounts(int customerId, long accountNumber, String accountType, String branchAdress, LocalDate createDt) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.branchAdress = branchAdress;
        this.createDt = createDt;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAdress() {
        return branchAdress;
    }

    public void setBranchAdress(String branchAdress) {
        this.branchAdress = branchAdress;
    }

    public LocalDate getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDate createDt) {
        this.createDt = createDt;
    }
}
