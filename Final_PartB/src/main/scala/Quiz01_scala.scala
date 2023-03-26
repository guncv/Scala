object Quiz01_scala {
  def swapPair(l:List[Int]): List[Int] = {

    def merge(l:List[List[Int]],newl:List[Int]):List[Int] = {
      if (l.isEmpty) return newl;
      else if (l.head.isEmpty) {
        return merge(l.tail, newl)
      };
      else {
        return merge(l.tail ++ List(l.head.tail),newl ++ List(l.head.head));
      }
    }

    def divide(l1:List[Int],l2:List[Int],l:List[Int],b:Boolean):List[Int] = {
      if (l.isEmpty) return merge(List(l2,l1),List());
      else if (b) {
        return divide(l1 ++ List(l.head),l2,l.tail,!b);
      }
      else {
        return divide(l1,l2 ++ List(l.head),l.tail,!b);
      }
    }

    if (l.isEmpty) return List();
    else {
      return divide(List(),List(),l,true);
    }
  }

  def main(args: Array[String]):Unit = {
    val list1 = List()
    val list2 = List(22)
    val list3 = List(1, 2, 3)
    val list4 = List(1, 2, 3, 4)
    val list5 = List(1, 2, 3, 4, 5)
    val list6 = List(1, 2, 3, 4, 5, 6)

    println(swapPair(list1) == List())
    println(swapPair(list2) == List(22))
    println(swapPair(list3) == List(2, 1, 3))
    println(swapPair(list4) == List(2, 1, 4, 3))
    println(swapPair(list5) == List(2, 1, 4, 3, 5))
    println(swapPair(list6) == List(2, 1, 4, 3, 6, 5))
  }
}
