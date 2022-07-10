object q4 extends App{
    
    def wage(h1:Int)=h1*250

    def Ot(h2:Int)=h2*85

    def income(h1:Int,h2:Int)=wage(h1)+Ot(h2)

    def tax(a:Int)=a*0.12

    def takeHome(h1:Int,h2:Int)=income(h1,h2)-tax(income(h1,h2))

    println(takeHome(40,30));
    
}