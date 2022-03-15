
interface Device {
    fun enable()
    fun disable()
    fun isEnabled() : Boolean
    fun getVolume() : Int
    fun setVolume(v : Int)
    fun getChannel() : Int
    fun setChannel(ch : Int)
}

class FMRadio : Device {

    private var enabled : Boolean = false
    private var volume : Int = 0
    private val minVolume : Int = 0
    private val maxVolume : Int = 40
    private var channel : Int = 1
    private val minChannel : Int = 1

    override fun enable() {
        this.enabled = true
        println("FMRadio is ON! Listen me!")
    }

    override fun disable() {
        this.enabled = false
        println("FMRadio is OFF! Listen nature!")
    }

    override fun isEnabled(): Boolean {
        return enabled
    }

    override fun getVolume(): Int {
        return volume
    }

    override fun setVolume(v: Int) {
        if (v > maxVolume) this.volume = maxVolume else if (v < minVolume) this.volume = minVolume else this.volume = v
        println("FMRadio-volume was set = " + this.volume)
    }

    override fun getChannel(): Int {
        return channel
    }

    override fun setChannel(ch: Int) {
        if (ch < minChannel) this.channel = minChannel else this.channel = ch
        println("FMRadio-channel was set = " + this.channel)
    }
}

class TV : Device {
    private var enabled : Boolean = false
    private var volume : Int = 0
    private val minVolume : Int = 0
    private val maxVolume : Int = 100
    private var channel : Int = 1
    private val minChannel : Int = 1

    override fun enable() {
        this.enabled = true
        println("TV is ON! Watch me!")
    }

    override fun disable() {
        this.enabled = false
        println("TV is OFF! Look at nature!")
    }

    override fun isEnabled(): Boolean {
        return enabled
    }

    override fun getVolume(): Int {
        return volume
    }

    override fun setVolume(v: Int) {
        if (v > maxVolume) this.volume = maxVolume else if (v < minVolume) this.volume = minVolume else this.volume = v
        println("TV-volume was set = " + this.volume)
    }

    override fun getChannel(): Int {
        return channel
    }

    override fun setChannel(ch: Int) {
        if (ch < minChannel) this.channel = minChannel else this.channel = ch
        println("TV-channel was set = " + this.channel)
    }
}

