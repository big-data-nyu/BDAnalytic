import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.sql.hive.orc._
import org.apache.spark.sql._

object BDAnalytic {
  def main(args: Array[String]){
    val sc = new SparkContext(new SparkConf().setAppName("Test Count"))
    val hiveContext = new org.apache.spark.sql.hive.HiveContext(sc)
    println(hiveContext.sql("select * from accident").take(10))
  }
}