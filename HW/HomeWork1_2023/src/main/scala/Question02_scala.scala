object Question02_scala {
  def insertInOrder(x:Int, list:List[Int]):List[Int] = {

    def func(x:Int,l:List[Int],newl:List[Int],b:Boolean):List[Int] = {
      if (l.isEmpty){
        if (b) {
          return newl ++ List(x);
        } else {
          return newl;
        }
      } else if (x < l.head && b){
        return func(x,l.tail,newl ++ List(x,l.head),!b)
      } else {
        return func(x,l.tail,newl ++ List(l.head),b);
      }
    }

    if (list.isEmpty){
      return List(x);
    } else{
      return func(x,list,List(),true);
    }
  }

  def main(args: Array[String]):Unit = {
    println(insertInOrder(1,List()));
    println(insertInOrder(2,List(3)));
    println(insertInOrder(3,List(1,2,3,4,5,6,6,7,8)));
    println(insertInOrder(3,List(1,1,1,1,1,1,1,1,1)));
    println(insertInOrder(3,List(2,2,2,7,8,9,9,9,9)));
    println(insertInOrder(9,List(2,2,3,4,5,6,6,7,8)));
  }
}
