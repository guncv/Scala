object Question07_scala {
  def myFilter(f:Int => Boolean) (list:List[Int]) :List[Int] = {
    def checkList(l:List[Int],newl:List[Int]):List[Int] = {
      if (l.isEmpty) return newl;
      else if (f(l.head)) return checkList(l.tail,newl ++ List(l.head));
      else {return checkList(l.tail,newl);}
    }
    return checkList(list,List());
  }

  def main(args: Array[String]):Unit = {
    println(myFilter(x => x%2 == 0)(List(1,2,3,4,5,6,7,8)));
    println(myFilter(x => x%2 != 0)(List(1,2,3,4,5,6,7,8)));
    println(myFilter(x => x<3)(List(1,2,3,4,5,6,7,8)));
    println(myFilter(x => x>=3)(List(1,2,3,4,5,6,7,8)));
    println(myFilter(x => x/2 > 2)(List(1,2,3,4,5,6,7,8)));
  }
}
