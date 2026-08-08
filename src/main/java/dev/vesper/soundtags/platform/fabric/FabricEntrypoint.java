package dev.vesper.soundtags.platform.fabric;

//? fabric {

import dev.vesper.soundtags.ExtendedSoundTags;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ModInitializer;

@Entrypoint("main")
public class FabricEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		ExtendedSoundTags.onInitialize();
	}
}
//?}
