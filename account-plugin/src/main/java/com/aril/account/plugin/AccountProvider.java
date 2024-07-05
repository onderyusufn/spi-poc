package com.aril.account.plugin;

import com.aril.spi.Provider;

public class AccountProvider implements Provider {
    @Override
    public void close() {
    }

    @Override
    public void run() {
        System.out.println("AccountProvider run");
    }
}
