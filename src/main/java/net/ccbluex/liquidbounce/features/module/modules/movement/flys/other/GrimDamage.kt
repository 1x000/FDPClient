package net.ccbluex.liquidbounce.features.module.modules.movement.flys.other

import net.ccbluex.liquidbounce.FDPClient
import net.ccbluex.liquidbounce.event.*
import net.ccbluex.liquidbounce.features.module.modules.movement.flys.FlyMode
import net.ccbluex.liquidbounce.ui.client.hud.element.elements.Notification
import net.ccbluex.liquidbounce.ui.client.hud.element.elements.NotifyType
import net.minecraft.network.play.client.C03PacketPlayer
import net.minecraft.block.TNT
import net.minecraft.network.Packet


class GrimDamage : FlyMode("GrimDamage") {
    override fun onEnable() {
        if(mc.isSingleplayer) {
            FDPClient.hud.addNotification(Notification("GrimDamage", "Damage GrimAC Fly (TNT ONLY IS A TEST!!)", NotifyType.ERROR))
            fly.state = false
        }
    }
    override fun onUpdate(event: UpdateEvent) {
        if(mc.isSingleplayer) return
        
        mc.thePlayer.setPositionAndRotation(mc.thePlayer.posX+1000, mc.thePlayer.posY, mc.thePlayer.posZ+1000, mc.thePlayer.rotationYaw, mc.thePlayer.rotationPitch);
    }
}
