package cl.fbd

import scalanative.native._
import scalanative.libc.stdlib._

object Main {
  def testDouble () = {
    fprintf(stdout, c"Double\n")
    
    val arr = new Array [Double] (3)

    val len = arr.length

    fprintf(stdout, c"length: %d \n", len)
    
    // assert (len == 3)

    arr (0) = 1.0
    arr (2) = 3.0

    fprintf(stdout, c"arr (0) = %f \n", arr (0))
    fprintf(stdout, c"arr (2) = %f \n", arr (2))
    
    // assert (arr (0) == 1.0)
    // assert (arr (2) == 3.0)
  }
  
  def testBoolean () = {
    fprintf(stdout, c"Boolean\n")
    
    val arr = new Array [Boolean] (3)

    val len = arr.length
    
    fprintf(stdout, c"length: %d \n", len)
    
    // assert (len == 3)

    arr (0) = true
    arr (2) = false

    fprintf(stdout, c"arr (0) = %d \n", arr (0))
    fprintf(stdout, c"arr (2) = %d \n", arr (2))
    
    // assert (arr (0) == true)
    // assert (arr (2) == false)
  }
  
  def testInt () = {
    fprintf(stdout, c"Int\n")
    
    val arr = new Array [Int] (3)

    val len = arr.length
    
    fprintf(stdout, c"length: %d \n", len)
    
    // assert (len == 3)

    arr (0) = 1
    arr (2) = 3

    fprintf(stdout, c"arr (0) = %d \n", arr (0))
    fprintf(stdout, c"arr (2) = %d \n", arr (2))
    
    // assert (arr (0) == 1)
    // assert (arr (2) == 3)
  }
  
  def main (args : Array [String]) = {
    fprintf(stdout, c"Test different array types\n")
    
    testInt ()    
    testDouble ()      
    testBoolean ()
      
    ()
  }
}
