object Question09_scala {
  def turingStep(f:Char => Char,tape:List[Char], n:Int): List[Char] ={
    def func(l:List[Char] , newl:List[Char] , n:Int): List[Char] = {
      if (l.isEmpty) return newl;
      else if (n > 0) return func(l.tail,newl ++ List(f(l.head)),n-1);
      else {return func(l.tail,newl ++ List(l.head),n);}
    }
    return func(tape,List(),n);
  }

  def main(args: Array[String]):Unit = {
    val tape = List('C', 'H', 'A', 'R');
    println(turingStep((x => (x.toLower)), tape, 2));
    println(turingStep((x => (x.toLower)), tape, 3));
    println(turingStep((x => (x.toLower)), tape, 0));
    println(turingStep((x => (x.toLower)), tape, 5));
  }
}
