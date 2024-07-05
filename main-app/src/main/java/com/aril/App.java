package com.aril;

import com.aril.spi.Provider;
import com.aril.spi.ProviderFactory;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        new App().run(args);
    }

    public void run(final String[] args) {
        System.out.println("Hello World!");

        String pluginsPath = "C:\\Users\\YusufOnder\\IdeaProjects\\spi-poc\\main-app\\src\\main\\resources";
        if (args.length > 0) {
            pluginsPath = args[0];
        }

        PluginLoader pluginLoader = new PluginLoader(new File(pluginsPath));
        pluginLoader.loadPlugins();

        ProviderFactory<? extends Provider> account = pluginLoader.getProviderFactory("account");
        if (account == null) {
            System.err.println("No factories loaded!");
            return;
        }

        System.out.println("This is running from the plugin");
        Provider provider = account.create();
        provider.run();
    }
}
