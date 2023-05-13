package functionsPack
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.nio.file.Paths
import java.io.FileWriter

fun testFunc2() {
	println("testing functions from package")
}

fun outputDateTime() {
	val current = LocalDateTime.now()
	println("The current date and time is: $current")

	// below is how to format similar to Python
	val grabDate = DateTimeFormatter.ofPattern("yyyy-MM-dd")
	val grabTime = DateTimeFormatter.ofPattern("HH:mm:ss")
	val curDt = current.format(grabDate)
	val curTm = current.format(grabTime)

	println("The current date is: $curDt and the current time is: $curTm")
}

fun checkForFile() {
	// use this to check if startup file has been made and if not, create on
	val path = System.getProperty("user.dir")
	println("Working directory using System.getProperty is: $path")

	val path2 = Paths.get("").toAbsolutePath().toString()
	println("Working Directory using Paths.get with abs is: $path2")
}

fun checkForFile2() {
	val filePath = "D:\\IntellijKotlinProjects\\time_keeper\\time_keeper\\src\\main\\kotlin\\appSpec\\output.txt" //
	// Replace with your desired file path
	val text = "File has been created" // Replace with the text you want to write

	try {
		val fileWriter = FileWriter(filePath)
		fileWriter.write(text)
		fileWriter.close()
		println("Text written to $filePath successfully.")
	} catch (e: Exception) {
		println("An error occurred while writing to the file: ${e.message}")
	}
}

