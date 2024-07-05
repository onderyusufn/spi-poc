package com.aril.spi;

/**
 * ProviderFactory is used to create an instance of {@link Provider} and manage its lifecycle.
 * @param <T>
 */
public interface ProviderFactory<T extends Provider> {

    T create();


    void init();


    void postInit();


    void close();

    String getId();

    default int order() {
        return 0;
    }
}
