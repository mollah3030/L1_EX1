fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    val primes = mutableListOf<Int>()
    var num = 2
    while (primes.size < 50) {
        if (isPrime(num)) {
            primes.add(num)
        }
        num++
    }

    println("First 50 prime numbers:")
    println(primes)

    val evens = mutableListOf<Int>()
    var even = 2
    while (evens.size < 50) {
        evens.add(even)
        even += 2
    }

    println("First 50 even numbers:")
    println(evens)

    val combined = primes + evens
    println("Combined list of primes and even numbers:")
    println(combined)
}


