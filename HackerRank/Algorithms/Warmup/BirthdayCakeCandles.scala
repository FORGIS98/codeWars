import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

  /*
   * Complete the 'birthdayCakeCandles' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY candles as parameter.
   */

  def birthdayCakeCandles(candles: Array[Int]): Int = {
    val maxHeight: Int = candles.max
    return candles.filter(_ == maxHeight).length
  }

}

object Solution {
  def main(args: Array[String]) {

    val lista: Array[Int] = Array(1, 3, 5, 7, 3, 5, 7, 3, 7)
    Result.birthdayCakeCandles(lista)

    // val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    // val candlesCount = StdIn.readLine.trim.toInt

    // val candles = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    // val result = Result.birthdayCakeCandles(candles)

    // printWriter.println(result)

    // printWriter.close()
  }
}

