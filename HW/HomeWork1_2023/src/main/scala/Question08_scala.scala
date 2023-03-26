object Question08_scala {
  def sumAll(lists:List[List[Int]]):List[Int] = {
    def check(lists:List[List[Int]]):Boolean = {
      if (lists.isEmpty) return true;
      else if (lists.head.isEmpty) {return check(lists.tail);}
      else {return false;}
    }
    def sumAll2(lists:List[List[Int]],list:List[Int],n:Int,x:Int,sum:Int):List[Int] = {
      if (x == n){
        if (check(lists)) {return list ++ List(sum);}
        else {return sumAll2(lists,list ++ List(sum),n,0,0);}
      } else {
        if ((lists.head).isEmpty) return sumAll2(lists.tail ++ List(lists.head),list,n,x+1,sum);
        else {return sumAll2(lists.tail ++ List(lists.head.tail),list,n,x+1,sum+(lists.head).head);}
      }
    }
    if (check(lists)) return List();
    else {return sumAll2(lists,List(),lists.length,0,0);}
  }

  def main(args: Array[String]):Unit = {
    println(sumAll(List()));
    println(sumAll(List(List())));
    println(sumAll(List(List(1, 2, 3, 4), List(), List(4, 5), List(1, 2, 3, 4, 5, 6))));
    println(sumAll(List(List(3, 4), List(1, 2, 3, 4, 5, 6), List(1, 2, 3, 4))));
    println(sumAll(List(List(1, 2, 3, 4, 5, 6), List(1, 2, 3, 4), List(1, 2), List(0, 0, 0, 0, 0, 0, 0, 0, 9))));
  }
}
