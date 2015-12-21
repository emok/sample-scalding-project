package application

import com.twitter.scalding.Tool
import org.apache.hadoop

/**
  * Presumably for local execution (but haven't gotten this to work yet)
  */

object JobRunner {
  def main(args : Array[String]) {
    hadoop.util.ToolRunner.run(new hadoop.conf.Configuration, new Tool, args);
  }
}
