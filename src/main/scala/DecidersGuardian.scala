import Messages.WhereShouldIGo
import akka.actor.{Actor, Props}
import akka.event.LoggingReceive

/**
  * Created by rajeevprasanna on 12/11/17.
  */
class DecidersGuardian extends Actor {
  override def receive: Receive = LoggingReceive {
    case msg:WhereShouldIGo =>
        val name = s"J${msg.junction.id}"
        val worker = context.child(name) getOrElse context.actorOf(Props(new SortingDecider), name)
        worker forward msg
  }
}
