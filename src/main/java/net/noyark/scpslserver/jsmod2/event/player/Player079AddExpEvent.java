package net.noyark.scpslserver.jsmod2.event.player;

import net.noyark.scpslserver.jsmod2.annotations.UseForServerInit;
import net.noyark.scpslserver.jsmod2.entity.Player;
import net.noyark.scpslserver.jsmod2.utils.player.ExperienceType;

/**
 * @author kevinj
 */

public class Player079AddExpEvent extends PlayerEvent {
    private ExperienceType experienceType;
    private float expToAdd;

    public ExperienceType getExperienceType() {
        return experienceType;
    }

    public float getExpToAdd() {
        return expToAdd;
    }

    public void setExpToAdd(float expToAdd) {
        this.expToAdd = expToAdd;
    }


    /** java-bean */
    @UseForServerInit
    public void setExperienceType(ExperienceType experienceType) {
        this.experienceType = experienceType;
    }

    public Player079AddExpEvent(Player player, ExperienceType experienceType, float expToAdd) {
        super(player);
        this.experienceType = experienceType;
        this.expToAdd = expToAdd;
    }

    public Player079AddExpEvent(){

    }
}