package cn.mcxkly.classicandsimplestatusbars.fabric;

import cn.mcxkly.classicandsimplestatusbars.ClassicAndSimpleStatusBars;
import net.fabricmc.api.ModInitializer;

public class ClassicAndSimpleStatusBarsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ClassicAndSimpleStatusBars.init();
    }
}