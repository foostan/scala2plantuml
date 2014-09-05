trait Car {
  val body: Body
  val engine: Engine
  val tires: List[Tire]

}

trait SuperCar extends Car {
  val jetEngine: JetEngine
}

trait Body {
}

trait Engine {
}

trait JetEngine extends Engine {
}

trait Tire {
}
