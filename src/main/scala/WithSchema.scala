
import java.sql.Timestamp

import org.apache.spark.sql.{DataFrame, RelationalGroupedDataset}
import org.apache.spark.sql.Encoders
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.StructType

object WithSchema {

  private case class SchemaCSVCities(dateTime: Timestamp, ip: String)

  private val _path : String = ".\\src\\main\\resources\\time_and_ip.csv"
  private val _schema: StructType = Encoders.product[SchemaCSVCities].schema


  val citiesDF: DataFrame = SparksSession.spark.read
    .format("csv")
    .option("timestampFormat", "yyyy-MM-dd HH:mm:ss,SSS")
    .option("delimiter", "|")
    .option("header", "true")
    .schema(_schema)
    .csv(_path)

}
//готово
//http://blog.jaceklaskowski.pl/spark-workshop/exercises/spark-sql-exercise-Why-are-all-fields-null-when-querying-with-schema.html