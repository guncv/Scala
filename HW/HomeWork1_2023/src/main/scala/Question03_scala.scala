object Question03_scala {
  def subList(l1:List[Any], l2:List[Any]):Boolean = {
    def member(x: Any, l2: List[Any]): Boolean = {
      if (l2.isEmpty) return false;
      else if (l2.head == x) return true;
      else {
        return member(x, l2.tail);
      }
    }
    if (l1.isEmpty) return true;
    else if (member(l1.head,l2)) return subList(l1.tail,l2);
    else {return false;}
  }

  def main(args: Array[String]):Unit = {
    println(subList(List(1,3,5,2),List(1,2,3,4,5,6,7,8)));
    println(subList(List(1,3,5,9),List(1,2,3,4,5,6,7,8)));
    println(subList(List(),List(1,2,3,4,5,6,7,8)));
    println(subList(List(1,3,5,2),List(1,2,3)));
    println(subList(List(1,3,5,2,2,2,6,6),List(1,2,3,4,5,6,7,8)));
  }
}
