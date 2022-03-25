package dev.mrshawn.kdeathmessages

import co.aikar.commands.PaperCommandManager
import dev.mrshawn.kdeathmessages.deaths.DeathType
import dev.mrshawn.kdeathmessages.listeners.PlayerDeathListener
import org.bukkit.plugin.java.JavaPlugin

class DeathMessages: JavaPlugin() {

	companion object {
		lateinit var instance: DeathMessages
	}

	override fun onEnable() {
		instance = this
		registerListeners()
		registerCommands()
	}

	override fun onDisable() {
		// Plugin shutdown logic
	}

	private fun registerListeners() {
		val pm = server.pluginManager

		pm.registerEvents(PlayerDeathListener, this)
	}

	private fun registerCommands() {
		val pcm = PaperCommandManager(this)

		pcm.commandCompletions.registerCompletion("@deathtype") { DeathType.values().map { it.name } }
	}

}