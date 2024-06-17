/**
 * 
 */
package info.sokobot.crazygens.api.objects;

import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import lombok.Data;


public @Data class Generator {
	private UUID ownerId;
	 private Block block;
	 private ItemStack block_drop;

	/**
	 * @param ownerId
	 * @param block
	 * @param block_drop
	 */
	private Generator(UUID ownerId, Block block, ItemStack block_drop) {
		super();
		this.ownerId = ownerId;
		this.block = block;
		this.block_drop = block_drop;
	}

}
