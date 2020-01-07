import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.concat_ws

object ConverterArraysToString {
  import SparkSessions.spark.implicits._
  private val _words: DataFrame = Seq(Array("hello", "world")).toDF("words")

  val result: DataFrame = _words
    .withColumn("solution", concat_ws(" ", $"words"))

}
//готово
//http://blog.jaceklaskowski.pl/spark-workshop/exercises/spark-sql-exercise-Converting-Arrays-of-Strings-to-String.html
