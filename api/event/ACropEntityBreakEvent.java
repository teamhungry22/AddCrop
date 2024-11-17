package com.github.teamhungry22.addcrop.api.event;

import com.github.teamhungry22.addcrop.core.config.crop.CropType;
import com.github.teamhungry22.addcrop.core.entity.AddCropEntity;
import com.github.teamhungry22.addcrop.core.entity.CropEntity;
import com.github.teamhungry22.addcrop.core.entity.EntityType;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ACropEntityBreakEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final Location location;
    private final AddCropEntity addCropEntity;
    private boolean isCancelled;

    public ACropEntityBreakEvent(Player player, Location location, AddCropEntity addCropEntity) {
        this.player = player;
        this.location = location;
        this.addCropEntity = addCropEntity;
        this.isCancelled = false;
    }

    public Player getPlayer() {
        return player;
    }

    public Location getLocation() {
        return location;
    }

    public AddCropEntity getAddCropEntity() {
        return addCropEntity;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.isCancelled = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
