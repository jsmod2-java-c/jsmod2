package cn.jsmod2.network.protocol.server;

import cn.jsmod2.api.server.Round;
import cn.jsmod2.core.protocol.GetPacket;

public class GetRoundPacket extends GetPacket {

    public GetRoundPacket() {
        super(0x61, Round.class);
    }

    @Override
    public Round send() {
        return (Round)(requester.with("field","round").get().get());
    }
}
