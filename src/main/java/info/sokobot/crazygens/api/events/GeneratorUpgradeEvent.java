/**
 * 
 */
package info.sokobot.crazygens.api.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import info.sokobot.crazygens.objects.config.Generator;
import lombok.Getter;

/**
 * @author jonah
 * 
 */
public class GeneratorUpgradeEvent extends Event implements Cancellable {

	private static final HandlerList HANDLERS = new HandlerList();
	@Getter
	private final Generator generator;
	private boolean isCancelled;

	public static HandlerList getHandlerList() {
		return HANDLERS;
	}

	public GeneratorUpgradeEvent(Generator generator) {
        this.generator = generator;
        this.isCancelled = false;
    }

	public boolean isCancelled() {
		return this.isCancelled;
	}

	public void setCancelled(boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS;
	}
	/*
	 * SENDING AN EVENT USING API GeneratorPlaceEvent exampleEvent = new
	 * GeneratorPlaceEvent(Generator); // Initialize your Event
	 * Bukkit.getPluginManager().callEvent(exampleEvent); // This fires the event
	 * and allows any listener to listen to the event if
	 * (!exampleEvent.isCancelled()) {
	 * Bukkit.getPlayer("Msrules123").sendMessage(exampleEvent.getPlayerName()); //
	 * Use your event's data }
	 * 
	 * 
	 * 
	 */

}
