
package fpscala

object e1 {
  def fib(n: Int): Int = {
  @annotation.tailrec
    def go(left: Int, right: Int, index: Int): Int = {
        if(n==0) {0} else {if(index==n) { left } else { go(right, left + right, index + 1) }}
    }
    go(0,1,0)
  }

  def main(args: Array[String]): Unit = {
    assert(fib(0)==0)
    assert(fib(1)==1)
    assert(fib(2)==1)
    assert(fib(3)==2)
    assert(fib(4)==3)
    assert(fib(5)==5)
    assert(fib(6)==8)
  }
}
