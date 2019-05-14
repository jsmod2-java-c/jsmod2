package net.noyark.scpslserver.jsmod2.event.environment;

import net.noyark.scpslserver.jsmod2.entity.Player;
import net.noyark.scpslserver.jsmod2.event.Event;

public class WarheadKeycardAccessEvent extends Event {
    public Player player;
    public boolean Allow;

    public Player getPlayer() {
        return player;
    }

    public boolean isAllow() {
        return Allow;
    }

    public void setAllow(boolean allow) {
        Allow = allow;
    }

    public WarheadKeycardAccessEvent(Player player, boolean allow) {
        this.player = player;
        Allow = allow;
    }
}
