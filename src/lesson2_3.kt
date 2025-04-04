fun main() {

    val departureTimeInHours = 9
    val departureTimeInMinutes = 39
    val travelTime = 457

    val departureTime = departureTimeInHours * 60 + departureTimeInMinutes
    //переводим время убытие в минуты
    val totalArrivalTime = departureTime + travelTime
    //общее время прибытия в минутах
    val arrivalInHours = totalArrivalTime / 60
    val  arrivalInMinutes= totalArrivalTime % 60
    println("Прибытие в $arrivalInHours:$arrivalInMinutes")
}