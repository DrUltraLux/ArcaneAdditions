package com.gaiyamato.arcaneadditions.gui;

import com.gaiyamato.arcaneadditions.ArcaneAdditions;
import com.gaiyamato.arcaneadditions.blocks.ArcaneController;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

public class ArcaneEngineController extends GuiContainer {
    ArcaneController engineControl;
    private ResourceLocation guiTexture = new ResourceLocation(ArcaneAdditions.MODID, "textures/gui/engine/engine_gui.png");

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        // TODO Auto-generated method stub

    }
}
