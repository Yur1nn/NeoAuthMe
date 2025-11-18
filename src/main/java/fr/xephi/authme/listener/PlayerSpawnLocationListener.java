package fr.xephi.authme.listener;

import io.papermc.paper.event.player.AsyncPlayerSpawnLocationEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class PlayerSpawnLocationListener implements Listener {

    private static boolean wasSpawnLocationEventCalled = false;

    public static boolean isSpawnLocationEventCalled() {
        return wasSpawnLocationEventCalled;
    }

    // AsyncPlayerSpawnLocationEvent is used for spawn location handling
    // This event should only set spawn location, not teleport (Player object is not available)
    // Note: Player object is not available in async event (happens during configuration phase)
    // Player-specific spawn logic will be handled in PlayerJoinEvent instead
    @EventHandler(priority = EventPriority.HIGH)
    public void onAsyncPlayerSpawnLocation(AsyncPlayerSpawnLocationEvent event) {
        wasSpawnLocationEventCalled = true;
        // Player object is not available in AsyncPlayerSpawnLocationEvent (configuration phase)
        // According to Paper API: "the Player instance is not available during this event"
        // Spawn location with player-specific logic will be handled in PlayerJoinEvent
        // This event only marks that it was called - actual teleportation happens in PlayerJoinEvent
    }
}
