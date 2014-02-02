
package io.github.crowbarkz.myplugin;

import io.github.crowbarkz.myplugin.commands.PraiseMimiCommand;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Sample plugin for Bukkit
 *
 * @author Dinnerbone
 */
public class MyPlugin extends JavaPlugin {


    @Override
    public void onDisable() {
        getLogger().info("Goodbye world!");
    }

    @Override
    public void onEnable() {        
        PluginDescriptionFile pdfFile = this.getDescription();
        getLogger().info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!");
        getLogger().info("Hey nerds! :D");
                
        // Register our commands
        getCommand("crow_pm").setExecutor(new PraiseMimiCommand(this));
    }
}
