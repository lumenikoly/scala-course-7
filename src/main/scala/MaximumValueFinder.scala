import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object MaximumValueFinder {
  import SparkSessions.spark.implicits._
  private val _nums: DataFrame = SparkSessions.spark.range(5).withColumn("group", 'id % 2)

  val result: DataFrame = _nums
    .groupBy("group")
    .max("id")

}
//готово
//http://blog.jaceklaskowski.pl/spark-workshop/exercises/spark-sql-exercise-Finding-maximum-values-per-group-groupBy.html
