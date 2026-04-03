package org.lushplugins.lushyaml;

import org.bukkit.plugin.java.JavaPlugin;

public final class LushYaml extends JavaPlugin {
    private static LushYaml plugin;

    @Override
    public void onLoad() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        // Enable implementation
    }

    @Override
    public void onDisable() {
        // Disable implementation
    }

    public static LushYaml getInstance() {
        return plugin;
    }
}
