object Quiz01_scala {
  def partition(l: List[Int], f: Int => Boolean): List[List[Int]] = {
    def func(l1:List[Int],l2:List[Int],l:List[Int]):List[List[Int]] = {
      if (l.isEmpty) return List(l1,l2);
      else if (f(l.head)) return func(l1 ++ List(l.head),l2,l.tail);
      else {return func(l1,l2 ++ List(l.head),l.tail);}
    }
    if (l.isEmpty) return List();
    else {return func(List(),List(),l)}
  }

  def main(args: Array[String]):Unit = {
    def f1(x: Int): Boolean = {
      x % 2 == 1
    }

    def f2(x: Int): Boolean = {
      x * x > 10
    }
    val l1 = List(1,2,3,4,5);
    println(partition(l1, f1));
    println(partition(l1,f2));
    println(partition(l1, (x => x == 0)));
    println(partition(l1,(x => x<6)));
  }
}
