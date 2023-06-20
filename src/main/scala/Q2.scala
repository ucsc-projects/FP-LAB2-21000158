object Q2 {
  def main(args:Array[String]): Unit = {
    var a: Int = 2;
    var b: Int = 2;
    var c: Int = 2;
    var d: Int = 2;
    var f: Float = 4.3f;

    println("(--b*a+c*d--) = "+({b-=1;b}*a+c*{d-=1;d}))
    println("(a++) = "+{a+=1;a})
    println("(-2*(g-k)+c) = there's no variables called g and k so cannot calculate")
    println("(c=c++) = "+{c+=1;c})
    println("(c=++c*a++) = "+{{c+=1;c}*{a+1;a};c})

  }


}
