object Question05_scala {
  def palindrome(list: List[Any]):Boolean = {
    def reverse(list:List[Any] , newlist:List[Any]):List[Any] = {
      if (list.isEmpty) return newlist;
      else {
        return reverse(list.tail,list.head :: newlist);
      }
    }

    def checkList(l1:List[Any] , l2:List[Any]):Boolean = {
      if (l1.isEmpty || l2.isEmpty) return true;
      else if (l1.head != l2.head) return false;
      else {return checkList(l1.tail,l2.tail);}
    }
    return checkList(list,reverse(list,List()));
  }

  def main(args: Array[String]):Unit = {
    println(palindrome(List(1,2,3,4,4,3,2,1)));
    println(palindrome(List(1,2,3,4,3,2,1)));
    println(palindrome(List(1,2,3,4,4,2,1)));
    println(palindrome(List(1,2,3,4,4,3)));
    println(palindrome(List()));
    println(palindrome(List(2)));
    println(palindrome(List(1,2)));
    println(palindrome(List(1,1)));
  }
}
