package fr.xephi.authme.listener;

import io.papermc.paper.event.player.AsyncPlayerSpawnLocationEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class PlayerListener19Spigot implements Listener {

    private static boolean isPlayerSpawnLocationEventCalled = false;

    public static boolean isPlayerSpawnLocationEventCalled() {
        return isPlayerSpawnLocationEventCalled;
    }

    // Paper 1.21.10+ uses AsyncPlayerSpawnLocationEvent for spawn location handling
    // This event should only set spawn location, not teleport (Player object is not available)
    // Note: Player object is not available in async event (happens during configuration phase per Paper API)
    // Player-specific spawn logic will be handled in PlayerJoinEvent instead
    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerSpawn(AsyncPlayerSpawnLocationEvent event) {
        isPlayerSpawnLocationEventCalled = true;
        // Player object is not available in AsyncPlayerSpawnLocationEvent (configuration phase)
        // According to Paper API: "the Player instance is not available during this event"
        // Spawn location with player-specific logic will be handled in PlayerJoinEvent
        // This event only marks that it was called - actual teleportation happens in PlayerJoinEvent
    }
}
