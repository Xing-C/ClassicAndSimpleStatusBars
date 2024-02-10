package cn.mcxkly.classicandsimplestatusbars.mixin;

import net.minecraft.client.gui.GuiGraphics;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
@Mixin(Gui.class)
public class MixinRender {
    // net.minecraft.client.gui.components.PlayerTabOverlay render()
    @Inject(method = "renderExperienceBar", at = @At("HEAD"), cancellable = true)
    private void DisableRenderExperienceBar (GuiGraphics guiGraphics, int i, CallbackInfo ci) {
        // ci.cancel();
    }
    @Inject(method = "renderPlayerHealth", at = @At("HEAD"), cancellable = true)
    private void DisableRenderPlayerHealth (GuiGraphics guiGraphics, CallbackInfo ci) {
        ci.cancel();
    }
    @Inject(method = "renderVehicleHealth", at = @At("HEAD"), cancellable = true)
    private void DisableRenderVehicleHealth (GuiGraphics guiGraphics, CallbackInfo ci) {
        ci.cancel();
    }
}
