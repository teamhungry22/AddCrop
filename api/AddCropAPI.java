package com.github.teamhungry22.addcrop.api;

import com.github.teamhungry22.addcrop.core.action.MealAction;
import com.github.teamhungry22.addcrop.core.action.ScytheAction;
import com.github.teamhungry22.addcrop.core.action.SeedPackAction;
import com.github.teamhungry22.addcrop.core.action.CropSummonAction;
import com.github.teamhungry22.addcrop.core.config.crop.CropData;
import com.github.teamhungry22.addcrop.core.item.AddCropItem;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Optional;

public class AddCropAPI {
    public static Optional<AddCropItem> getAddCropItem(String itemID) {
        return AddCropItem.load(itemID);
    }

    public static boolean isAddCropItem(ItemStack itemStack) {
        return AddCropItem.load(itemStack).isPresent();
    }

    public static void useSummonAction(Player player, Location location, CropData cropData) {
        CropSummonAction action = new CropSummonAction(cropData);
        action.execute(player, location);
    }

    public static void useMealAction(Player player, Location location, int range) {
        MealAction action = new MealAction(range);
        action.execute(player, location);
    }

    public static void useScytheAction(Player player, Location location, int range) {
        ScytheAction action = new ScytheAction(range);
        action.execute(player, location);
    }

    public static void useSeedPackAction(Player player, Location location, String cropID, int stage, int range) {
        SeedPackAction action = new SeedPackAction(cropID, stage, range);
        action.execute(player, location);
    }
}
