import org.apache.spark.sql.{DataFrame, RelationalGroupedDataset}
import org.apache.spark.sql.functions._

object AddColumn {
  import SparksSession.spark.implicits._
  private val _data: DataFrame = Seq(
    (0, "2016-01-1"),
    (1, "2016-02-2"),
    (2, "2016-03-22"),
    (3, "2016-04-25"),
    (4, "2016-05-21"),
    (5, "2016-06-1"),
    (6, "2016-03-21")
  ).toDF("number_of_days", "date")

  val result: DataFrame = _data.withColumn("future", expr("date_add(date, number_of_days)"))

}
//готово
//http://blog.jaceklaskowski.pl/spark-workshop/exercises/spark-sql-exercise-How-to-add-days-as-values-of-a-column-to-date.html