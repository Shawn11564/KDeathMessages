package dev.mrshawn.kdeathmessages.listeners

import dev.mrshawn.kdeathmessages.utils.messages.Chat
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.event.entity.PlayerDeathEvent

object PlayerDeathListener: Listener {

	@EventHandler(priority = EventPriority.MONITOR)
	fun onPlayerDeathMonitor(event: PlayerDeathEvent) {
		val player = event.entity
		var deathMessage = event.deathMessage
		val killer = event.entity.killer

		deathMessage = "&c$deathMessage"
		event.deathMessage = Chat.colorize(deathMessage)
	}

	@EventHandler(priority = EventPriority.MONITOR)
	fun onPlayerDamageMonitor(event: EntityDamageEvent) {

	}

}