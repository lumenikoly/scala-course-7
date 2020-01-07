
object Main extends App {

  import org.apache.log4j.PropertyConfigurator
  val log4jConfPath = ".\\src\\main\\resources\\log4j.properties"
  PropertyConfigurator.configure(log4jConfPath)

  WithSchema.citiesDF.show()
  MaximumValueFinder.result.show()
  CSVDataSource.gradesDF.show()
  ConverterArraysToString.result.show()
  AddColumn.result.show()


}
