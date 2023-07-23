import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, current_date, date_format}

object DateFunctions {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[*]").appName("DateFunctions").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    val date1 = spark.sql("""select current_date(),current_timeStamp()""")
    val date2 = spark.sql("""select date_format(date '2022-12-11', 'L') as month""")
    val date3 = spark.sql("""select date_format(date '2022-12-11', 'M') as month""")
    val date4 = spark.sql("""select date_format( '2022-12-11', 'M') as month""")

    // padding with zero 'MM' or 'LL'
    val date5 = spark.sql("""select date_format('2022-5-6', 'MM') as month """)
    val date6 = spark.sql("""select date_format('2022-9-6', 'LL') as month """)

    date2.show(false)
    date3.show(false)
    date4.show(false)
    date5.show(false)
    date6.show(false)

    // current_date(), date_format()
    import spark.implicits._
    val df = Seq("2022-10-11").toDF("date")
    val df2 = df.select($"date", current_date(), date_format($"date", "d-M-yy").alias("date_format"))
    df2.show(false)
    // using date_format we can achieve any type of format in date, but it shoul be in "yyyy-MM-dd"
    val df3 = Seq("2021-9-25").toDF("date")
    val df4 = df3.select(col("date"), date_format($"date", "dd-MM-yyyy").alias("changed_date_format"))
    df4.show(false)
    // using date_format converting to "d-m-yy"
    val df5 = df3.select(date_format($"date", "d-M-yy"))
    df5.show()
    //Using date_format() and converting to "dd-MM"
    val df6 = df3.select(df3("date"), date_format($"date", "dd-MM") as "diff_date_format")
    df6.show()
    // Using date_format() converting to "yy-MM"
    val df7 = df6.select(df3("date"), date_format($"date", "yy-MM"))
    df7.show()
    // Using date_format() and converting to "yy/MM"
    val df8 = df3.select($"date", date_format($"date", "yy/MM"))
    df8.show()
    // Using date_format() and converting to "yyyy/MM/dd"
    val df9 = df3.select($"date", date_format($"date", "yyyy/MM/dd"))
    df9.show()
    // Another way of selecting columns
    val df10 = df3.select("*")
    df10.show()
    // Another way of selecting columns
    val df11 = df3.select("date")
    df11.show()


  }

}
