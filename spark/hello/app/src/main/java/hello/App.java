/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hello;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println();

        SparkSession session = SparkSession.builder().appName("Hello World").master("local").getOrCreate();
        Dataset<Row> df = session.read().csv("names.csv");

        long count = df.filter((Row r) -> r.getString(0).toLowerCase().startsWith("parham")).count();
        System.out.println(count);

        session.close();
    }
}
