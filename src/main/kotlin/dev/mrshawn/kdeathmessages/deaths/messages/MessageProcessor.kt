package dev.mrshawn.kdeathmessages.deaths.messages

import dev.mrshawn.kdeathmessages.utils.messages.TextMessage
import dev.mrshawn.kdeathmessages.utils.messages.TextReplacement
import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.event.entity.EntityEvent

object MessageProcessor {

	fun process(deathMessage: DeathMessage, event: Event): TextMessage {
		val message = TextMessage()
		val entity = if (event is EntityEvent) event.entity else null
		val replacements = TextReplacement().of(
			Pair("%player%", if (entity is Player) entity.name else ""),
			Pair("player-display", if (entity is Player) entity.displayName else ""),
			Pair("%weapon%", "TODO"),
			Pair("%killer%", if (event is EntityDamageByEntityEvent) event.damager.name else ""),
		)
		message.addReplacements(replacements)
		return message
	}

}