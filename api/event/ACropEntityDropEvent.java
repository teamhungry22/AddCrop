package com.github.teamhungry22.addcrop.api.event;

import com.github.teamhungry22.addcrop.api.line.Line;
import com.github.teamhungry22.addcrop.core.config.crop.CropType;
import com.github.teamhungry22.addcrop.core.entity.AddCropEntity;
import com.github.teamhungry22.addcrop.core.entity.CropEntity;
import com.github.teamhungry22.addcrop.core.entity.EntityType;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

public class ACropEntityDropEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final Location location;
    private final AddCropEntity addCropEntity;
    private final List<Line> lineList;
    private boolean isCancelled;

    public ACropEntityDropEvent(Player player, Location location, AddCropEntity addCropEntity, List<Line> lineList) {
        this.player = player;
        this.location = location;
        this.addCropEntity = addCropEntity;
        this.lineList = lineList;
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

    public List<Line> getLineList() {
        return lineList;
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
