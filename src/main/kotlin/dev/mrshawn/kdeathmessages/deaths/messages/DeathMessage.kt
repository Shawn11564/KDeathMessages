package dev.mrshawn.kdeathmessages.deaths.messages

import dev.mrshawn.kdeathmessages.deaths.DeathType
import org.bukkit.event.Event

abstract class DeathMessage(val message: String, val deathType: DeathType, val rarity: Double = 100.0) {

	abstract fun parse(rawEvent: Event): String?

}
