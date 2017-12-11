import Domain.{Container, Junction}

/**
  * Created by rajeevprasanna on 12/11/17.
  */
object Messages {
  case class Go(targetConveyor:String)
  case class WhereShouldIGo(junction: Junction, container: Container)
}
