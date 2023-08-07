package meepustheepus.meeps.storage;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeepsStorage implements ModInitializer {

	public static final Item SATCHEL =
		Registry.register(Registries.ITEM, new Identifier("meepstorage", "satchel"),
			new Item(new FabricItemSettings()));
	
	
	
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("meepstorage");

	@Override
	public void onInitialize() {
		
		
		
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}