package net.noyark.scpslserver.jsmod2.event.player;

import net.noyark.scpslserver.jsmod2.annotations.UseForServerInit;
import net.noyark.scpslserver.jsmod2.entity.Player;
import net.noyark.scpslserver.jsmod2.entity.TeslaGate;

/**
 * @author kevinj
 */

public class PlayerTriggerTeslaEvent extends PlayerEvent {
    private TeslaGate TeslaGate;
    private boolean Triggerable;

    public PlayerTriggerTeslaEvent(Player player, TeslaGate teslaGate, boolean triggerable) {
        super(player);
        TeslaGate = teslaGate;
        Triggerable = triggerable;
    }

    public PlayerTriggerTeslaEvent(){

    }

    public void setTriggerable(boolean triggerable) {
        Triggerable = triggerable;
    }

    public TeslaGate getTeslaGate() {
        return TeslaGate;
    }

    public boolean isTriggerable() {
        return Triggerable;
    }

    /** java-bean */
    @UseForServerInit
    public void setTeslaGate(TeslaGate teslaGate) {
        TeslaGate = teslaGate;
    }
}