import org.apache.spark.sql.SparkSession

object SparksSession {
  val spark: SparkSession = SparkSession.builder
    .appName("SparkSessionExample")
    .master("local[4]")
    .config("spark.sql.warehouse.dir", "target/spark-warehouse")
    .getOrCreate
}
