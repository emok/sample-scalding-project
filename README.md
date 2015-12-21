# sample-scalding-project

This is a skeleton scalding project set up with SBT assembly, with a multi-project build. This is set up for scala 2.11, scalding 0.15.0. 

## To build

sbt assembly

## To run

hadoop jar /PATH/TO/sample-scalding-project/application/target/scala-2.11/application-assembly-0.1.jar application.WordCount --local --input input.txt --output output.txt

