object q4 extends App {

  def bookPrice(n:Int)=24.95 * n;

  def discout(n:Int)=24.95 * 0.4 * n;

  def shippingCost(n:Int)=3*n+(n-50)*0.75;

  printf("Total whole sale cost for 60 copies is Rs. %.2f",bookPrice(60)-discout(60)+shippingCost(60));
}