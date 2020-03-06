package xyz.fantasiamc.console;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Console extends JavaPlugin {

	@Override
	public void onEnable() {
		
		Bukkit.getLogger().info("");
		Bukkit.getLogger().info("");
		Bukkit.getLogger().info("╔══════════════════════════════════════════════════════════════════╗");
		Bukkit.getLogger().info("║                                                                  ║");
		Bukkit.getLogger().info("║                           Fantasia                               ║");
		Bukkit.getLogger().info("║                                                                  ║");
		Bukkit.getLogger().info("║                  Welcome to Fantasia's console  				          ║");
		Bukkit.getLogger().info("║                                                                  ║");
		Bukkit.getLogger().info("║                 Server IP: play.fantasiamc.xyz                   ║");
		Bukkit.getLogger().info("║                                                                  ║");
		Bukkit.getLogger().info("║                                                                  ║");
		Bukkit.getLogger().info("║          https://github.com/FantasiaNetwork/ConsoleStart/        ║");
		Bukkit.getLogger().info("╚══════════════════════════════════════════════════════════════════╝");
		Bukkit.getLogger().info("");
		Bukkit.getLogger().info("");
		
	}
	
	@Override
	public void onDisable() {
		Bukkit.getLogger().info("");
		Bukkit.getLogger().info("");
		Bukkit.getLogger().info("╔══════════════════════════════════════════════════════════════════╗");
		Bukkit.getLogger().info("║                                                                  ║");
		Bukkit.getLogger().info("║                           Fantasia                               ║");
		Bukkit.getLogger().info("║                                                                  ║");
		Bukkit.getLogger().info("║                       See you next time~ :D 					            ║");
		Bukkit.getLogger().info("║                                                                  ║");
		Bukkit.getLogger().info("║                 Server IP: play.fantasiamc.xyz                   ║");
		Bukkit.getLogger().info("║                                                                  ║");
		Bukkit.getLogger().info("║                                                                  ║");
		Bukkit.getLogger().info("║          https://github.com/FantasiaNetwork/ConsoleStart/        ║");
		Bukkit.getLogger().info("╚══════════════════════════════════════════════════════════════════╝");
		Bukkit.getLogger().info("");
		Bukkit.getLogger().info("");
	}
}
