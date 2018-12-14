# Fibo
A Kotlin DSL for generating recursive integers 

![alt text](https://images.spot.im/v1/production/zujjxhsqbatcwkkespos)

## Objective
The goal of the language is to generate fibonacci and other related series using the following syntax 

```
Start with 1 and 1 then follow Fibonacci rule 10 times  
```

```kotlin    
var result = `Start with` (1 And 1).
                 `Then follow`(::fibo).
                  For(10.times)
```
