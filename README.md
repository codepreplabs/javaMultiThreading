# Java Multi-Threading Examples

A comprehensive collection of Java multi-threading and concurrency examples demonstrating core concepts and best practices.

## 📋 Overview

This is a multi-module Maven project containing practical examples of Java concurrency concepts. Each module focuses on a specific threading concept with working code examples.

## 🏗️ Project Structure

```
javaMultiThreading/
├── 01simpleThreads/              # Basic thread creation
├── 02volatileKeyword/            # Volatile keyword usage
├── 03synchronized/               # Synchronized methods
├── 04joiningThreads/             # Thread joining
├── 05stoppingThread/             # Graceful thread termination
├── 06multiplelocks/              # Multiple lock objects
├── 07threadpool/                 # Thread pool implementation
├── 08Countdownlatch/             # CountDownLatch usage
├── 10waitAndnotify/              # Wait and notify mechanism
├── 11producerconsumerUsingwaitnotify/  # Producer-consumer pattern
├── 12reenterantlock/             # ReentrantLock implementation
├── 13executorservice/            # ExecutorService with Future
├── 14deadlocks/                  # Deadlock demonstration
└── 15semaphores/                 # Semaphore usage
```

## 📚 Modules

### 01. Simple Threads
**Concept:** Basic thread creation using `Thread` class and `Runnable` interface

**Key Features:**
- Extending Thread class
- Implementing Runnable interface
- Starting and running multiple threads

**Main Classes:**
- `UsingThreadClass.java` - Demonstrates extending Thread class
- `UsingRunnable.java` - Demonstrates implementing Runnable interface

---

### 02. Volatile Keyword
**Concept:** Understanding the `volatile` keyword for thread visibility

**Key Features:**
- Ensures visibility of changes across threads
- Prevents caching of variables in thread-local memory
- Graceful thread shutdown using volatile flag

**Main Classes:**
- `VolatileDemo.java` - Demonstrates volatile keyword usage for thread control

---

### 03. Synchronized
**Concept:** Thread synchronization to prevent race conditions

**Key Features:**
- Synchronized methods
- Preventing concurrent access to shared resources
- Bank account withdrawal example demonstrating race conditions

**Main Classes:**
- `DemoSynchronized.java` - Demonstrates synchronized methods
- `Account.java` - Shared resource class

---

### 04. Joining Threads
**Concept:** Thread coordination using `join()` method

**Key Features:**
- Waiting for thread completion
- Sequential thread execution
- Thread coordination patterns

**Main Classes:**
- `JoinDemo.java` - Demonstrates thread joining for sequential execution

---

### 05. Stopping Thread
**Concept:** Graceful thread termination using flags

**Key Features:**
- Proper way to stop threads
- Avoiding deprecated `stop()` method
- User-controlled thread termination

**Main Classes:**
- `StoppingThread.java` - Demonstrates safe thread termination

---

### 06. Multiple Locks
**Concept:** Using multiple lock objects to improve concurrency

**Key Features:**
- Fine-grained locking
- Reducing lock contention
- Improving performance with multiple locks

**Main Classes:**
- `Main.java` - Demonstrates multiple lock usage
- `Processor.java` - Worker class with multiple synchronized blocks

---

### 07. Thread Pool
**Concept:** Thread pool implementation using `ExecutorService`

**Key Features:**
- Fixed thread pool creation
- Task submission and execution
- Efficient resource management
- Executor shutdown

**Main Classes:**
- `Main.java` - Demonstrates thread pool with ExecutorService
- `Processor.java` - Task implementation

---

### 08. CountDownLatch
**Concept:** Synchronization aid for waiting on multiple threads

**Key Features:**
- Waiting for multiple services to start
- Countdown mechanism
- Application bootstrap coordination

**Main Classes:**
- `Main.java` - Demonstrates service startup coordination
- `Service.java` - Service simulation with startup time

---

### 10. Wait and Notify
**Concept:** Inter-thread communication using `wait()` and `notify()`

**Key Features:**
- Thread communication mechanism
- Producer-consumer coordination
- Object-level locking

**Main Classes:**
- `DemoWaitAndNotify.java` - Main coordination class
- `Producer.java` - Producer thread implementation
- `Consumer.java` - Consumer thread implementation

---

### 11. Producer-Consumer Using Wait/Notify
**Concept:** Classic producer-consumer pattern implementation

**Key Features:**
- Bounded buffer implementation
- Thread-safe queue operations
- Producer-consumer coordination with wait/notify

**Main Classes:**
- `DemoProducerConsumer.java` - Main coordination class
- `Producer.java` - Produces items to shared queue
- `Consumer.java` - Consumes items from shared queue

---

### 12. ReentrantLock
**Concept:** Explicit locking using `ReentrantLock` and `Condition`

**Key Features:**
- More flexible than synchronized
- Condition variables for signaling
- Try-lock and timed-lock capabilities

**Main Classes:**
- `DemoWaitAndNotify.java` - Demonstrates ReentrantLock usage
- `Producer.java` - Producer with ReentrantLock
- `Consumer.java` - Consumer with ReentrantLock

---

### 13. ExecutorService
**Concept:** Advanced ExecutorService with `Future` and `Callable`

**Key Features:**
- Callable interface for return values
- Future object for result retrieval
- Asynchronous computation handling

**Main Classes:**
- `ExecutorServiceDemo.java` - Demonstrates Future with ExecutorService
- `SleepTask.java` - Callable task implementation

---

### 14. Deadlocks
**Concept:** Deadlock demonstration and understanding

**Key Features:**
- Circular dependency of locks
- Deadlock scenario creation
- Understanding deadlock conditions

**Main Classes:**
- `DemoDeadLocks.java` - Main demonstration class
- `Runner.java` - Contains methods that can deadlock
- `Account.java` - Shared resource

---

### 15. Semaphores
**Concept:** Controlling access to resources using `Semaphore`

**Key Features:**
- Limiting concurrent access
- Connection pool simulation
- Permit-based resource management

**Main Classes:**
- `App.java` - Demonstrates semaphore usage
- `Connection.java` - Singleton with semaphore-controlled access

---

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- Maven 3.x or higher

### Building the Project

```bash
# Clone the repository
cd javaMultiThreading

# Build all modules
mvn clean install

# Build specific module
cd 01simpleThreads
mvn clean package
```

### Running Examples

```bash
# Navigate to specific module
cd 01simpleThreads

# Run the example
java -cp target/01simpleThreads-0.0.1-SNAPSHOT.jar com.codepreplabs.usingthread.UsingThreadClass
```

Or run directly from your IDE by executing the main class of each module.

## 📖 Learning Path

For beginners, it's recommended to follow the modules in order:

1. **Start with basics:** Modules 01-05 cover fundamental threading concepts
2. **Synchronization:** Modules 03, 06, and 10-12 cover various synchronization techniques
3. **Executor Framework:** Modules 07, 08, 13 introduce the executor framework
4. **Advanced Topics:** Modules 14-15 cover common concurrency issues and solutions

## 🎯 Key Concepts Covered

- ✅ Thread creation and lifecycle
- ✅ Thread synchronization (synchronized, locks)
- ✅ Volatile keyword and memory visibility
- ✅ Inter-thread communication (wait/notify)
- ✅ Thread pools and ExecutorService
- ✅ Concurrency utilities (CountDownLatch, Semaphore)
- ✅ Deadlocks and how to avoid them
- ✅ Producer-Consumer pattern
- ✅ Future and Callable

## 🛠️ Technologies Used

- Java
- Maven
- JUnit (for testing)

## 📝 Notes

- Each module is self-contained with its own `pom.xml`
- All examples include practical scenarios and working code
- Code follows Java best practices for multi-threading

## 🤝 Contributing

Feel free to fork this repository and add more examples or improve existing ones.

## 📄 License

This project is open source and available under the MIT License.

## 👨‍💻 Author

Created for learning and teaching Java multi-threading concepts.

---

**Happy Threading! 🧵**
