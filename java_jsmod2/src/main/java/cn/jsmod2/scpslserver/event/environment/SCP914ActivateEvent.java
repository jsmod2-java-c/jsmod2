/*
Jsmod2 is a java-based scpsl server initiated by jsmod2.cn.
It needs to rely on smod2 and proxy. jsmod2 is an open source
free plugin that is released under the GNU license. Please read
the GNU open source license before using the software. To understand
the appropriateness, if infringement, will be handled in accordance
with the law, @Copyright Jsmod2 China,more can see <a href="http://jsmod2.cn">that<a>
 */
package cn.jsmod2.scpslserver.event.environment;

import cn.jsmod2.scpslserver.annotations.UseForServerInit;
import cn.jsmod2.scpslserver.utils.item.KnobSetting;
import cn.jsmod2.scpslserver.math.Vector;
import cn.jsmod2.scpslserver.entity.Player;
import cn.jsmod2.scpslserver.event.Event;


/**
 * @author magiclu550 #(code) jsmod2
 * @author kevinj
 */


public class SCP914ActivateEvent extends Event {

    private Player user;

    private KnobSetting knobSetting;

    private Object[] inputs;

    private Vector intakePos;

    private Vector outputPos;

    public SCP914ActivateEvent(Player user, KnobSetting knobSetting, Object[] inputs, Vector intakePos, Vector outputPos) {
        this.user = user;
        this.knobSetting = knobSetting;
        this.inputs = inputs;
        this.intakePos = intakePos;
        this.outputPos = outputPos;
    }

    public SCP914ActivateEvent(){

    }

    public Player getUser() {
        return user;
    }


    /** java-bean */
    @UseForServerInit
    public void setUser(Player user) {
        this.user = user;
    }

    public KnobSetting getKnobSetting() {
        return knobSetting;
    }

    public void setKnobSetting(KnobSetting knobSetting) {
        this.knobSetting = knobSetting;
    }

    public Object[] getInputs() {
        return inputs;
    }

    public void setInputs(Object[] inputs) {
        this.inputs = inputs;
    }

    public Vector getIntakePos() {
        return intakePos;
    }

    public void setIntakePos(Vector intakePos) {
        this.intakePos = intakePos;
    }

    public Vector getOutputPos() {
        return outputPos;
    }

    public void setOutputPos(Vector outputPos) {
        this.outputPos = outputPos;
    }

}