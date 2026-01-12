package net.solyze.keepswimming.networking;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import net.solyze.keepswimming.KeepSwimming;

public record HandshakePacket() implements CustomPayload {

    public static final CustomPayload.Id<HandshakePacket> PACKET_ID =
            new CustomPayload.Id<>(Identifier.of(KeepSwimming.MOD_ID, "handshake"));

    public static final PacketCodec<RegistryByteBuf, HandshakePacket> PACKET_CODEC =
            PacketCodec.unit(new HandshakePacket());

    @Override
    public Id<? extends CustomPayload> getId() {
        return PACKET_ID;
    }
}