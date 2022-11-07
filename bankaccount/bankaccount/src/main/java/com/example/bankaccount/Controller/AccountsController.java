package com.example.bankaccount.Controller;

import com.example.bankaccount.Model.Accounts;
import com.example.bankaccount.Model.Customer;
import com.example.bankaccount.Model.Properties;
import com.example.bankaccount.Repository.AccountsRepository;
import com.example.bankaccount.Service.AccountsConfig;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;
    @Autowired
    private AccountsConfig accountsConfig;

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer){
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
        if(accounts != null){
            return accounts;
        }else {
            return null;
        }
    }

    @GetMapping("/accounts/properties")
    public String getPropertyDetails() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(accountsConfig.getMsg(), accountsConfig.getBuildVersion(), accountsConfig.getMailDetails(), accountsConfig.getActiveBranches());
        String jsonString = ow.writeValueAsString(properties);
        return jsonString;
    }
}
