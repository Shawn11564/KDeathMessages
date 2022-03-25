package dev.mrshawn.kdeathmessages.utils

import org.bukkit.entity.LivingEntity
import org.bukkit.event.Event
import org.bukkit.event.entity.EntityDamageEvent

object EventUtils {

	fun isDeadly(event: Event): Boolean {
		if (event !is EntityDamageEvent) return false
		if (event.entity !is LivingEntity) return false
		return (event.entity as LivingEntity).health - event.finalDamage <= 0
	}

}