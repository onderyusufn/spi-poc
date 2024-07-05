package com.aril.spi;

/**
 * Base interface for all SPIs. SPIs are used to define the extension points in the system.

 */
public interface Spi {

    String getName();

    Class<? extends Provider> getProviderClass();

    Class<? extends ProviderFactory<? extends Provider>> getProviderFactoryClass();

    ProviderFactory<? extends Provider> getProviderFactory();

    default boolean isEnabled() {
        return true;
    }
}
