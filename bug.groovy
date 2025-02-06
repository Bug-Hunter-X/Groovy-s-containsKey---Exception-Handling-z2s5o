```groovy
def myMethod(Map map) {
  if (map.containsKey("key")) {
    println map["key"]
  } else {
    println "Key not found"
  }
}

myMethod([:]) //This will cause an exception
```