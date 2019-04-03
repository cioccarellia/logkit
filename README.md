
# LogKit
[![Jitpack](https://jitpack.io/v/AndreaCioccarelli/LogKit.svg)](https://jitpack.io/#AndreaCioccarelli/LogKit)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/601fb614156048afb9d4a5876def83d9)](https://www.codacy.com/project/cioccarelliandrea01/LogKit/dashboard)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-LogKit-green.svg?style=flat )]( https://android-arsenal.com/details/1/7073 )
[![Min sdk](https://img.shields.io/badge/minsdk-14-yellow.svg)](https://github.com/AndreaCioccarelli/LogKit/blob/master/library/build.gradle)
[![Language](https://img.shields.io/badge/language-kotlin-orange.svg)](https://github.com/AndreaCioccarelli/LogKit/blob/master/library/build.gradle)
[![License](https://img.shields.io/hexpm/l/plug.svg)](https://github.com/AndreaCioccarelli/LogKit/blob/master/LICENSE)

LogKit is a very small android library, made to make logging easier, faster and stilish to be incorporated in your code.

## Repository
LogKit uses [jitpack](https://jitpack.io/#AndreaCioccarelli/LogKit) as package repository.
To use it you need to add that line to your project build.gradle file:
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
    implementation 'com.github.AndreaCioccarelli:LogKit:1.2.0'
}
```

## Introduction
LogKit aims to reduce at the minimum the lines of code you need to perform every operation.
The default android logging kit provides the class Log, with functions like `d()`, `w()`, `e()`, `i()`.
```kotlin
val X = 107
val Y = null
Log.d("MyTag", "${String.valueOf(X)}, ${if (Y == null) "null" else String.valueOf(Y)}")
```
Instead, LogKit has condensed functions like `logd()`, `logw()`, `loge()`, `logi()`. You don't have to pass restricted String values, nor non-null values, classes, lists, enums, and so on and so forth.
```kotlin
val X = 107
val Y = null
logd(X, Y)
```

## Usage
Despite this library is small and simple, it's extremely powerful and it has many potential usages. Let's check them out

### Types
This library can log everything you pass to the function without limitations depenting on the type and the nullability state (Useful both for Java and Kotlin developers).
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

### vararg input
There is a better way to do what we saw in the previous example, obtaining the same exact result.
```kotlin
logd(A, B, C, D, E)
```
Every function in this library requires a vararg argument of `Any` type, and so you are allowed you to pass multiple and different types at the same function call.



### Data types
One peculiarity of this library is that gives you the ability to log raw, pure data and to check them on the logcat. You can log literally everything that is inside your scope.

```kotlin
val X = listOf("House", "Wilson", "Chase", 13, "Foreman")
logd(X)
```
```log
LogKit [D]: [House, Wilson, Chase, 13, Foreman]
```

### Nullable types
You can log nullable types. If they are null, the literal "null" is logged, else the non-null value is printed out.
```kotlin
val Y = null
logd(Y)
```
```log
LogKit [D]: null
```

### Logging code result
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
    String value = prefs.getString("key", "") // " pizza "
    
    value.trim() 
}
```
```log
LogKit [D]: pizza
```