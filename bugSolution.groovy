```groovy
def myMethod(Map map) {
  if (map != null && !map.isEmpty() && map.containsKey("key")) {
    println map["key"]
  } else {
    println "Key not found or map is null or empty"
  }
}

myMethod([:])
myMethod(null)
myMethod(["key": "value"])
```