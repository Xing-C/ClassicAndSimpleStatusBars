package cn.mcxkly.classicandsimplestatusbars.forge;

import dev.architectury.platform.forge.EventBuses;
import cn.mcxkly.classicandsimplestatusbars.ClassicAndSimpleStatusBars;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ClassicAndSimpleStatusBars.MOD_ID)
public class ClassicAndSimpleStatusBarsForge {
    public ClassicAndSimpleStatusBarsForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ClassicAndSimpleStatusBars.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            ClassicAndSimpleStatusBars.init();
    }
}