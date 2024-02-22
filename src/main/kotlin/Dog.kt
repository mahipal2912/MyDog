import java.util.*

class Dog(val name:String,
          weightParam:Int,
          breedParam:String) {


    init {
        println("Dog $name has been created")
    }

    var activites = arrayOf("walks")

    private val breed = breedParam.uppercase(Locale.getDefault())

    init {
        println("Dog breed is $breed")
    }

    var weight = weightParam

        set(value) {
            if (value>0)  field = value
        }

    val weightInKgs: Double

        get() = weight/2.2


    fun bark() {
        println(if (weight < 20)"yip!" else "woof")
    }
}