package com.example.bankaccount.Repository;

import com.example.bankaccount.Model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Accounts findByCustomerId(int customerId);
}
