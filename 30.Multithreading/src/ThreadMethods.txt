Methods of the Thread Class:
Instance Methods:

1. start(): Starts the thread by calling its run() method.
2. run(): Contains the code to be executed by the thread. You can override this method to define thread behavior.
3. getId(): Returns the thread's ID.
4. getName(): Returns the name of the thread.
5. setName(String name): Sets the thread's name.
6. getPriority(): Returns the thread's priority.
7. setPriority(int priority): Sets the thread's priority.
8. getState(): Returns the thread's state (NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED).
9. isAlive(): Checks if the thread is still alive.
10. isDaemon(): Checks if the thread is a daemon thread.
11. setDaemon(boolean d): Marks a thread as a daemon thread.
12. interrupt(): Interrupts a thread that is sleeping, waiting, or blocked.
13. isInterrupted(): Checks if a thread has been interrupted.
14. join(): Waits for the thread to finish.
15. join(long millis): Waits for the thread to finish for the specified time in milliseconds.

Static Methods:

1. currentThread(): Returns a reference to the currently executing thread.
2. yield(): Temporarily pauses the currently executing thread to allow other threads to execute.
3. sleep(long millis): Causes the currently executing thread to sleep for the specified time.
4. activeCount(): Returns the number of active threads in the current thread's thread group.
5. dumpStack(): Prints the stack trace of the current thread.