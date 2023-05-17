package com.teampotato.cataclysmfixer;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(CataclysmFixer.ID)
public class CataclysmFixer {
    public static final String ID = "cataclysmfixer";

    public CataclysmFixer() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_CONFIG);
    }

    public static final ForgeConfigSpec COMMON_CONFIG;
    public static final ForgeConfigSpec.IntValue SOUL_BLACK_SMITH_SPACING, SOUL_BLACK_SMITH_SEPARATION, RUINED_CITADEL_SPACING, RUINED_CITADEL_SEPARATION, BURNING_ARENA_SPACING, BURNING_ARENA_SEPARATION;

    static {
        ForgeConfigSpec.Builder CONFIG_BUILDER = new ForgeConfigSpec.Builder();
        CONFIG_BUILDER.push("Cataclysm Fixer");
        SOUL_BLACK_SMITH_SPACING = CONFIG_BUILDER
                .defineInRange("soul black smith spacing", 90, 5, Integer.MAX_VALUE);
        SOUL_BLACK_SMITH_SEPARATION = CONFIG_BUILDER
                .defineInRange("soul black smith separation", 70, 5, Integer.MAX_VALUE);
        RUINED_CITADEL_SPACING = CONFIG_BUILDER
                .defineInRange("ruined citadel spacing", 30, 5, Integer.MAX_VALUE);
        RUINED_CITADEL_SEPARATION = CONFIG_BUILDER
                .defineInRange("ruined citadel separation", 10, 5, Integer.MAX_VALUE);
        BURNING_ARENA_SPACING = CONFIG_BUILDER
                .defineInRange("burning arena spacing", 112, 5, Integer.MAX_VALUE);
        BURNING_ARENA_SEPARATION = CONFIG_BUILDER
                .defineInRange("burning arena separation", 70, 5, Integer.MAX_VALUE);
        CONFIG_BUILDER.pop();
        COMMON_CONFIG = CONFIG_BUILDER.build();
    }
}
