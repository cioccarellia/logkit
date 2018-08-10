<img src="https://raw.githubusercontent.com/AndreaCioccarelli/LogKit/master/icons/web.png" align="right" height="128px" width="128px" >

# LogKit
[![Min sdk](https://img.shields.io/badge/minsdk-14-yellow.svg)](https://github.com/AndreaCioccarelli/LogKit/blob/master/library/build.gradle)
[![License](https://img.shields.io/hexpm/l/plug.svg)](https://github.com/AndreaCioccarelli/CryptoPrefs/blob/master/LICENSE)

LogKit is a very small android library, made to make the logging process easy, fast and stilish to be incorporated in your code.

## Repository
LogKit uses jitpack as packages repository.
To use it you need to add the repository to your project build.gradle file:
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
And the dependency to your module build.gradle file:
```gradle
dependencies {
    implementation 'com.github.AndreaCioccarelli:LogKit:1.0.0'
}
```

## Introduction
LogKit aims to reduce at the minimum the lines of code you need to do every operation.
The default android logging kit provides the class Log, with functions like `d()`, `w()`, `e()`, `i()`.
```kotlin
val X = 107
val Y = null
Log.d("MyTag", "${String.valueOf(X)}, ${if (Y == null) "null" else String.valueOf(Y)}")
```
Instead, LogKit has condensed functions like `logd()`, `logw()`, `loge()`, `logi()`. You don't have to pass restricted String values, nor non-null values.
```kotlin
val X = 107
val Y = null
logd(X, Y)
```

## Functions Map
Fx | Documentation | Color
-- | ------------- | -----
`logd()` | Should be used in the most of the cases to print a debug message | #66BB6A
`loge()` | Should be used to log errors or exceptions | #EF5350
`logw()` | Should be used to print warnings and non-critical errors | #FFA726
`logi()` | Should be used to print information or data about the current program execution algorithm state | #00B0FF
`loga()` | Should be used to print assert details | #BA68C8

## Usage
Despite this library is small and simple, it's extremely powerful and it has many potential usages. Let's check them out

### 0x1 Types
This library can log everything you pass to the function without limitations depenting on the type.
```kotlin
val A = "Pizza"
val B = 18
val C = 0x0002
val D = Throwable("PizzaWithPineAppleException")
val E = 7.5

logd(A)
logd(B)
logd(C)
logd(D)
logd(E)
```

### 0x2 vararg input
There is a better way to do what we saw in the previous example, obtaining the same exact result.
```kotlin
logd(A, B, C, D, E)
```
Every function in this library requires a vararg argument of `Any`, and so you are allowed you to pass multiple and different types at the same function call.

### 0x3 Data types
One peculiarity of this library is that gives you the ability to log raw, pure data and to check them on the logcat. You can log lists, classes, other functions, custom types and so forth.

```kotlin
val X = listOf("House", "Wilson", "Chase", "13", "Foreman")
logd(X)
```
```log
LogKit [D]: [House, Wilson, Chase, 13, Foreman]
```

### 0x4 Nullable types
You can log nullable types. If they are null, the literal "null" is logged, else the non-null value is printed out.
```kotlin
val Y = null
logd(Y)
```
```log
LogKit [D]: null
```

### 0x5 Logging code
You can pass executable code to the function. The functions accepts an argument of type `() -> Any?`.
This is useful to group testing code in one scope
```kotlin
logd {
    val J = 18
    val K = 64
    
    max(J, K)
}
```
```log
LogKit [D]: 64
```


```kotlin
logd {
    val prefs = getSharedPreferences("general_settings", Context.MODE_PRIVATE);
    String value = prefs.getString("key", "") " value "
    value.trim() 
}
```
```log
LogKit [D]: value
```

