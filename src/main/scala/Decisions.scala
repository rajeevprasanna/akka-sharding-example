import Domain.{Container, Junction}

/**
  * Created by rajeevprasanna on 12/11/17.
  */
object Decisions {

  def whereShouldContainerGo(junction: Junction, container: Container):String = {
    Thread.sleep(10)
    val seed = util.Random.nextInt(10000)
    s"CVR_${junction.id}_$seed"
  }

}
