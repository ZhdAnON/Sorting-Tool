fun addUser(userMap: Map<String, String>, login: String, password: String): MutableMap<String, String> {
    val temp = userMap.toMutableMap()
    if (userMap.containsKey(login))
        println("User with this login is already registered!")
    else {
        temp[login] = password
    }
    return temp
}