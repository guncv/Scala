object Question10_scala {
  def alternate(f1: (Int, Int) => Int, f2: (Int, Int) => Int, list: List[Int]): Int = {
    def func(l: List[Int], sum: Int, b: Boolean): Int = {
      if (l.isEmpty) return sum;
      else if (b) return func(l.tail, f1(sum, l.head), false);
      else {
        return func(l.tail, f2(sum, l.head), true);
      }
    }
    if (list.isEmpty) return 0;
    else {
      return func(list.tail, list.head, true);
    }
  }

  def main(args: Array[String]): Unit = {
    def f1(x: Int, y: Int): Int = {
      return x + y;
    }
    def f2(x: Int, y: Int): Int = {
      return x - y;
    }
    println(alternate(f1, f2, List()));
    println(alternate(f1, f2, List(55)));
    println(alternate(f1, f2, List(1, 2)));
    println(alternate(f1, f2, List(1, 2, 3)));
    println(alternate(f1, f2, List(1, 2, 3, 4)));
    println(alternate(f1, f2, List(1, 2, 3, 4, 5)));
  }
}
