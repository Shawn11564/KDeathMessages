package dev.mrshawn.kdeathmessages.deaths.messages

import dev.mrshawn.kdeathmessages.utils.randoms.WeightedRandomBag

class DeathMessageContainer {

	private val deathMessagesBag = WeightedRandomBag<DeathMessage>()

	fun addMessage(deathMessage: DeathMessage) {
		deathMessagesBag.addEntry(deathMessage, deathMessage.rarity)
	}

	fun getRandomDeathMessage() = deathMessagesBag.getRandom()

}