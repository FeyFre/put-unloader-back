package PutUnloaderBack;

import arc.Events;
import arc.util.Log;
import static mindustry.content.Blocks.unloader;
import mindustry.game.EventType.WorldLoadEvent;
import mindustry.mod.Mod;
import mindustry.type.Category;

public class PutUnloaderBackMod extends Mod {

    public PutUnloaderBackMod() {
        Log.info("Loaded PutUnloaderBackMod constructor.");

        Events.on(WorldLoadEvent.class, e -> {
            unloader.category = Category.effect;
        });
    }

    @Override
    public void loadContent() {
        Log.info("Loading PutUnloaderBackMod content (nothing).");
    }

}
