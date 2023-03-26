object Quiz02_scala {
  def moreThanHalf(l1:List[Any],l2:List[Any]):Boolean ={
    def member(x:Any,l:List[Any]):Boolean = {
      if (l.isEmpty) return false;
      else if (l.head == x) return true;
      else {return member(x,l.tail);}
    }
    def func(l1:List[Any],l2:List[Any],x:Int,sum:Int):Boolean = {
      if (sum > x) return true;
      if (l1.isEmpty){
        if (sum > x) return true;
        else {return false;}
      }
      else if (member(l1.head,l2)) return func(l1.tail,l2,x,sum+1);
      else {return func(l1.tail,l2,x,sum);}
    }
    if (l1.isEmpty) return false;
    else {return func(l1,l2,l1.length/2,0)}
  }

  def main(args: Array[String]):Unit = {
    val l00 = List()
    val l01 = List()
    val l1 = List(1,4,3,2,7,8)
    val l2 = List(2,9,7,1,6,10)
    val l3 = List(12,11,6,5,3,2)
    val l4 = List("1","2","3","4","5")
    val l5 = List("9","7","5","3","1")
    val l6 = List("2","4","6","8","10")
    println(moreThanHalf(l00,l01))
    println(moreThanHalf(l1,l01))
    println(moreThanHalf(l1,l2))
    println(moreThanHalf(l1,l3))
    println(moreThanHalf(l4,l5))
    println(moreThanHalf(l4,l6))
  }
}
