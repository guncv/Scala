object Quiz02_scala {
  def compliment(f:Int => Int):Int => Int = {
    (x:Int) => -1*f(x);
    /* 2
    def func(x:Int):Int = {
      return -1*f(x);
    }
    func */
  }

  def main(args: Array[String]):Unit = {
    def f1(x: Int): Int = {
      x - 1000
    }
    println(compliment((x => x * x))(-5));
    println (compliment((x => x * x))(3));
    println (compliment((x => -1 * x * x))(3));
    val c = compliment(f1);
    println(c(3));
    println(c(3000))
  }
}
