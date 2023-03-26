object Question04_scala {
  def merge(left: List[Int], right: List[Int]): List[Int] = {
    if (left.isEmpty && right.isEmpty) return List();
    if (left.isEmpty) return right;
    if (right.isEmpty) return left
    if (left.head <= right.head) left.head :: merge(left.tail, right);
    else right.head :: merge(left, right.tail);
  }

  def mergesort(l: List[Int]): List[Int] = {
    var n = l.length
    var mid = n / 2
    if (mid == 0) return l;
    else {
      var left = splitList(l, 0, mid, 0);
      var right = splitList(l, mid, n, 0);
      merge(mergesort(left), mergesort(right));
    }
  }

  def splitList(l: List[Int], start: Int, stop: Int, cnt: Int): List[Int] = {
    if (cnt < start) splitList(l.tail, start, stop, cnt + 1)
    else {
      if (l.isEmpty || cnt == stop) return List();
      else l.head :: splitList(l.tail, start, stop, cnt + 1);
    }
  }

  def main(args: Array[String]): Unit = {
    var l = List(1, 5, 2, 3, 9, 4);
    var l2 = List(6,5,4,3,2,1);
    var l3 = List(5,3,8,9,0,1);
    var l4 = List(10,6,6,9,0,1);
    println(mergesort(l));
    println(mergesort(l2));
    println(mergesort(l3));
    println(mergesort(l4));
  }
}
