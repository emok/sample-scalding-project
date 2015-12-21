package application

import cascading.flow.FlowDef
import com.twitter.scalding._

class WordCount(args : Args) extends Job(args) {

  // for Stats / counters
  implicit val uid = UniqueID.getIDFor
  val flow: FlowDef = implicitly[FlowDef]

  TypedPipe.from(TextLine(args("input")))
    .flatMap { line => line.split("""\s+""") }
    .groupBy { word => word }
    .size
    .write(TypedTsv(args("output")))

}