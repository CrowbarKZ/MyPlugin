/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.crowbarkz.myplugin.commands;

import io.github.crowbarkz.myplugin.MyPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 *
 * @author Sergio
 */
public class PraiseMimiCommand implements CommandExecutor {

    private final MyPlugin plugin;

    public PraiseMimiCommand(MyPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] split) {
        if (command.getName().equalsIgnoreCase("crow_pm")) {
            sender.getServer().broadcastMessage("Mimi is very beautiful");
            return true;
        } else {
            return false;
        }
    }
}
