package cn.mcxkly.classicandsimplestatusbars.forge;

import cn.mcxkly.classicandsimplestatusbars.ClassicAndSimpleStatusBars;
import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(ClassicAndSimpleStatusBars.MOD_ID)
public class ClassicAndSimpleStatusBarsForge {
    private static final Logger LOGGER = LogUtils.getLogger();

    public ClassicAndSimpleStatusBarsForge(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("new CSSB is Loading...");

//    public void clientSetup(final FMLClientSetupEvent event) {
//        ClassicAndSimpleStatusBarsForgeClient.setRenderType();
//    }
//
    }
}