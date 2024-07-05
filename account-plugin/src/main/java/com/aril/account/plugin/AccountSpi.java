package com.aril.account.plugin;

import com.aril.spi.Provider;
import com.aril.spi.ProviderFactory;
import com.aril.spi.Spi;

public class AccountSpi implements Spi {
    @Override
    public String getName() {
        return "account";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return AccountProvider.class;
    }

    @Override
    public Class<? extends ProviderFactory<? extends Provider>> getProviderFactoryClass() {
        return AccountProviderFactory.class;
    }

    @Override
    public ProviderFactory<? extends Provider> getProviderFactory() {
        return new AccountProviderFactory();
    }
}
