object Q2 {
  def countLetterOccurrences(words: List[String]): Int = {
    // Step 1: Transform words into their respective lengths using the map function
    val wordLengths = words.map(word => word.length)

    // Step 2: Calculate the total count of letter occurrences using the reduce function
    val totalLetterCount = wordLengths.reduce((a, b) => a + b)

    totalLetterCount
  }

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val letterCount = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $letterCount")
  }
}
