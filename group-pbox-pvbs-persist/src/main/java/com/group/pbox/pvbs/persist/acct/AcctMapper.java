package com.group.pbox.pvbs.persist.acct;

import com.group.pbox.pvbs.model.acct.Account;

public interface AcctMapper
{
    int addAcct(Account acctRequest);
    Integer fetchAcct();
    int accountValid(Account account);
}
