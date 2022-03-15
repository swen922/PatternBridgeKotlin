
open class RemoteControl {
    var myDevice : Device

    constructor(device: Device) {
        this.myDevice = device
    }

    fun togglePower() {
        if (myDevice.isEnabled()) {
            myDevice.disable()
        }
        else {
            myDevice.enable()
        }
    }

    fun volumeUp() {
        myDevice.setVolume(myDevice.getVolume() + 1)
    }

    fun volumeDown() {
        myDevice.setVolume(myDevice.getVolume() - 1)
    }

    fun channelUp() {
        myDevice.setChannel(myDevice.getChannel() + 1)
    }

    fun channelDown() {
        myDevice.setChannel(myDevice.getChannel() - 1)
    }
}

class RemoteControlAdvanced : RemoteControl {
    constructor(device: Device) : super(device)

    fun mute() {
        myDevice.setVolume(0)
    }
}

/** Мост, также известен как: Bridge */

fun main(args : Array<String>) {
    var tv = TV()
    var rc = RemoteControl(tv)

    rc.togglePower()
    rc.channelUp()
    rc.channelDown()
    rc.volumeDown()
    for (i in 97..103 step 1) {
        rc.volumeUp()
    }
    rc.togglePower()

    println("")

    var fm = FMRadio()
    rc.myDevice = fm
    rc.togglePower()
    rc.channelUp()
    rc.channelDown()
    rc.volumeDown()
    for (i in 97..103 step 1) {
        rc.volumeUp()
    }
    rc.togglePower()
}