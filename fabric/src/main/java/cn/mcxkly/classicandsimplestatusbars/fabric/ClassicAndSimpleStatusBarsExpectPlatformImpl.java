package cn.mcxkly.classicandsimplestatusbars.fabric;

import cn.mcxkly.classicandsimplestatusbars.ClassicAndSimpleStatusBarsExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class ClassicAndSimpleStatusBarsExpectPlatformImpl {
    /**
     * This is our actual method to {@link ClassicAndSimpleStatusBarsExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
