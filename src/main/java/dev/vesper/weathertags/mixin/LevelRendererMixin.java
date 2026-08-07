package dev.vesper.weathertags.mixin;

import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.ParticleStatus;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(LevelRenderer.class)
public class LevelRendererMixin {
/*
	@Shadow
	private int ticks;

	@Shadow
	private int rainSoundTime;

	@Final
	@Shadow
	private Minecraft minecraft;

	@Inject(method = "tickRain", at = @At("HEAD"), cancellable = true)
	private void tickRain(Camera camera, CallbackInfo ci) {
		float f = this.minecraft.level.getRainLevel(1.0F) / (Minecraft.useFancyGraphics() ? 1.0F : 2.0F);
		if (!(f <= 0.0F)) {
			Random random = new Random((long) this.ticks * 312987231L);
			LevelReader levelReader = this.minecraft.level;
			BlockPos blockPos = new BlockPos(camera.getPosition());
			BlockPos blockPos2 = null;
			int i = (int) (100.0F * f * f) / (this.minecraft.options.particles == ParticleStatus.DECREASED ? 2 : 1);

			for (int j = 0; j < i; ++j) {
				int k = random.nextInt(21) - 10;
				int l = random.nextInt(21) - 10;
				BlockPos blockPos3 = levelReader.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING, blockPos.offset(k, 0, l));
				Biome biome = levelReader.getBiome(blockPos3);
				if (blockPos3.getY() > levelReader.getMinBuildHeight() && blockPos3.getY() <= blockPos.getY() + 10 && blockPos3.getY() >= blockPos.getY() - 10 && biome.getPrecipitation() == Biome.Precipitation.RAIN && biome.warmEnoughToRain(blockPos3)) {
					blockPos2 = blockPos3.below();
					if (this.minecraft.options.particles == ParticleStatus.MINIMAL) {
						break;
					}

					double d = random.nextDouble();
					double e = random.nextDouble();
					BlockState blockState = levelReader.getBlockState(blockPos2);
					FluidState fluidState = levelReader.getFluidState(blockPos2);
					VoxelShape voxelShape = blockState.getCollisionShape(levelReader, blockPos2);
					double g = voxelShape.max(Direction.Axis.Y, d, e);
					double h = (double) fluidState.getHeight(levelReader, blockPos2);
					double m = Math.max(g, h);
					ParticleOptions particleOptions = !fluidState.is(FluidTags.LAVA) && !blockState.is(Blocks.MAGMA_BLOCK) && !CampfireBlock.isLitCampfire(blockState) ? ParticleTypes.RAIN : ParticleTypes.SMOKE;
					this.minecraft.level.addParticle(particleOptions, (double) blockPos2.getX() + d, (double) blockPos2.getY() + m, (double) blockPos2.getZ() + e, (double) 0.0F, (double) 0.0F, (double) 0.0F);
				}
			}

			if (blockPos2 != null && random.nextInt(3) < this.rainSoundTime++) {
				this.rainSoundTime = 0;
				if (blockPos2.getY() > blockPos.getY() + 1 && levelReader.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING, blockPos).getY() > Mth.floor((float) blockPos.getY())) {
					this.minecraft.level.playLocalSound(blockPos2, SoundEvents.WEATHER_RAIN_ABOVE, SoundSource.WEATHER, 0.1F, 0.5F, false);
				} else {
					this.minecraft.level.playLocalSound(blockPos2, SoundEvents.WEATHER_RAIN, SoundSource.WEATHER, 0.2F, 1.0F, false);
				}
			}

		}
		ci.cancel();
	}*/
}
