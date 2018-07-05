package mcjty.ariente.gui.components;

import mcjty.ariente.entities.HoloGuiEntity;
import mcjty.ariente.gui.IGuiComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public abstract class AbstractHoloComponent implements IGuiComponent {

    protected final double x;
    protected final double y;
    protected final double w;
    protected final double h;

    public AbstractHoloComponent(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public boolean isInside(double x, double y) {
        return x >= this.x && x <= (this.x + this.w) && y >= this.y && y <= (this.y + this.h);
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getW() {
        return w;
    }

    @Override
    public double getH() {
        return h;
    }

    @Override
    public void hit(EntityPlayer player, HoloGuiEntity entity, double cursorX, double cursorY) {

    }

    @Override
    public void hitClient(EntityPlayer player, HoloGuiEntity entity, double cursorX, double cursorY) {

    }
}