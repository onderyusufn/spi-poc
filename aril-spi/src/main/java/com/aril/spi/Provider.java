package com.aril.spi;

/**
 * Provider interface is used to define the extension points in the system. Providers are the actual implementations of the SPIs.
 */
public interface Provider {

    void close();

    void run();
}
