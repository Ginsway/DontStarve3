package io.github.ginsway.dontstarve.mixin;

import io.github.ginsway.dontstarve.DontStarve3;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class DontStarve3Mixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		DontStarve3.LOGGER.info("Dontstarve3 mixin Loaded!");
	}
}
