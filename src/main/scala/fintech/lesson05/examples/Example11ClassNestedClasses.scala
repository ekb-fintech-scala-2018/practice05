package fintech.lesson05.examples

object Example11ClassNestedClasses extends App {

  class OuterClass {
    val a = 12

    class InnerClass {
      println(a)

      def anotherMethod: String = "anotherMethod"
    }
  }

  val outerInstance = new OuterClass
  val innerInstance = new outerInstance.InnerClass

  val innerInstance2: outerInstance.InnerClass = new outerInstance.InnerClass

  val innerInstance3: OuterClass#InnerClass = new outerInstance.InnerClass

//  val innerInstance4: OuterClass#InnerClass = new OuterClass#InnerClass
}
