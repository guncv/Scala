object Question01_scala {
  def insertLast(x:Any, l:List[Any]) : List[Any] ={
    return l ++ List(x);
  }

  def main(args: Array[String]):Unit = {
    println(insertLast(4,List(1,2,3,4,5,6,7)));
    println(insertLast(5,List(1,2,3,4,5,6,7)));
    println(insertLast(4,List(1,2,3,4,5,6,7).reverse));
  }
}

