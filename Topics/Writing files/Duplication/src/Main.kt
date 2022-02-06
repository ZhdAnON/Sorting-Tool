    val fileName = "MyFile.txt"
    val text = readLine()!!
    val myFile = File(fileName)
    myFile.writeText(text)
    myFile.appendText(text)