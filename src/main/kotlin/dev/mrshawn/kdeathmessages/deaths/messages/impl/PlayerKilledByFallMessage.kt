package dev.mrshawn.kdeathmessages.deaths.messages.impl

import dev.mrshawn.kdeathmessages.deaths.DeathType
import dev.mrshawn.kdeathmessages.deaths.messages.DeathMessage
import dev.mrshawn.kdeathmessages.utils.EventUtils
import org.bukkit.event.Event
import org.bukkit.event.entity.EntityDamageEvent

class PlayerKilledByFallMessage(message: String): DeathMessage(message, DeathType.FALL) {

	override fun parse(rawEvent: Event): String? {
		if (EventUtils.isDeadly(rawEvent))
		if (rawEvent !is EntityDamageEvent) return null
		val event = rawEvent as EntityDamageEvent
		if (event.cause == EntityDamageEvent.DamageCause.FALL) {

		}
		return null
	}

}