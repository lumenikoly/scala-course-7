import org.apache.spark.sql.DataFrame


object CSVDataSource {
  private val _path : String = ".\\src\\main\\resources\\grades.csv"

  val gradesDF: DataFrame = SparkSessions.spark.read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv(_path)
}
//готово
//http://blog.jaceklaskowski.pl/spark-workshop/exercises/spark-sql-exercise-Using-CSV-Data-Source.html
