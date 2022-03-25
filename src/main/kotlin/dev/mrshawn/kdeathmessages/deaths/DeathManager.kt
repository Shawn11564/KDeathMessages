package dev.mrshawn.kdeathmessages.deaths

import dev.mrshawn.kdeathmessages.deaths.messages.DeathMessage
import dev.mrshawn.kdeathmessages.deaths.messages.DeathMessageContainer
import kotlin.collections.HashMap

object DeathManager {

	private val messageContainers = HashMap<DeathType, DeathMessageContainer>()

	fun addDeathMessage(deathMessage: DeathMessage) {
		val deathType = deathMessage.deathType

		if (!messageContainers.containsKey(deathType)) {
			messageContainers[deathType] = DeathMessageContainer()
		}
		messageContainers[deathType]?.addMessage(deathMessage)
	}

	fun getDeathMessage(deathType: DeathType) = messageContainers[deathType]?.getRandomDeathMessage()

}