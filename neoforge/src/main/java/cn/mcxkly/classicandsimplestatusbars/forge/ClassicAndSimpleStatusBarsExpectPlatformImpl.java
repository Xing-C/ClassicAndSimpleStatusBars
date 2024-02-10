package cn.mcxkly.classicandsimplestatusbars.forge;

import cn.mcxkly.classicandsimplestatusbars.ClassicAndSimpleStatusBarsExpectPlatform;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

public class ClassicAndSimpleStatusBarsExpectPlatformImpl {
    /**
     * This is our actual method to {@link ClassicAndSimpleStatusBarsExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
