package org.qeston.ec.main;

import org.bukkit.plugin.java.JavaPlugin;
import org.qeston.ec.commands.EnderchestCommand;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Loaded");
        getCommand("ec").setExecutor(new EnderchestCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
