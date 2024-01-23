class Temperature{
    var type = TemperatureType.Fahrenheit
    var temp = 0.0

    enum class TemperatureType {
        Fahrenheit, Celsius, Kelvin
    }

    fun setTemperature(t: Double) {
        val temp = t
    }

    fun getTemperatureF(): (Double){
        if(type == TemperatureType.Fahrenheit) {
            return temp
        }
        else if(type == TemperatureType.Celsius) {
            temp += 32 * 9/5
            return temp
        }
        temp += 459.67 * 5/9
        return temp
    }

    fun getTemperatureC(): (Double){
        if(type == TemperatureType.Celsius) {
            return temp
        }
        else if(type == TemperatureType.Fahrenheit) {
            temp -= 32 * 5/9
            return temp
        }
        temp += 273
        return temp
    }

    fun getTemperatureK(): (Double){
        if(type == TemperatureType.Kelvin) {
            return temp
        }
        else if(type == TemperatureType.Fahrenheit) {
            temp += 459.67 * 5/9
            return temp
        }
        temp += 273
        return temp
    }
}
