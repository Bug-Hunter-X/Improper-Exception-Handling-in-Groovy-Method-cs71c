```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null // This handles null input correctly
  }

  // ... some code that might throw an exception ...
  try {
    return a + b 
  } catch (Exception e) {
    // This is where the problem lies. It's missing handling
    // for specific exceptions and returning informative error messages.
    println "An error occurred: "+ e.getMessage() //Prints message, but doesn't stop the flow of the program
    return null //Returning null is not always the best solution here
  }
}

println myMethod(5, null)
println myMethod(5, 10)
println myMethod(null, 10)
println myMethod("hello", " world")
```