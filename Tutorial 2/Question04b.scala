object q4b extends App{

    def attendence(price:Int)=120+((15-price)/5)*20

    def cost(price:Int)=500+3*attendence(price)

    def revenue(price:Int)=price*attendence(price)

    def profit(price:Int)=revenue(price)-cost(price)

    println(profit(5))
    println(profit(10))
    println(profit(15))
    println(profit(20))
    println(profit(25))
    println(profit(30))
    println(profit(35))
}