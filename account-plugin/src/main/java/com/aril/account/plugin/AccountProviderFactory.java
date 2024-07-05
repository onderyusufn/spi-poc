package com.aril.account.plugin;

import com.aril.spi.ProviderFactory;

public class AccountProviderFactory implements ProviderFactory<AccountProvider> {
    @Override
    public AccountProvider create() {
        return new AccountProvider();
    }

    @Override
    public void init() {

    }

    @Override
    public void postInit() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getId() {
        return "account";
    }
}
