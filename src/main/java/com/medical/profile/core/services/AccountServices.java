package com.medical.profile.core.services;

import com.medical.profile.core.entities.Account;

/**
 * Created by sohil chhabriya on 12-Apr-15.
 */
public interface AccountServices {

    public Account findAccount(Long accountId);

    public Account updateAccountDetails(Long accountId);

    public Account updateAccountDetails(Long accountId, String name);

    public Account addNewAccount(Account accountDetails);



}
