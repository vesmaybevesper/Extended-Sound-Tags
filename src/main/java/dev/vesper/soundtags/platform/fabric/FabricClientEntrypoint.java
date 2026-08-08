package dev.vesper.soundtags.platform.fabric;

//? fabric {

import dev.vesper.soundtags.ExtendedSoundTags;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ClientModInitializer;

@Entrypoint("client")
public class FabricClientEntrypoint implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ExtendedSoundTags.onInitializeClient();
	}

}
//?}
