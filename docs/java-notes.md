Here you go — increased font size for the **entire content** using HTML (works in most markdown viewers) 👇


---


**Java Notes**

1. **Binary Search Algorithm**

- **Explanation:**  
Binary Search is an efficient algorithm for finding an element in a sorted array. It works by repeatedly dividing the search interval in half.

- **Steps:**
1. Sort the array in ascending order.
2. Calculate the middle index: `mid = (start + end) / 2`.
3. Compare the middle element with the target:
   - If the middle element equals the target, return the index.
   - If the target is smaller, search the left half.
   - If the target is larger, search the right half.
4. Repeat until the element is found or the search interval is empty.

- **Code Example:**
```java
public int binarySearch(int[] array, int target) {
    int start = 0, end = array.length - 1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1; // Element not found
}
````

---

2. **Logging in Java**

* **SLF4J**

    * Facade for logging
    * Decouples implementation
    * Supports parameterized logging

* **Logback**

    * Modern, high-performance
    * Works seamlessly with SLF4J
    * Supports async logging

* **Log4j**

    * Older, widely used
    * Used in legacy systems

* **Recommendation:**

    * Use **SLF4J + Logback** for modern apps

---

## Ternary Operator

```java
condition ? expression1 : expression2;
```

* Short form of if-else
* Must return value

### Example

```java
int max = (a > b) ? a : b;
```

### Misuse

```java
(a > b) ? System.out.println("a") : System.out.println("b");
```

---

### More Examples

```java
// Nested
String result = (num > 0) ? ((num % 2 == 0) ? "Even" : "Odd") : "Negative";

// String
String message = isLoggedIn ? "Welcome" : "Login";

// Null check
String output = (input != null) ? input : "Default";

// Boolean
boolean isAdult = (age >= 18) ? true : false;
```

---

## 🫧 Bubble Sort

* Brute force
* Time: O(n²)
* Not for large data

### Logic

* Largest element moves to end each pass
* Ignore sorted elements in next pass

---

## 🔁 Swapping in Java

```java
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
```

</div>
```

---
