abstract class Notification
case class SMS(mobile:String,msg:String)extends Notification
case class Email(emailAddr:String,subject:String,body:String)extends Notification
object temp{

def showNotification(notification: Notification): String={
notification match{
case Email(emailAddr,subject,body)=>
s"You got an email from $emailAddr with subject:$subject and $body"
case SMS(number,message)=>
s"You got an SMS from $number! Message: $message"
}
}

def main(args:Array[String]):Unit={
val someSms=SMS("1234","hi")
val someEmail=Email("user.s@nmit.ac.in","big data","intro to big data")
println(showNotification(someSms))
println(showNotification(someEmail))
}
}