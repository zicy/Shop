package com.snowgears.shop.gui;

import org.bukkit.Bukkit;

import java.util.UUID;

public class SearchWindow extends ShopGuiWindow {

    //TODO make this inventory of type anvil and do an acition on pressing enter after searching
    public SearchWindow(UUID player){
        super(player);
        this.page = Bukkit.createInventory(null, INV_SIZE, "Search");
        initInvContents();
    }

    @Override
    protected void initInvContents(){

    }

    @Override
    protected void makeMenuBarUpper(){

    }

    @Override
    protected void makeMenuBarLower(){

    }
}

