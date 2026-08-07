package dev.vesper.weathertags.common;

import net.minecraft.core.Registry;
//? >=1.20{
/*import net.minecraft.core.registries.BuiltInRegistries;
*///?}
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class WTSoundEvents {
	public static final SoundEvent LIGHTNING_STRIKE_FAR = register("weather.lightning.far");
	public static final SoundEvent LIGHTNING_STRIKE_MED = register("weather.lightning.med");
	public static final SoundEvent WEATHER_RAIN_BELOW = register("weather.rain.below");

	//? >=1.21{
	/*private static SoundEvent register(final String id) {
		return register(ResourceLocation.withDefaultNamespace(id));
	}
	*///?} 1.20{
	/*private static SoundEvent register(final String id) {
		return register(ResourceLocation.tryParse(id));
	}
	*///?}


	//? >=1.20{
	/*private static SoundEvent register(final ResourceLocation id) {
		return register(id, id);
	}

	private static SoundEvent register(final ResourceLocation id, final ResourceLocation soundId) {
		return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(soundId));
	}
	*///?} <1.20{
	private static SoundEvent register(String string) {
		return Registry.register(Registry.SOUND_EVENT, string, new SoundEvent(new ResourceLocation(string)));
	}
	//?}
}
