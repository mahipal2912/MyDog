
    fun main() {

        val myDog = Dog("sky" , 70,"Mixed")

        val name = myDog.name

        myDog.bark()

        myDog.weight = 75

        println("Weight in Kgs is ${myDog.weightInKgs}")
        myDog.weight = -2

        println("Weight in Kgs is ${myDog.weight}")

        myDog.activites = arrayOf("walks","frisbee","fetching balls")

        for (item in myDog.activites){
            println("$name  enjoy  $item")
        }
    }
