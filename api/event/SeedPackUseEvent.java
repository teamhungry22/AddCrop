package com.github.teamhungry22.addcrop.api.event;


import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class SeedPackUseEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final ItemStack itemStack;
    private final String cropID;
    private final int stage;
    private final int range;
    private boolean isCancelled;

    public SeedPackUseEvent(Player player, ItemStack itemStack, String cropID, int stage , int range) {
        this.player = player;
        this.itemStack = itemStack;
        this.cropID = cropID;
        this.stage = stage;
        this.range = range;
        this.isCancelled = false;
    }

    public Player getPlayer() {
        return player;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public String getCropID() {
        return cropID;
    }

    public int getStage() {
        return stage;
    }

    public int getRange() {
        return range;
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
