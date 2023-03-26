object Question06_scala {
  def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
    def forEach(list:List[Int],new_list:List[Int]):List[Int] = {
      if (list.isEmpty) return new_list;
      else {forEach(list.tail,new_list ++ List(f(list.head)))}
    }
    return forEach(list,List());
  }

  def main(args: Array[String]):Unit = {
    println(myMap(x => x*2)(List(1,2,3,4,5,6)));
    println(myMap(x => x*x)(List(1,2,3,4,5,6)));
    println(myMap(x => x/2)(List(1,2,3,4,5,6)));
    println(myMap(x => x+1)(List(1,2,3,4,5,6)));
    println(myMap(x => x-1)(List(1,2,3,4,5,6)));
  }
}
